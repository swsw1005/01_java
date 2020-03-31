package ch13_awt;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Test03_win extends Frame {

    public Test03_win() {
        setTitle("무명 inner class");
        setSize(450, 450);
        setVisible(true);

        // 이벤트 등록
        addWindowListener(new WindowAdapter() {
            // 이름없는 class
            public void windowClosing(WindowEvent we) {
                System.exit(1);
            }
        });

    }

    public static void main(String[] args) {
        new Test03_win();
    }

}