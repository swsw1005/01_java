package ch15_event;

import java.awt.*;
import java.awt.event.*;

public class Test10_scroll extends Frame implements AdjustmentListener {
    /**
     *
     */
    private static final long serialVersionUID = 7874401196168060687L;

    // 변수
    Scrollbar rsb, gsb, bsb;
    Label laRed, laGreen, laBlue, label1;
    Canvas canvas1; // 도화지 기능

    // 생성자
    public Test10_scroll() {

        super("Test10_scroll");

        setLayout(null);
        // 디자인 시작
        label1 = new Label("");
        label1.setBackground(Color.yellow);
        label1.setBounds(20, 180, 200, 40);// x y w h
        add(label1);

        laRed = new Label("빨강", Label.RIGHT);
        laGreen = new Label("초록", Label.RIGHT);
        laBlue = new Label("파랑", Label.RIGHT);

        rsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255 + 10);
        // 수평, start , 스크롤바 상자크기, min, max
        gsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255 + 10);
        bsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255 + 10);

        laRed.setBounds(20, 80, 50, 20);
        laGreen.setBounds(20, 110, 50, 20);
        laBlue.setBounds(20, 140, 50, 20);
        add(laRed);
        add(laGreen);
        add(laBlue);

        rsb.setBounds(80, 80, 250, 20);
        gsb.setBounds(80, 110, 250, 20);
        bsb.setBounds(80, 140, 250, 20);
        add(rsb);
        add(gsb);
        add(bsb);

        canvas1 = new Canvas();
        canvas1.setBackground(new Color(0, 0, 0));
        canvas1.setBounds(350, 90, 100, 100);
        add(canvas1);

        rsb.addAdjustmentListener(this);
        gsb.addAdjustmentListener(this);
        bsb.addAdjustmentListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setSize(500, 500);
        setVisible(true);
    }

    // 메서드
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int r = rsb.getValue();
        int g = gsb.getValue();
        int b = bsb.getValue();

        Color clr = new Color(r, g, b);

        canvas1.setBackground(clr);
        label1.setText("R : " + r + "  G : " + g + "  B : " + b);
    }

    // main
    public static void main(String[] args) {
        new Test10_scroll();
    }

}