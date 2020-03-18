package ch13_awt;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Test04_graphics extends Frame {

    // inner class
    class MyWin extends WindowAdapter {

        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }

    } // class end

    // inner class end
    public Test04_graphics() {
        setTitle("제목");
        setSize(500, 500);
        setVisible(true);

        addWindowListener(new MyWin());
    }

    public void paint(Graphics g) {
        g.drawString("오늘은 불금", 30, 50);

        Font f = new Font("Dialog", Font.BOLD, 25);
        g.setFont(f);
        g.drawString("오늘은 불금", 50, 80);

        g.setFont(new Font("Dialog", Font.BOLD, 50));
        g.setColor(new Color(255, 255, 0));
        g.drawString("오늘은 불금", 30, 110);

        g.setColor(Color.blue);
        g.drawLine(50, 70, 150, 50);

        g.setColor(Color.red);
        g.drawRect(50, 80, 70, 70);

        g.setColor(Color.red);
        g.fillRect(50, 200, 50, 50);

        g.setColor(Color.blue);
        g.drawRoundRect(50, 250, 70, 70, 30, 30);

        g.setColor(Color.green);
        g.drawOval(150, 150, 50, 30);

        g.setColor(Color.red);
        g.fillOval(200, 200, 50, 30);

        g.setColor(Color.yellow);
        g.fillArc(70, 300, 60, 80, 15, 60);

        g.setColor(Color.red);
        g.fillArc(65, 305, 60, 80, 75, 300);

        int x[] = { 30, 200, 250, 400, 480, 30 };
        int y[] = { 140, 50, 70, 10, 140, 140 };

        for (int i = 0; i < y.length; i++) {
            y[i] += 100;
        }
        g.drawPolygon(x, y, x.length);

    }

    public static void main(String[] args) {
        new Test04_graphics();
    }
}