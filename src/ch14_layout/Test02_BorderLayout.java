package ch14_layout;

import java.awt.*;
import java.awt.event.*;

public class Test02_BorderLayout extends Frame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 변수
    Button b1, b2, b3, b4, b5;

    // 생성자
    public Test02_BorderLayout() {

        setTitle("BorderLayout예제");

        b1 = new Button("1버튼");
        b2 = new Button("2버튼");
        b3 = new Button("3버튼");
        b4 = new Button("4버튼");
        b5 = new Button("5버튼");

        // 보더 방식 배열
        setLayout(new BorderLayout());
        this.add(b1, "North");
        this.add(b2, "South");
        this.add(b3, "East");
        this.add(b4, "West");
        this.add(b5, "Center");
        // 동 서 남 북 센터
        // 5가지 방식 정렬

        addWindowListener(new MyWin());

        setSize(500, 500);
        setVisible(true);

    } // cons end

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    } // inner class end

    // 메서드

    // main 메서드
    public static void main(String[] args) {
        new Test02_BorderLayout();

    }

}