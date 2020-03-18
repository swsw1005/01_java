package ch17_io;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Test13_menu extends Frame implements ActionListener {

    /**
    *
    */
    private static final long serialVersionUID = 1163212972212899115L;

    // 변수 // // // // // // // // // // ///
    TextArea ta;

    // 생성자 // // // // // // // // // // ///
    public Test13_menu() {
        setTitle("메모장");

        MenuBar mb = new MenuBar();

        Menu fileMenu = new Menu("파일"); // 파일 메뉴
        Menu fmtMenu = new Menu("서식"); // 서식 메뉴
        Menu printMenu = new Menu("인쇄"); // 인쇄 메뉴
        Menu helloMenu = new Menu("hello"); // 인쇄 메뉴

        mb.add(fileMenu);
        mb.add(fmtMenu);
        mb.add(printMenu);
        mb.add(helloMenu);

        // 새글
        MenuItem newItem = new MenuItem("새글", new MenuShortcut('N'));
        fileMenu.add(newItem);
        newItem.addActionListener(this);
        newItem.setActionCommand("new");

        // 파일 열기
        MenuItem openItem = new MenuItem("열기", new MenuShortcut('O'));
        fileMenu.add(openItem);
        openItem.addActionListener(this);
        openItem.setActionCommand("open");

        // 저장
        MenuItem saveItem = new MenuItem("저장", new MenuShortcut('S'));
        fileMenu.add(saveItem);
        saveItem.addActionListener(this);
        saveItem.setActionCommand("save");

        // 분리선
        fileMenu.addSeparator();

        // 종료
        MenuItem exiItem = new MenuItem("종료", new MenuShortcut('R'));
        fileMenu.add(exiItem);
        exiItem.addActionListener(this);
        exiItem.setActionCommand("exit");

        // 서식, 글꼴 12
        MenuItem fntItem12 = new MenuItem("글꼴12");
        fmtMenu.add(fntItem12);
        fntItem12.addActionListener(this);
        fntItem12.setActionCommand("fnt12");

        // 서식, 글꼴 16
        MenuItem fntItem16 = new MenuItem("글꼴16");
        fmtMenu.add(fntItem16);
        fntItem16.addActionListener(this);
        fntItem16.setActionCommand("fnt16");

        // 서식, 글꼴 20
        MenuItem fntItem20 = new MenuItem("글꼴20");
        fmtMenu.add(fntItem20);
        fntItem20.addActionListener(this);
        fntItem20.setActionCommand("fnt20");

        // 인쇄메뉴
        MenuItem printItem = new MenuItem("인쇄");
        printMenu.add(printItem);
        printItem.addActionListener(this);
        printItem.setActionCommand("print");

        // 텍스트 입력창
        ta = new TextArea();

        add(ta, "Center");

        setMenuBar(mb);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setBounds(20, 30, 700, 700);
        setVisible(true);
    }

    // 메소드 // // // // // // // // // // ///

    @Override
    public void actionPerformed(ActionEvent e) {

        FileDialog fd = null;

        String str = e.getActionCommand();

        if (str.equals("new")) { // ------------------------파일 열기
            ta.setText("\0"); // ta 다 지운다.
            this.setTitle("메모장");

        } else if (str.equals("open")) { // ------------------------파일 열기
            fd = new FileDialog(this, "열기", FileDialog.LOAD);
            fd.setVisible(true);
            String fn = fd.getDirectory() + fd.getFile();

            if (fn != null) {
                fileOpen(fn);
            }
        } else if (str.equals("save")) { // ------------------------파일 열기
            fd = new FileDialog(this, "저장", FileDialog.SAVE);
            fd.setVisible(true);
            String fn = fd.getDirectory() + fd.getFile();
            if (fn != null) {
                fileSave(fn);
            }
        } else if (str.equals("exit")) { // ------------------------종료
            System.exit(0);
        } else if (str.equals("fnt12")) { // ------------------------서식 12
            ta.setFont(new Font("Dialog", Font.BOLD, 12));
        } else if (str.equals("fnt16")) { // ------------------------서식 16
            ta.setFont(new Font("Dialog", Font.BOLD, 16));
        } else if (str.equals("fnt20")) { // ------------------------서식 20
            ta.setFont(new Font("Dialog", Font.BOLD, 20));
        } else if (str.equals("print")) { // ------------------------파일 열기
            PrintJob pj = getToolkit().getPrintJob(this, "인쇄", null);
        }
    } // actionPerformed() end

    // 파일 저장: 사용자 정의 메소드
    public void fileSave(String fn) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(fn)));
            String msg = ta.getText();
            out.println(msg);
            setTitle("파일이름 : " + fn);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                out.close();
            } catch (Exception ex) {
            } // inner try-catch end
        } // try-catch end
    } // fileSave() end

    // 파일 열기: 사용자 정의 메소드
    public void fileOpen(String fn) {

        BufferedReader in = null;
        ta.setText("");

        try {
            in = new BufferedReader(new FileReader(fn), 1024);
            String str = "";

            while ((str = in.readLine()) != null) { // 파일 끝이 null이 아니면 반복
                ta.append(str + "/n");
            } // while end
            setTitle("파일이름 : " + fn);

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                in.close();
            } catch (Exception ex) {
            } // inner try-catch end
        } // try-catch end
    } // fileOpen() end

    // 파일 : 사용자 정의 메소드

    // main // // // // // // // // // // ///
    public static void main(String[] args) {
        new Test13_menu();
    } // main end

} // class end