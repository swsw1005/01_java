package ch15_event;

//hello 입력하면

// hello 
//           by tf1   2020-03-09  13:15:55 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test01_tf_event_02 extends Frame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 변수
    TextField tf1, tf2;
    TextArea ta;

    // 생성자
    public Test01_tf_event_02() {

        setTitle("Text Field event");

        //
        tf1 = new TextField();
        tf2 = new TextField();
        ta = new TextArea();
        ta.setBackground(Color.yellow);

        this.add(tf1, "North");
        this.add(ta, "Center");
        this.add(tf2, "South");

        addWindowListener(new MyWin());

        // 액션 리스너
        tf1.addActionListener(this);
        tf2.addActionListener(this);

        setSize(500, 500);
        setVisible(true);
    }

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    } // inner class end

    //
    public void actionPerformed(ActionEvent e) {
        // tf에 입력된 내용을 ta에 올린다.
        if (e.getSource() == tf1) {

            String msg = tf1.getText().trim();

            // 날짜 가져오기
            DatePrint d = new DatePrint();
            d.sysdate();// 시스템 날짜 가져오기
            // 날짜 가져오기 end

            if (msg == "" || msg == null || msg.length() < 1) {
                JOptionPane.showMessageDialog(this, "빈 메세지 입력 금지");
                return;
            }

            ta.append(msg + "\n\t--- by tf1\t " + d.date + " \n\n");// custom***
            tf1.setText("");
            // tf2.requestFocus();// 포커스 넘겨주기 //테스트 편하게하기위한

        } else if (e.getSource() == tf2) {

            String msg = tf2.getText().trim();

            // 날짜 가져오기
            DatePrint d = new DatePrint();
            d.sysdate();// 시스템 날짜 가져오기
            // 날짜 가져오기 end

            if (msg == "" || msg == null || msg.length() < 1) {
                JOptionPane.showMessageDialog(this, "빈 메세지 입력 금지");
                return;
            }

            ta.append(msg + "\n\t--- by tf2\t " + d.date + " \n\n");// custom***
            tf2.setText("");
            // tf1.requestFocus();// 포커스 넘겨주기 //테스트 편하게하기위한

        } // if end
    }// actionPerformed end

    // main end
    public static void main(String[] args) {
        new Test01_tf_event_02();
    }// main end
}// class end