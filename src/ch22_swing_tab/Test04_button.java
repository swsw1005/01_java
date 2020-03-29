package ch22_swing_tab;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test04_button extends Panel implements ActionListener {
	// 변수
	Image img;
	int num = 4;
	Button b[][];
	Dimension d;

	// 생성자
	public Test04_button() {
		b = new Button[num][num];
		setLayout(new GridLayout(num, num));
		setFont(new Font("Dialog", Font.BOLD, 72));

		int a = 1;// 버튼에 1,2,3,4붙이기
		for (int i = 0; i < num; i++) {// 행
			for (int j = 0; j < num; j++) {// 열
				b[i][j] = new Button("" + a++);// 후위연산
				b[i][j].setBackground(Color.green);
				b[i][j].setForeground(Color.white);
				b[i][j].addActionListener(this);
				add(b[i][j]);
			} // in for
		} // out for

		img = Toolkit.getDefaultToolkit().getImage("c:\\aa\\bb.jpg");

		setSize(600, 600);
		setVisible(true);
		/*
		 * addWindowListener(new WindowAdapter() { public void
		 * windowClosing(WindowEvent e){ System.exit(0); } });
		 */
	}// 생성자

	public void paint(Graphics g) {
		d = getSize();// 창크기
		g.drawImage(img, 0, 0, d.width, d.height, this);

	}

	// 오버라이딩
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (e.getSource() == b[i][j]) {
					int an = JOptionPane.showConfirmDialog(this,
							"장비를 정지하겠습니까?");
					switch (an) {
					case JOptionPane.YES_OPTION:
						b[i][j].setVisible(false);
						break;
					case JOptionPane.NO_OPTION:
						break;
					}// in for
				} // switch
			} // out for
		} // 1개 끝
	}// 오버라이딩
	/*
	 * public static void main(String[] args) { new Test04_button(); }//main
	 * method
	 */
}// main class
