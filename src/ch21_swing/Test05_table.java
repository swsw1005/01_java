package ch21_swing;

import java.awt.event.*;
import javax.swing.*;

public class Test05_table extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = -3087874031132251519L;

    // 변수
    JTable table;

    // 생성자
    public Test05_table() {
        String cols[] = { "이름", "나이", "이메일" };
        Object data[][] = { { "갑순이", "16", "gab1@naver.com" },
                { "갑돌이", "18", "gab5@naver.com" },
                { "성춘향", "18", "choon33@naver.com" },
                { "이도령", "19", "dory77@naver.com" },
                { "김태희", "35", "kim55@naver.com" },
                { "비", "33", "ggang@naver.com" },
                { "이효리", "36", "ugogirl@naver.com" },
                { "이상순", "37", "leess@daum.net" } };

        table = new JTable(data, cols);

        JScrollPane jSPane = new JScrollPane(table);

        this.getContentPane().add(jSPane, "Center");
        setSize(500, 500);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 메소드
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // main
    public static void main(String[] args) {
        new Test05_table();
    }

}