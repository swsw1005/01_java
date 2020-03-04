package ch13_awt;

import java.awt.*;//frame
import java.awt.event.*; //이벤트 처리 클래스, 인터페이스

public class Test01_win extends Frame implements WindowListener {

    private static final long serialVersionUID = 1L;

    // 생성자
    public Test01_win() {
        super("창종료");
        this.addWindowListener(this);
        this.setSize(450, 450);
        this.setVisible(true);
    }// cons end

    // 오버라이딩
    // 다 쓸건 아니지만, 인터페이스는 모두 overriding 해놔야 한다.
    // 안하면 에러 남

    @Override // 창 열기 후
    public void windowOpened(WindowEvent we) {
        System.out.println("450*450");
    }

    @Override // 창
    public void windowClosing(WindowEvent we) {
        dispose();
        System.exit(0);

    }

    @Override // 창 닫기 후
    public void windowClosed(WindowEvent we) {

    }

    @Override // 창 아이콘화 할때
    public void windowIconified(WindowEvent we) {

    }

    @Override // 창을 비 아이콘화 할때
    public void windowDeiconified(WindowEvent we) {

    }

    @Override // 창 활성화 할때
    public void windowActivated(WindowEvent we) {

    }

    @Override // 창 비활성화 할때
    public void windowDeactivated(WindowEvent we) {
        dispose();
        System.exit(0);

    }

    public static void main(String[] args) {
        new Test01_win();
    }// main end

}// class end