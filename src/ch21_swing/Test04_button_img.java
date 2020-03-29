package ch21_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test04_button_img extends Frame implements ActionListener {

    /**
    *
    */
    private static final long serialVersionUID = -1901629890719908087L;

    // 변수
    Image img;
    int num = 4;
    Button b[][];
    Dimension d;

    // 생성자
    public Test04_button_img() {
        b = new Button[num][num];
        setLayout(new GridLayout(num, num));
        setFont(new Font("Dialog", Font.BOLD, 72));

        int a = 1;// 버튼에 1 2 3 4 붙이려고

        // 버튼배열
        // 버튼 선언 + 배경, 글자 색상 지정 + 액션리스너까지
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                b[i][j] = new Button("" + a++);
                add(b[i][j]);
                b[i][j].setBackground(Color.blue);
                b[i][j].setForeground(Color.white);
                b[i][j].addActionListener(this);
            } // inner for end
        } // out for end

        img = Toolkit.getDefaultToolkit().getImage("src//img//background.gif");

        setSize(600, 600);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }// cons end

    // 메소드
    public void paint(Graphics g) {
        d = getSize();
        g.drawImage(img, 0, 0, d.width, d.height, this);
    } // paint() end

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                // 실행문
                if (e.getSource() == b[i][j]) {
                    int an = JOptionPane.showConfirmDialog(this, "자바 이지");
                    switch (an) {
                    case JOptionPane.YES_OPTION:
                        b[i][j].setVisible(false);
                        break;
                    case JOptionPane.NO_OPTION:
                        break;
                    default:
                        break;
                    }
                }
                // 실행문 end

            } // inner for end
        } // out for end

    }

    // main
    public static void main(String[] args) {
        new Test04_button_img();

    }

}