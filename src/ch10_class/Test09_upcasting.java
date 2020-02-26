package ch10_class;

import java.awt.*;//frame

public class Test09_upcasting extends Frame {

    /**
     * TODO:이걸 작성하라고 quick fix 경고 뜨길래... 뭔지 모르겠다.
     */
    private static final long serialVersionUID = 1L;

    public Test09_upcasting() {
        super("연습1");
    }

    public static void main(String[] args) {

        Frame f = new Test09_upcasting();
        f.setSize(450, 450);
        f.setVisible(true);

    }
}