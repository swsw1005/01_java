package ch15_event;

import java.awt.*;

import java.awt.event.*;

public class Test05_guest extends Frame implements ActionListener {

    /**
    *
    */
    private static final long serialVersionUID = 3758621231772660556L;

    // 변수
    Button b1;
    Panel p1;
    Test06_update tupdate;

    // 생성자
    public Test05_guest() {

        super("제목제목");

        tupdate = new Test06_update();

        b1 = new Button("업데이트");
        p1 = new Panel();
        p1.add(b1);
        this.add(p1, "North");
        p1.setBackground(Color.red);

        addWindowListener(new MyWin());

        b1.addActionListener(this);

        tupdate.b1.addActionListener(this);

        setSize(600, 600);
        setVisible(true);
    }// cons ends

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
    // inner class end

    // 메소드
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            // b1 누르면
            tupdate.setVisible(true);// tupdate 프레임 띄운다.

        } else if (e.getSource() == tupdate.b1) {
            // tupdate.b1 누르면
            tupdate.dispose();// 현재 프레임만 종료한다.
            // tupdate.setVisible(false);//안보이게 한다.

        } // else if end
    } // actionPerformed() end

    //
    // main
    public static void main(String[] args) {
        new Test05_guest();
    }

}