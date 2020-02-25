package ch10_class;

import java.awt.*;//frame

public class Test09_upcasting extends Frame {

    public Test09_upcasting() {
        super("연습1");
    }

    public static void main(String[] args) {

        Frame f = new Test09_upcasting();
        f.setSize(450, 450);
        f.setVisible(true);

    }
}