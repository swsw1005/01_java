package ch15_event;

import java.awt.*;
import java.awt.event.*;

public class Test03_checkbox extends Frame implements ItemListener {

    /**
     *
     */
    private static final long serialVersionUID = 1049331924612955044L;

    // 변수
    Checkbox apple, banana, orange, grape;
    Panel panel1;
    TextArea ta;

    // 생성자
    public Test03_checkbox() {

        super("checkbox 제목");

        apple = new Checkbox("사과", null, true);
        // null = 그룹이름
        banana = new Checkbox("바나나");
        orange = new Checkbox("오렌지");
        grape = new Checkbox("포도");
        ta = new TextArea();
        panel1 = new Panel();
        panel1.setBackground(Color.CYAN);

        panel1.add(apple);
        panel1.add(banana);
        panel1.add(orange);
        panel1.add(grape);

        add(panel1, "North");
        add(ta, "Center");

        addWindowListener(new MyWin());

        apple.addItemListener(this);
        banana.addItemListener(this);
        orange.addItemListener(this);
        grape.addItemListener(this);

        setSize(600, 600);
        setVisible(true);
    } // cons end

    // 메서드

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    } // inner class end

    // main
    public static void main(String[] args) {
        new Test03_checkbox();
    } // main end

    @Override // 메서드 오버라이딩
    public void itemStateChanged(ItemEvent ie) {
        Checkbox cb = (Checkbox) ie.getSource();

        if (cb.equals(apple)) {

            if (cb.getState()) { // 선택되있으면
                ta.append("apple 선택\n");
            } else { // 선택안되었을때
                ta.append("apple 해제\n");
            } // inner else end

        } else if (cb.equals(banana)) {
            if (cb.getState()) { // 선택되있으면
                ta.append("banana 선택\n");
            } else { // 선택안되었을때
                ta.append("banana 해제\n");
            } // inner else end

        } else if (cb.equals(orange)) {
            if (cb.getState()) { // 선택되있으면
                ta.append("orange 선택\n");
            } else { // 선택안되었을때
                ta.append("orange 해제\n");
            } // inner else end

        } else if (cb.equals(grape)) {
            if (cb.getState()) { // 선택되있으면
                ta.append("grape 선택\n");
            } else { // 선택안되었을때
                ta.append("grape 해제\n");
            } // inner else end

        } // outer if end

    } // itemStateChanged() end

} // class end