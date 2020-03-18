package ch14_layout;

import java.awt.*;
import java.awt.event.*;

public class Test04_Layout extends Frame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 변수
    Button b1, b2, b3, b4, b5;
    Panel pNorth, pSouth;

    // 생성자

    public Test04_Layout() {

        setTitle("Flow-Border Layout");

        addWindowListener(new MyWin());

        b1 = new Button("1버튼");
        b2 = new Button("2버튼");
        b3 = new Button("3버튼");
        b4 = new Button("4버튼");
        b5 = new Button("5버튼");

        // pNorth 컨테이너에 b1, b2 넣기
        pNorth = new Panel();
        pNorth.add(b1);
        pNorth.add(b2);

        // pSouth 컨테이너에 b3, b4, b5 넣기
        pSouth = new Panel();
        pSouth.add(b3);
        pSouth.add(b4);
        pSouth.add(b5);

        this.add(pNorth, "North");
        this.add(pSouth, "South");

        setSize(500, 500);
        setVisible(true);
    } // 생성자 end

    // 메서드

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    } // inner class end

    // main
    public static void main(String[] args) {
        new Test04_Layout();
    } // main end
} // class end