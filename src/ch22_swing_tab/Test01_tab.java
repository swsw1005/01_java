package ch22_swing_tab;

//임폴트작업
import java.awt.*;
import javax.swing.*;

public class Test01_tab extends JFrame {
	// 변수
	Test02_msgDialog t1 = new Test02_msgDialog();// 2번 불러오기
	Test04_button t2 = new Test04_button();// 4번 불러오기
	Test06 t3 = new Test06();// 6번 불러오기
	JTabbedPane tab = new JTabbedPane();

	// 생성자
	public Test01_tab() {
		tab.add("다이알로그", t1);
		tab.add("이미지", t2);
		tab.add("테이블", t3);

		this.getContentPane().setLayout(new GridLayout());
		this.getContentPane().add(tab);
		this.setSize(350, 350);
		this.setVisible(true);
		// 창종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// 오버라이딩

	public static void main(String[] args) {
		new Test01_tab();
	}// main method
}// main class
