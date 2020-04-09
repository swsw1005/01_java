package ch23_network;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class MiddleClient extends JFrame implements ActionListener, Runnable {
    // 쓰레드 상속 받지 못하니까(다중상속 불가), Runnable 인터페이스
    private static final long serialVersionUID = 5739517207670893871L;

    // 변수 ////////////////////////////////////////////////////////////
    JButton b1, b2, b3;
    JTextField tf;
    JTextArea ta;
    String name;
    private DataInputStream in;
    private DataOutputStream out;
    private Thread thread;
    JScrollPane scrollPane;
    JScrollBar scrollBar;

    // 생성자 ////////////////////////////////////////////////////////////
    public MiddleClient(String ip, int port) {

        try {
            Socket sock = new Socket(ip, port);
            in = new DataInputStream(sock.getInputStream());
            out = new DataOutputStream(sock.getOutputStream());

        } catch (Exception ex) {
            System.out.println("서버 접속 실패 : " + ex);
            System.exit(0);
        }
        // 이미지아이콘 설정
        ImageIcon icon1 = new ImageIcon("src\\ch21_swing\\aa.gif");
        ImageIcon icon2 = new ImageIcon("src\\ch21_swing\\bb.gif");
        ImageIcon icon3 = new ImageIcon("src\\ch21_swing\\cc.gif");
        // 이미지아이콘 넣어 버튼 설정
        b1 = new JButton("종료", icon1);
        b2 = new JButton("리스트", icon2);
        b3 = new JButton("색상지정", icon3);
        // 액션리스터 설정
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        // 텍스트입력창 + 액션리스너
        tf = new JTextField();
        tf.addActionListener(this);
        // 텍스트표시창
        ta = new JTextArea();
        ta.setLineWrap(true);// 내용이 많으면 자동줄바꿈
        ta.setEditable(false);// 편집못하게..

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 1)); // 3행1열 그리드layout
        p.add(b1);
        p.add(b2);
        p.add(b3);

        scrollPane = new JScrollPane(ta);// 객체생성
        // scrollBar = new JScrollBar();

        // 버튼담긴 패널은 오른쪽
        getContentPane().add(p, "East");
        // ta 내용 넘치면 스크롤바.
        getContentPane().add(scrollPane, "Center");
        // 텍스트입력창 > 아래쪽
        getContentPane().add(tf, "South");
        // 대화명 입력
        name = JOptionPane.showInputDialog(this, "당신의 대화명은?");

        thread = new Thread(this);// 스레드 생성
        thread.start();// 스레드 호출

        setSize(400, 300);
        setVisible(true);
        setResizable(false);

        tf.requestFocus();
        // 닫기버튼 동작 설정 - 창 닫기
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }// cons end

    // 메소드 ////////////////////////////////////////////////////////////
    @Override // 서버에 요청
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tf) {

            try {
                // tf 입력값 가져와서 양쪽 공백 없애고 msg초기화
                String msg = tf.getText().trim();
                if (msg.length() < 1) {
                    JOptionPane.showMessageDialog(this, "대화내용을 입력하세요");
                    tf.requestFocus();// 입력창으로 포커싱
                    return; // 아래 내용 진행막기
                } // if end

                // 서버로 보내는 과정
                out.writeUTF("[" + name + "] says..>>" + msg);
                tf.setText(""); // 보내고나서 지우기

            } catch (Exception ex2) {

                ta.append("\n\n서버로 데이터 전송중 ex2 예외발생" + ex2);
                ta.append("\n\n10초후 종료됩니다.");
                try {
                    Thread.sleep(10000);// 10초
                } catch (Exception ex3) {
                }
            }

        } else if (e.getSource() == b1) {// 종료버튼

            int answer = JOptionPane.showConfirmDialog(this, "exit really?",
                    "exit", JOptionPane.YES_NO_OPTION);
            switch (answer) {
            case JOptionPane.YES_OPTION:
                System.exit(0);
                break;
            case JOptionPane.NO_OPTION:
                break;
            }

        } else if (e.getSource() == b2) { // 대화명 리스트
        } else if (e.getSource() == b3) { // 글 색상 바꾸기
        }

    } // actionPerformed() end

    @Override // 서버가 보내준 내용 출력
    public void run() {

        try {
            while (true) {
                String str = in.readUTF();

                ta.append(str + "\n");

            }

        } catch (Exception ex1) {

            ta.append("데이터 리시빙 에러 ex1" + ex1 + "\n");
            ta.append("5초후 종료\n");
            try {
                Thread.sleep(5000);
            } catch (Exception ex2) {
            }
            System.exit(0);
        }
    } // run() end

    // main ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        new MiddleClient("192.168.137.24", 7777);
        // new MiddleClient("192.168.0.14", 7777);

    }
}