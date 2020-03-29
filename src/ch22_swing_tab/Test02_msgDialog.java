package ch22_swing_tab;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test02_msgDialog extends JPanel implements ActionListener {
	// 변수
	JButton b1, b2, b3;

	// 생성자
	public Test02_msgDialog() {

		ImageIcon icon1 = new ImageIcon("c:\\aa\\a1.gif");// 이미지 아이콘 생성
		b1 = new JButton("정보", icon1);// 이미지 아이콘 삽입
		b1.setToolTipText("정보 대화 상자입니다");// 툴팁 삽입

		ImageIcon icon2 = new ImageIcon("c:\\aa\\a2.gif");
		b2 = new JButton("경고", icon2);
		b2.setToolTipText("경고 대화 상자입니다");

		ImageIcon icon3 = new ImageIcon("c:\\aa\\a3.gif");
		b3 = new JButton("에러", icon3);
		b3.setToolTipText("에러 대화 상자입니다");
		// 이벤트 등록
		this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);// 이벤트 등록
		b2.addActionListener(this);
		b3.addActionListener(this);
		// 창 뼈대 만들기

		setSize(450, 450);
		setVisible(true);
		// 창종료

	}

	// 오버라이딩
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(this, "정보 대화 상자");
		} else if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(this, "경고 대화 상자", "경고",
					JOptionPane.WARNING_MESSAGE);
		} else if (e.getSource() == b3) {
			JOptionPane.showMessageDialog(this, "에러 대화 상자", "에러",
					JOptionPane.WARNING_MESSAGE);
		} // if문
	}// 오버라이딩
	/*
	 * public static void main(String[] args) { new Test02_msgDialog(); }//main
	 * method
	 */
}// main class
