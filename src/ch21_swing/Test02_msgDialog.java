package ch21_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test02_msgDialog extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1864983596064055535L;

    // 변수
    JButton b1, b2, b3;

    // 생성자
    public Test02_msgDialog() {

        // 이미지 아이콘 추가
        ImageIcon icon1 = new ImageIcon("src//ch21_swing//aa.gif");
        ImageIcon icon2 = new ImageIcon("src//ch21_swing//bb.gif");
        ImageIcon icon3 = new ImageIcon("src//ch21_swing//cc.gif");
        // 버튼에 이름, 이미지아이콘 넣기
        b1 = new JButton("정보", icon1);
        b2 = new JButton("경고", icon2);
        b3 = new JButton("에러", icon3);
        // 툴팁 설정
        b1.setToolTipText("정보 대화 상자입니다.");
        b2.setToolTipText("경고 대화 상자입니다.");
        b3.setToolTipText("에러 대화 상자입니다.");
        // 레이아웃
        this.getContentPane().setLayout(new FlowLayout());
        // 레이아웃에 버튼 넣기
        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);
        // 액션리스너 설정
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        // 창크기, 보이기 옵션
        setVisible(true);
        setSize(500, 500);
        // 창닫기 설정 - 닫기버튼눌러 창 끄기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }// cons end

    // 메소드
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(this, "정보메세지");
        } else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(this, "경고메세지", "경고",
                    JOptionPane.WARNING_MESSAGE);
        } else if (e.getSource() == b3) {
            JOptionPane.showMessageDialog(this, "에러메세지", "에러",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // main
    public static void main(String[] args) {
        new Test02_msgDialog();
    } // main end
} // class end