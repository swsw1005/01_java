package ch14_layout;

import java.awt.*;
import java.awt.event.*;

public class Test01_FlowLayout extends Frame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Button b1, b2, b3, b4, bt;

    // 생성자
    public Test01_FlowLayout() {

        super("FlowLayout 예제");

        b1 = new Button("1버튼");
        b2 = new Button("2버튼");
        b3 = new Button("3버튼");
        b4 = new Button("4버튼");
        bt = new Button("팀버튼");

        // FlowLayout 설정
        setLayout(new FlowLayout());
        // 컨테이너에 컴포넌트(b1 b2 b3... )넣기
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(bt);

        // 창크기, 창보이기 true, 닫기 버튼 위한 리스너
        addWindowListener(new MyWin());
        setSize(450, 450);
        setVisible(true);

    } // cons end

    class MyWin extends WindowAdapter {
        // 창 닫기
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    } // inner class out

    public static void main(String[] args) {
        new Test01_FlowLayout();
    } // main end

} // class end