package ch21_swing;

import java.awt.*; //layout 때문에
import javax.swing.*;

public class Test01_swing extends JFrame {

    /**
    *
    */
    private static final long serialVersionUID = 2324889251746405009L;

    // 변수
    JButton b1, b2, b3;

    // 생성자
    public Test01_swing() {
        this.getContentPane().setLayout(new FlowLayout());

        ImageIcon icon1 = new ImageIcon("src//ch21_swing//aa.gif");
        ImageIcon icon2 = new ImageIcon("src//ch21_swing//bb.gif");
        ImageIcon icon3 = new ImageIcon("src//ch21_swing//cc.gif");

        Image i1 = icon1.getImage();
        Image i2 = icon2.getImage();
        Image i3 = icon3.getImage();

        i1 = i1.getScaledInstance(50, 50, 1);
        i2 = i2.getScaledInstance(50, 50, 1);
        i3 = i3.getScaledInstance(50, 50, 1);

        icon1 = new ImageIcon(i1);
        icon2 = new ImageIcon(i2);
        icon3 = new ImageIcon(i3);

        b1 = new JButton("1번", icon1);
        b1.setToolTipText("첫번째 버튼입니다.");
        this.getContentPane().add(b1);

        b2 = new JButton("2번", icon2);
        b2.setToolTipText("두번째 버튼입니다.");
        this.getContentPane().add(b2);

        b3 = new JButton("3번", icon3);
        b3.setToolTipText("세번째 버튼입니다.");
        this.getContentPane().add(b3);

        setSize(500, 500);
        setVisible(true);

        // 프로그램종료. 창종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }// cons end

    // 메소드

    // main
    public static void main(String[] args) {
        new Test01_swing();

    }
}