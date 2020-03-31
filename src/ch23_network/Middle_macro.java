package ch23_network;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

// public class Middle_macro extends JFrame implements ActionListener, Runnable {
public class Middle_macro extends JFrame implements Runnable {

    // 변수 ////////////////////////////////////////////////////////////
    private DataOutputStream out;
    private Thread thread;
    JTextArea ta1, ta2;
    JScrollPane scrollPane;

    // 생성자 ////////////////////////////////////////////////////////////
    public Middle_macro(String ip, int port) {
        try {
            Socket sock = new Socket(ip, port);
            // in = new DataInputStream(sock.getInputStream());
            out = new DataOutputStream(sock.getOutputStream());
        } catch (Exception ex) {
            System.out.println("서버 접속 실패 : " + ex);
            System.exit(0);
        }
        thread = new Thread(this);// 스레드 생성
        thread.start();// 스레드 호출

        this.getContentPane().setLayout(new GridLayout(1, 2));

        ta1 = new JTextArea();
        ta1.setLineWrap(true);
        ta1.setEditable(false);// 편집못하게..
        ta1.setBackground(Color.BLACK);
        ta1.setForeground(Color.YELLOW);
        getContentPane().add(ta1);

        ta2 = new JTextArea();
        ta2.setLineWrap(true);
        ta2.setEditable(false);// 편집못하게..
        ta2.setBackground(Color.CYAN);
        ta2.setForeground(Color.BLACK);
        scrollPane = new JScrollPane(ta2);
        getContentPane().add(scrollPane);

        ta1.append("MiddleClient \n 매크로채팅봇\n");

        setSize(300, 300);
        setVisible(true);
        setResizable(false);
        // 닫기버튼 동작 설정 - 창 닫기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }// cons end

    @Override
    public void run() {
        int i = 1;
        try {

            while (true) {
                Thread.sleep(1000);
                out.writeUTF("[매크로채팅봇] says..>>" + new Date());
                ta2.append(i + " ");
                i++;
            }
        } catch (Exception ex2) {
            try {
                Thread.sleep(10000);// 10초
                ta1.append(" 매크로 채팅 에러....");
            } catch (Exception ex3) {
            }
        }
    }

    // main ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        // new MiddleClient("192.168.137.24", 7777);
        new Middle_macro("192.168.0.14", 7777);

    }

}