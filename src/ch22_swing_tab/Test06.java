package ch22_swing_tab;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;//DefaultTableModel

public class Test06 extends JPanel implements ActionListener, MouseListener {
	/**
	 *
	 */
	private static final long serialVersionUID = -2751642384450247872L;
	// 변수
	JButton bu;
	JPanel pa;
	JLabel laName, laAge, laAddr;
	JTextField tfName, tfAge, tfAddr;

	String cols[] = { "이름", "나이", "주소" };
	Object data[][] = new Object[0][3];

	DefaultTableModel model = new DefaultTableModel(data, cols);
	JTable table = new JTable(model);
	JScrollPane scrollpane = new JScrollPane(table);

	// 생성자
	public Test06() {
		bu = new JButton("테이블 내용 삭제");
		pa = new JPanel();
		pa.setBackground(Color.green);
		// 라밸
		laName = new JLabel("이름", JLabel.RIGHT);
		laAge = new JLabel("나이", JLabel.RIGHT);
		laAddr = new JLabel("주소", JLabel.RIGHT);
		// 텍스트필드
		tfName = new JTextField();
		tfAge = new JTextField();
		tfAddr = new JTextField();

		pa.setLayout(new GridLayout(3, 2));
		pa.add(laName);
		pa.add(tfName);

		pa.add(laAge);
		pa.add(tfAge);

		pa.add(laAddr);
		pa.add(tfAddr);
		// 이벤트 등록
		tfName.addActionListener(this);
		tfAge.addActionListener(this);
		tfAddr.addActionListener(this);
		bu.addActionListener(this);

		table.addMouseListener(this);
		// j프레임 컴포넌트
		setLayout(new BorderLayout());// 이걸로 페널을 고정시킨다.
		this.add(pa, "North");
		this.add(scrollpane, "Center");
		this.add(bu, "South");

		// 뼈대

		setSize(350, 350);
		setVisible(true);

	}// 생성자 종료

	// 오버라이딩
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfName) {
			tfAge.requestFocus();
		} else if (e.getSource() == tfAge) {
			tfAddr.requestFocus();
		} else if (e.getSource() == tfAddr) {
			Object temp[] = { tfName.getText(), tfAge.getText(),
					tfAddr.getText() };
			model.addRow(temp);

			tfName.setText("");
			tfAge.setText("");
			tfAddr.setText("");

			tfName.requestFocus();
		} // 포커스 설정

		// 모두 삭제하기
		if (e.getSource() == bu) {
			model.setRowCount(0);
		} // 모두 삭제하기 종료
	}// 오버라이딩 종료
		// 전역변수

	int row = -1;// row는 0부터 시작하므로 -1로 초기화
	int col = -1;// Column은 0부터 시작하느모 -1로 초기화

	public void mousePressed(MouseEvent me) {
		row = table.getSelectedRow();
		col = table.getSelectedColumn();

		System.out.println(row);
		System.out.println(col);

		String name = (String) table.getValueAt(row, col);
		System.out.println(name);
	}// 마우스 버튼 누름

	public void mouseReleased(MouseEvent me) {
	}// 마우스 버튼을 눌렀다 땠을때

	public void mouseClicked(MouseEvent me) {
	}// 마우스로 클릭할때

	public void mouseEntered(MouseEvent me) {
	}// 마우스 커서가 창 안으로 들어왔을때

	public void mouseExited(MouseEvent me) {
	}// 마우스 커서가 창밖으로 나갔을때
	/*
	 * public static void main(String[] args) { new Test06(); }//main method
	 */
}// main class
