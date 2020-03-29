package ch21_swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Test06_table extends JFrame
        implements ActionListener, MouseListener {

    /**
     *
     */
    private static final long serialVersionUID = 1191603771707545896L;

    // 변수
    JButton bu;
    JPanel pan;
    JLabel laName, laAge, laAddr;
    JTextField tfName, tfAge, tfAddr;

    String[] cols = { "이름", "나이", "주소" };

    Object data[][] = new Object[0][3];

    DefaultTableModel tmodel = new DefaultTableModel(data, cols);
    JTable jt = new JTable(tmodel);
    JScrollPane sp = new JScrollPane(jt);

    // 생성자
    public Test06_table() {
        bu = new JButton("테이블 내용 삭제");
        pan = new JPanel();
        pan.setBackground(Color.yellow);

        laName = new JLabel("이름", JLabel.RIGHT);
        laAge = new JLabel("나이", JLabel.RIGHT);
        laAddr = new JLabel("주소", JLabel.RIGHT);

        tfName = new JTextField();
        tfAge = new JTextField();
        tfAddr = new JTextField();

        pan.setLayout(new GridLayout(3, 2));

        pan.add(laName);
        pan.add(tfName);

        pan.add(laAge);
        pan.add(tfAge);

        pan.add(laAddr);
        pan.add(tfAddr);

        tfName.addActionListener(this);
        tfAge.addActionListener(this);
        tfAddr.addActionListener(this);
        bu.addActionListener(this);

        jt.addMouseListener(this);

        this.getContentPane().add(pan, "North");
        this.getContentPane().add(sp, "Center");
        this.getContentPane().add(bu, "South");

        setSize(350, 350);
        setVisible(true);
        setResizable(false);

    }

    // 메소드

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tfName) {
            tfAge.requestFocus();
        } else if (e.getSource() == tfAge) {
            tfAddr.requestFocus();
        } else if (e.getSource() == tfAddr) {
            Object temp[] = { tfName.getText(), tfAge.getText(),
                    tfAddr.getText() };
            tmodel.addRow(temp);// 행추가

            tfName.setText("");
            tfAge.setText("");
            tfAddr.setText("");

            tfName.requestFocus();
        }

        if (e.getSource() == bu) {
            tmodel.setRowCount(0);
            tfName.setText("");
            tfAge.setText("");
            tfAddr.setText("");
        }

    } // actionPerformed() end

    // 전역변수
    int row = 1;
    int col = -1;

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {

        row = jt.getSelectedRow();
        col = jt.getSelectedColumn();

        System.out.println(row + " " + col);

        String str = (String) jt.getValueAt(row, col);

        System.out.println(str);

        // 테이블 클릭 >> 입력폼에 값 보여주기
        tfName.setText((String) jt.getValueAt(row, 0));
        tfAge.setText((String) jt.getValueAt(row, 1));
        tfAddr.setText((String) jt.getValueAt(row, 2));

    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
    }

    // main
    public static void main(String[] args) {
        new Test06_table();

    }

}