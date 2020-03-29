package ch21_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test03_awt_dialog extends Frame implements ActionListener {

    /**
    *
    */
    private static final long serialVersionUID = 642014928161438107L;

    // 변수
    Button b1, b2, b3;

    // 생성자
    public Test03_awt_dialog() {
        b1 = new Button("Message");
        b2 = new Button("confirm");
        b3 = new Button("input");

        b1.setBackground(Color.blue);
        b2.setBackground(Color.cyan);
        b3.setBackground(Color.green);

        b1.setForeground(Color.white);
        b2.setForeground(Color.red);
        b3.setForeground(Color.white);

        b1.setFont(new Font("Dialog", Font.BOLD, 20));
        b2.setFont(new Font("Dialog", Font.BOLD, 20));
        b3.setFont(new Font("Dialog", Font.BOLD, 20));

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
        setSize(700, 300);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }// cons end

    // 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(this, "메세지..");
        } else if (e.getSource() == b2) {
            JOptionPane.showConfirmDialog(this, "컨펌");
        } else if (e.getSource() == b3) {
            String str = JOptionPane.showInputDialog(this, "대화명 입력하세요");
            str = "당신의 대화명은  <" + str + "> 입니다.";
            System.out.println(str);
            JOptionPane.showMessageDialog(this, str);
        } // if end
    } // actionPerformed() end

    // main
    public static void main(String[] args) {
        new Test03_awt_dialog();
    }

}