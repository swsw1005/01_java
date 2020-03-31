package ch24_network;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
import java.io.*;
import java.util.*;

/* #############################
    프로토콜
    대기실입장 100
    방 만들기 200
    방 들어가기 120
    방에서 대화하기 400
    대화명 변경 420
    귓속말 450
    나가기 290
    종료    900
  #############################
*/
public class MainClient extends JFrame
        implements Runnable, ActionListener, MouseListener {

    private static final long serialVersionUID = -3121621061064956068L;

    // 변수
    Socket s = null;
    BufferedReader in;
    OutputStream out;
    String name, ip, title = "대기실";
    // 테이블 모델 - 데이터
    Object[][] data1 = new String[0][2];
    Object[][] data2 = new String[0][1];
    Object[][] data3 = new String[0][2];
    // 테이블 모델 - 컬럼
    String[] cols1 = { "방제목", "인원" };
    String[] cols2 = { "대화명" };
    String[] cols3 = { "대화명", "위치" };

    DefaultTableModel model1 = new DefaultTableModel(data1, cols1) {
        private static final long serialVersionUID = -7033991266986456410L;

        public boolean isCellEditable(int rows, int cols) {
            return false;
        }
    };
    DefaultTableModel model2 = new DefaultTableModel(data2, cols2);
    DefaultTableModel model3 = new DefaultTableModel(data3, cols3);

    JTable table01 = new JTable(model1);
    JTable table02 = new JTable(model2);
    JTable table03 = new JTable(model3);

    JScrollPane waitroom_ScrollPane = new JScrollPane(table01);
    JScrollPane roominfo_ScrollPane = new JScrollPane(table02);
    JScrollPane waitinfo_ScrollPane = new JScrollPane(table03);

    JButton creatB = new JButton("방 만들기");
    JButton roominB = new JButton("방 입장");
    JButton exitB = new JButton("종료");

    RoomClient roomClient = new RoomClient();// 대화방

    // 생성자
    public MainClient(String ip1) {
        setTitle("MainClient 채팅");
        this.ip = ip1;

        table01.getTableHeader().setReorderingAllowed(false);// 열 순서 변경 금지
        table02.getTableHeader().setReorderingAllowed(false);// 열 순서 변경 금지
        table03.getTableHeader().setReorderingAllowed(false);// 열 순서 변경 금지

        table01.getTableHeader().setBackground(Color.yellow);
        table02.getTableHeader().setBackground(Color.cyan);
        table03.getTableHeader().setBackground(new Color(96, 207, 96));

        creatB.setBackground(new Color(85, 215, 211));
        roominB.setBackground(new Color(85, 215, 211));
        exitB.setBackground(new Color(85, 215, 211));

        creatB.setFont(new Font("Dialog", Font.BOLD, 14));
        roominB.setFont(new Font("Dialog", Font.BOLD, 14));
        exitB.setFont(new Font("Dialog", Font.BOLD, 14));

        getContentPane().setLayout(null);// 레이아웃 직접 짠다

        getContentPane().add(waitroom_ScrollPane).setBounds(10, 10, 400, 250);
        getContentPane().add(waitinfo_ScrollPane).setBounds(415, 10, 168, 250);
        getContentPane().add(roominfo_ScrollPane).setBounds(10, 270, 400, 197);

        name = JOptionPane.showInputDialog(null, "대화명 입력", "대화명 입력받는 창");

        if (name == null || name.length() < 1) {
            JOptionPane.showMessageDialog(this, "대화명 제대로 입력하세요 ^^");
        } // if

        setVisible(true);
        setSize(610, 550);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        eventUp();

    } // cons end

    // 메소드 - 사용자 정의
    public void eventUp() {

        creatB.addActionListener(this);
        roominB.addActionListener(this);
        exitB.addActionListener(this);

        table01.addMouseListener(this);

        roomClient.tf.addActionListener(this);
        roomClient.nickB.addActionListener(this);
        roomClient.sayB.addActionListener(this);
        roomClient.outB.addActionListener(this);
    }

    // 사용자 정의 메소드 - 서버 접속
    public void connectProcess() {
        try {
            s = new Socket(ip, 7777);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = s.getOutputStream();

            out.write((name + "\r\n").getBytes());// 한글 깨지지 않도록 인코딩

            new Thread(this).start();

        } catch (Exception ex) {
            System.out.println("\n서버연결 실패" + ex + "\n\n");
        }
    }

    // 메소드 - 오버라이드
    @Override
    public void run() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    // test main **********************************************************
    public static void main(String[] args) {
        new MainClient("192.168.137.54");
    }
}