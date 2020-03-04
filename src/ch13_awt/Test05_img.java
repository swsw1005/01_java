package ch13_awt;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Test05_img extends Frame {

    Image im;
    Image im2;

    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    public Test05_img() {
        setTitle("title");
        setSize(700, 900);
        setVisible(true);

        im = Toolkit.getDefaultToolkit().getImage(
                "C://Users/swsw1/OneDrive/Dev/Workspace/01_java/src/ch13_awt/dog.jpg");

        // im2 = Toolkit.getDefaultToolkit().getImage()

        addWindowListener(new MyWin());
    }

    Dimension d;

    public void paint(Graphics g) {
        // d = this.getSize();
        // int w = d.width;
        // int h = d.width;

        g.drawImage(im, 0, 0, this);
        // g.drawImage(im2, 30, 500, this);
        // TODO 상대경로

    }

    public static void main(String[] args) {
        new Test05_img();
    }

}