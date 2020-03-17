package ch17_io;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Test13_menu extends Frame implements ActionListener {

    /**
    *
    */
    private static final long serialVersionUID = 1163212972212899115L;

    // 변수 ///////////////////////

    // 생성자 ///////////////////////
    public Test13_menu() {
        super("파일 쓰고 읽고 메뉴 만든다는데 일단 기본 틀만 잡아놨어요");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setSize(700, 700);
        setVisible(true);
    }

    // 메소드 ///////////////////////

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // main ///////////////////////
    public static void main(String[] args) {
        new Test13_menu();
    }// main end

} // class end