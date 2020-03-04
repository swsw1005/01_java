package ch13_awt;

import java.awt.*;
import java.awt.event.*;

import ch11_interface_abs.override;

@SuppressWarnings("serial")
public class Test02_win extends Frame {

    public Test02_win() {
        setTitle("창종료");
        setSize(450, 450);
        setVisible(true);

        addWindowListener(new MyWin());// 이벤트 등록
    }

    // inner class
    class MyWin extends WindowAdapter {

        @override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }// inner class end

    public static void main(String[] args) {
        new Test02_win();
    }

} // class end