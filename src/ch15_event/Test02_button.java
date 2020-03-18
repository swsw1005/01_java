package ch15_event;

import java.awt.*;
import java.awt.event.*;

public class Test02_button extends Frame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 변수
    Button bFileOpen, bFileSave, bPrint, bExit;
    Panel pNorth, pSouth;

    // 생성자
    public Test02_button() {

        setTitle("버튼 테스트");

        bFileOpen = new Button("파일열기");
        bFileSave = new Button("파일저장");
        bPrint = new Button("인쇄");
        bExit = new Button("종료");

        pNorth = new Panel();
        pSouth = new Panel();

        pNorth.setBackground(Color.yellow);
        pSouth.setBackground(Color.red);

        // 패널에 컴포넌트 추가
        pNorth.add(bFileOpen);
        pNorth.add(bFileSave);
        pNorth.add(bPrint);
        //
        pSouth.add(bExit);

        // 패널 정렬
        add(pNorth, "North");
        add(pSouth, "South");

        addWindowListener(new MyWin());

        bFileOpen.addActionListener(this);
        bFileSave.addActionListener(this);
        bPrint.addActionListener(this);
        bExit.addActionListener(this);

        setSize(600, 600);
        setVisible(true);

    } // cons ends

    // inner class
    class MyWin extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    } // inner class end

    // main
    public static void main(String[] args) {
        new Test02_button();
    } // main end

    @Override // 메소드 오버라이딩
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bFileOpen) {

            // 파일 여는 창 띄우기
            FileDialog fd = new FileDialog(this, "파일~~열기", FileDialog.LOAD);
            fd.setVisible(true);

        } else if (e.getSource() == bFileOpen) {

            // 파일저장하는 창 띄우기
            FileDialog fd = new FileDialog(this, "파일~~저장", FileDialog.SAVE);
            fd.setVisible(true);

        } else if (e.getSource() == bFileOpen) {

            PrintJob pj = getToolkit().getPrintJob(this, "인쇄", null);
            // TODO 프린트창 안뜬다.
        } else if (e.getSource() == bFileOpen) {
            System.exit(0);
        } // else if end

    } // actionPerformed() end

} // class end