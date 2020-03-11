package ch15_event;

import java.awt.*;
import java.awt.event.*;

public class Test08_list extends Frame implements ActionListener, ItemListener {

    /**
     *
     */
    private static final long serialVersionUID = -9031776291669676250L;

    // 변수
    TextArea ta1, ta2;
    List list1;
    Label label1;

    // 생성자
    public Test08_list() {

        // 창 생성
        super("list 예제");
        setBackground(Color.gray);

        label1 = new Label("리스트박스");
        list1 = new List(3); // 항목3개 보여주는 리스트

        // 항목 추가
        list1.add("이름");
        list1.add("국어");
        list1.add("영어");
        list1.add("수학");
        list1.add("과학");

        ta1 = new TextArea("", 7, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        // 7줄 30칸 수직스크롤 only

        ta2 = new TextArea("", 7, 50, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
        // 7줄 30칸 수평스크롤 only

        // 디폴트는 borderlayout...바꿔준다.
        setLayout(new FlowLayout());

        // 항목추가
        add(label1);
        add(list1);
        add(ta1);
        add(ta2);

        addWindowListener(new WindowAdapter() {
            // 이름없는 클래스
            // 메소드 overriding
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        list1.addActionListener(this);
        list1.addItemListener(this);

        setSize(500, 500);
        setVisible(true);

    }// cons end

    // 메소드
    @Override
    public void itemStateChanged(ItemEvent ie) {

        DatePrint d = new DatePrint();
        d.sysdate();

        ta1.append("ItemEvent 발생 : " + list1.getSelectedItem() + "\t\t" + d.date
                + "\n");
    } // itemStateChanged() end

    @Override
    public void actionPerformed(ActionEvent e) {

        DatePrint d = new DatePrint();
        d.sysdate();

        ta2.append("ActionEvent 발생 : " + e.getActionCommand() + "\t" + d.date
                + "\n");
    } // actionPerformed() end

    // main
    public static void main(String[] args) {
        new Test08_list();
    }// main end

}// class end