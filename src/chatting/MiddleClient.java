package chatting;

//package ch20_network;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.*;
import javax.swing.*;

//클라이언트
public class MiddleClient extends JFrame implements ActionListener,Runnable{
	//변수
	JButton b1,b2,b3;
	JTextField tf;//대화 내용 입력란
	JTextArea ta;//대화 내용 출력 용도
	String name;//대화명 넣을 변수
	
	private DataInputStream in;
	private DataOutputStream out;
	private Thread thread;
	JScrollPane scrollPane;
	JScrollBar scrollBar;

	//생성자
	public MiddleClient(String ip,int port){
		try{
			Socket sock=new Socket(ip,port);//서버 접속
			in=new DataInputStream(sock.getInputStream());
			out=new DataOutputStream(sock.getOutputStream());
			
		}catch(Exception ex){
			System.out.println("서버 접속 실패 :"+ex);
			System.exit(0);
		}//catch
		
		ImageIcon i1=new ImageIcon("c:\\_java\\imgs\\a1.gif");
		b1=new JButton("종료",i1);
		b1.addActionListener(this);//이벤트 등록 
		
		ImageIcon i2=new ImageIcon("c:\\_java\\imgs\\a2.gif");
		b2=new JButton("리스트",i2);
		b2.addActionListener(this);//이벤트 등록 
		
		ImageIcon i3=new ImageIcon("c:\\_java\\imgs\\a3.gif");
		b3=new JButton("색상지정",i3);
		b3.addActionListener(this);//이벤트 등록 
		
		tf=new JTextField();
		tf.addActionListener(this);//이벤트 등록 
		
		ta=new JTextArea();
		ta.setLineWrap(true);//내용이 많으면 자동으로 개행 하려고
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		scrollPane=new JScrollPane(ta);
		scrollBar=scrollPane.getVerticalScrollBar();
		scrollBar.setValue(scrollBar.getMaximum());
		
		getContentPane().add(p,"East");
		getContentPane().add(scrollPane,"Center");
		getContentPane().add(tf,"South");
		
		setSize(400,300);//창크기
		setVisible(true);//창표시
		tf.requestFocus();//포커스 설정 
		
		//대화명 받기
		name=JOptionPane.showInputDialog(this,"대화명을 입력 하시요");
		
		thread=new Thread(this);
		thread.start();//준비단계, run()호출
	}//cons end

	//메서드 : 서버로 요청할때 사용할 용도
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf){
			//대화내용을 서버로 보낸다
			try{
				String msg=tf.getText().trim();
				if(msg.length()<1){
					JOptionPane.showMessageDialog(this, "대화내용을 입력하시요");
					tf.requestFocus();//포커스 설정
					return ;
				}//if
				
				//서버로 보내는 작업
				out.writeUTF("["+name+"]님의 말>>"+msg);
				tf.setText("");//지우기
				
			}catch(Exception ex){
				ta.append("서버로 데이터를 보내던중 예외 발생 :"+ex);
				ta.append("10초 후에 종료 합니다 ");
				try{
					Thread.sleep(10000);
				}catch(Exception ex2){}
				
				System.exit(0);
			}//catch
			
			
		}else if(e.getSource()==b1){//종료
			int an=JOptionPane.showConfirmDialog(this, "종료할까요","종료",JOptionPane.YES_NO_OPTION);
			switch(an){
			case JOptionPane.YES_OPTION:
				System.exit(0);
				break;
			case JOptionPane.NO_OPTION:
				break;
			}//switch
			
		}else if(e.getSource()==b2){//리스트
			//대화명 리스트
			ta.setText("");
			ta.append(name);
		}else if(e.getSource()==b3){//색상
			ta.setFont(new Font("Dialog",Font.BOLD,16));
			
			ta.setForeground(Color.blue);
			
			tf.setFont(new Font("Dialog",Font.BOLD,16));
			tf.setBackground(Color.yellow);
		}
	}//actionPerformed

	//메서드 : 서버가 보내준 내용을 처리(출력)
	public void run(){
		try{	
			while(true){
				String str=in.readUTF();
				ta.append(str+"\n");
				scrollBar.setValue(scrollBar.getMaximum());
				
			}//while
		}catch(Exception ex){
			ta.append("서버로부터 데이터를 받던중 예외 :"+ex);
			ta.append("10초 후에 종료 합니다");
			try{
				Thread.sleep(10000);
			}catch(Exception ex2){}
			
			System.exit(0);
		}//catch
	}//run

	//main
	public static void main(String[] args) {
		new MiddleClient(args[0],Integer.parseInt(args[1]));
		//                서버ip      서버port
	}//main
}//class
