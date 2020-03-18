package ch15_event;

import java.awt.*;

public class Test06_update extends Frame {

    /**
     *
     */
    private static final long serialVersionUID = -8435885611783124869L;

    // 변수
    Button b1;
    Panel p;

    // 생성자
    public Test06_update() {
        b1 = new Button("업데이트");
        p = new Panel();
        p.add(b1);
        p.setBackground(Color.green);

        add(p, "South");

        setSize(600, 600);
        // setVisible(true);

    } // cons end

    // 메소드

    // main
    // public static void main(String[] args) {
    // new Test06_update();
    // }
}
