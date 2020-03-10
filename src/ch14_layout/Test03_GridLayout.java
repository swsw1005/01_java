package ch14_layout;

import java.awt.*;
import java.awt.event.*;

public class Test03_GridLayout extends Frame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 변수

    Button b1, b2, b3, b4, b5;

    // 생성자

    public Test03_GridLayout() {

        setTitle("BorderLayout 예제");

        b1 = new Button("1버튼");
        b2 = new Button("2버튼");
        b3 = new Button("3버튼");
        b4 = new Button("4버튼");
        b5 = new Button("5버튼");

        // GridLayout 설정
        setLayout(new GridLayout(2, 4));
        this.add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5); // this 생략가능

        addWindowListener(new MyWin());

        setSize(500, 500);
        setVisible(true);
    }

    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }

    }

    // 메소드

    // main

    public static void main(String[] args) {
        new Test03_GridLayout();
    }
}