package ch09_cons;

import java.awt.*;//frame 패키지

public class Test04_cons_super extends Frame {
    // Frame 상속받았다.

    public Test04_cons_super() {

        super("연습1");// 상위클래스 생성자 호출

        setTitle(this.getTitle());
        super.setSize(450, 450);// 필요없다.
        this.setSize(450, 450);// 필요없다.

        setSize(430, 430);// 상속 받았잖아. 그냥 써도 된다.
        setVisible(true);

    }

    public static void main(String[] args) {
        new Test04_cons_super();// 바로 객체 생성

    }
}