package ch24_network;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class RoomClient extends JFrame {

    private static final long serialVersionUID = -2298663277598490273L;

    // 변수
    TextArea ta = new TextArea();
    TextField tf = new TextField();

    String data[][] = new String[0][1];
    String cols[] = { "대화명" };

    DefaultTableModel model1 = new DefaultTableModel(data, cols) {
        private static final long serialVersionUID = -5353256769983665219L;

        // 무명클래스
        // 셀 편집 못하게
        public boolean isCellEditable(int rows, int cols) {
            return false;
        }
    };

    JTable table1 = new JTable(model1); // j테이블 (model1)
    JScrollPane scrollPane = new JScrollPane(table1); // 스크롤패널(j테이블(model1))

    JLabel lab1 = new JLabel("현재 인원"); // 라벨 - 현재인원
    TextField inwon = new TextField(); // 필드 - 현재인원 표시

    JButton nickB = new JButton("닉변경"); // 버튼 - 닉변경
    JButton sayB = new JButton("귓말"); // 버튼 - 귓속말
    JButton outB = new JButton("나가기"); // 버튼 - 나가기

    // 생성자
    public RoomClient() {
        setTitle("RoomClient 대화방");
        getContentPane().setLayout(null); // 프로그래머가 직접 디자인 하려고..

        ta.setFont(new Font("Dialog", Font.BOLD, 15));
        ta.setBackground(Color.yellow);
        ta.setEditable(false); // 편집 방지
        ta.setBounds(10, 10, 600, 700);
        getContentPane().add(ta);

        tf.setBounds(10, 710, 600, 30);
        getContentPane().add(tf);

        table1.getTableHeader().setBackground(Color.CYAN);
        scrollPane.setBounds(620, 10, 150, 230);
        getContentPane().add(scrollPane);

        lab1.setBounds(620, 250, 60, 30);
        getContentPane().add(lab1);

        inwon.setBounds(690, 250, 70, 30);
        getContentPane().add(inwon);

        nickB.setBounds(620, 290, 150, 30);
        getContentPane().add(nickB);

        sayB.setBounds(620, 330, 150, 30);
        getContentPane().add(sayB);

        outB.setBounds(620, 370, 150, 30);
        getContentPane().add(outB);

        setSize(800, 800);
        setVisible(true);
        setResizable(false);
    } // cons end

    // 메소드

    // test main
    public static void main(String[] args) {
        new RoomClient();
    }

}