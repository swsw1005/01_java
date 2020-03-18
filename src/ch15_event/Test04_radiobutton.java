package ch15_event;

import java.awt.*;
import java.awt.event.*;

public class Test04_radiobutton extends Frame implements ItemListener {
    /**
     *
     */
    private static final long serialVersionUID = 5988577880596628384L;

    // 변수
    Checkbox apple, banana, orange, grape;
    CheckboxGroup checkg;
    Label l1, l2, l3;
    Panel p1, p2;

    // 생성자
    public Test04_radiobutton() {

        // 생성자 + 제목
        super("라디오버튼 예제");

        p1 = new Panel();
        p2 = new Panel();
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.LIGHT_GRAY);

        l1 = new Label("항목을 선택하세요");
        l2 = new Label("선택한 항목은 다음과 같습니다.");
        l3 = new Label("         ");

        checkg = new CheckboxGroup();
        // chechg 그룹에 넣는다
        // 그룹으로 묶여서, 하나만 동시에 true 가능
        apple = new Checkbox("사과", checkg, true);
        banana = new Checkbox("바나나", checkg, false);
        orange = new Checkbox("오렌지", checkg, false);
        grape = new Checkbox("포도", checkg, false);

        // 배치
        p1.setLayout(new GridLayout(5, 1));

        p1.add(l1);
        p1.add(apple);
        p1.add(banana);
        p1.add(orange);
        p1.add(grape);

        p2.add(l2);
        p2.add(l3);

        this.add(p1, "North");
        add(p2, "Center");

        // 닫기버튼
        addWindowListener(new MyWin());
        // .addItemListener(this);
        setSize(500, 500); // 사이즈
        setVisible(true); // 보이게

    } // cons end

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
    // inner class end

    // 메서드
    @Override
    public void itemStateChanged(ItemEvent e) {
        l3.setText(checkg.getSelectedCheckbox().getLabel());
        // TODO 라벨 변경
    }

    // main
    public static void main(String[] args) {
        new Test04_radiobutton();
    } // main end
} // class end