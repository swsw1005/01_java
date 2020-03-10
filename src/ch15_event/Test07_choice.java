package ch15_event;

import java.awt.*;
import java.awt.event.*;

public class Test07_choice extends Frame implements ItemListener {

    /**
     *
     */
    private static final long serialVersionUID = 7159497129331706884L;

    // 변수
    Choice ch;
    Label l1 = new Label("과일", Label.CENTER);

    // 생성자
    public Test07_choice() {
        super("초이스 예제");
        ch = new Choice();
        ch.addItem("사과");
        ch.addItem("바나나");
        ch.addItem("오렌지");
        ch.addItem("포도");

        l1.setForeground(Color.blue);
        l1.setFont(new Font("Dialog", Font.BOLD, 72));

        add(ch, "North");
        add(l1, "Center");

        addWindowListener(new MyWin());

        ch.addItemListener(this);

        setSize(500, 500);
        setVisible(true);

    }// cons end

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
    // inner class end

    // 메소드
    @Override
    public void itemStateChanged(ItemEvent ie) {

        String str = ch.getSelectedItem();

        if (ie.getSource() == ch) {
            l1.setText(str);

            switch (str) {
            case "사과":
                l1.setBackground(Color.red);
                break;
            //
            case "바나나":
                l1.setBackground(Color.yellow);
                break;
            //
            case "오렌지":
                l1.setBackground(Color.orange);

                break;
            //
            case "포도":
                l1.setBackground(Color.PINK);
                break;
            //

            }

        }

    } // itemStateChanged() end

    // main
    public static void main(String[] args) {
        new Test07_choice();
    }

}