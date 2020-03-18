package ch15_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test09_list extends Frame implements ActionListener {

    /**
    *
    */
    private static final long serialVersionUID = 1L;

    // 변수
    List list1, list2;
    Button b1, b2, b3, b4, b5;
    TextField tf;

    // 생성자
    public Test09_list() {
        super("list연습2");
        setFont(new Font("Dialog", Font.BOLD, 16));
        setDesign(); // 디자인 메서드 호출

        // 이벤트 등록
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }); // 창 닫기 end

        list1.addActionListener(this);
        list2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        tf.addActionListener(this);

        // setSize(500, 500);
        setBounds(300, 200, 450, 300);
        setVisible(true);
    } // cons end

    // 디자인 메소드 생성
    public void setDesign() {
        // list1 = new List(10, true); //다중선택된다. true 지운다
        list1 = new List(10);

        list1.add("삼성전자");
        list1.add("한미약품");
        list1.add("삼성SDI");
        list1.add("파라다이스");
        list1.add("현대자동차");
        list1.add("셀트리온");

        Panel p1 = new Panel(new BorderLayout());
        p1.add(list1, "Center");

        // list2 = new List(10, true); //다중선택된다 true
        list2 = new List(10);
        Panel p2 = new Panel(new BorderLayout());
        p2.add(list2);

        b1 = new Button(">");
        b2 = new Button(">>");
        b3 = new Button("<");
        b4 = new Button("<<");
        b5 = new Button("초기화");
        Panel p3 = new Panel(new GridLayout(5, 1, 0, 5));
        // 5행 1열, 수평여백 0 수직여백 5
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);

        tf = new TextField(20);
        Panel p4 = new Panel();
        p4.add(new Label("추가"));
        p4.add(tf);

        Panel p = new Panel();
        p.add(p1);
        p.add(p3);
        p.add(p2);

        add(p, "Center");
        add(p4, "South");

    } // setDesign() end

    // 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        String str = "";

        if (ob == tf) {

            // 공백검사
            if (tf.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "추가할 종목을 입력하세요");
                tf.requestFocus(); // tf에 포커스 설정하고
                return; // 아래내용 수정못하게 피드백
            } // inner if end

            // 중복검사
            for (int i = 0; i < list1.getItemCount(); i++) {
                if (list1.getItem(i).equals(tf.getText())) {
                    JOptionPane.showMessageDialog(this, "이미 존재 항목");
                    tf.setText(""); // tf 내용 지우기
                    tf.requestFocus(); // 포커스 요청
                    return;
                } // inner if end
            } // for end

            // 공백, 중복 검사 통과하면 처리
            list1.add(tf.getText()); //
            tf.setText("");
            tf.requestFocus();
        } // if end

        // 왼쪽꺼 오른쪽으로-----------------------
        if (ob == b1) { // 선택한 자료 옮기기
            String items[] = list1.getSelectedItems();

            // select한 아이템을 리스트2에 넣는다.
            for (int i = 0; i < items.length; i++) {

                // 중복검사
                for (int j = 0; j < list2.getItemCount(); j++) {
                    if (items[i].equals(list2.getItem(j))) {
                        // items[i]와 list2 쭉 찾은 값이 같으면
                        return; // 리턴
                    } // if end
                } // inner for end

                list2.add(items[i]);
                // list1.remove(items[i]); // 지울지 말지 상황보고 결정하자
            } // outer for end

        } // if end

        // 오른쪽에서 왼쪽으로-----------------------
        if (ob == b3) {

            String items[] = list2.getSelectedItems();

            // select한 아이템을 리스트2에 넣는다.
            for (int i = 0; i < items.length; i++) {

                // 중복검사
                for (int j = 0; j < list1.getItemCount(); j++) {
                    if (items[i].equals(list1.getItem(j))) {
                        // items[i]와 list1 쭉 찾은 값이 같으면
                        return; // 리턴
                    } // if end
                } // inner for end

                list1.add(items[i]);
                list2.remove(items[i]); // 지울지 말지 상황보고 결정하자
            } // outer for end

        } // if end

        // 왼 > 오 모두 옮기기-----------------------
        if (ob == b2) {

            String items[] = list1.getItems();
            for (int i = 0; i < items.length; i++) {
                list2.add(items[i]);
            } // for end
            list1.removeAll();

        } // if end

        // 오 > 왼 모두 옮기기-----------------------
        if (ob == b4) {

            String items[] = list2.getItems();
            for (int i = 0; i < items.length; i++) {
                list1.add(items[i]);
            } // for end
            list2.removeAll();

        } // if end

        // 초기화 : 맨처음 값으로 채운다.
        if (ob == b5) {

            list1.removeAll();
            list2.removeAll();

            list1.add("삼성전자");
            list1.add("한미약품");
            list1.add("삼성SDI");
            list1.add("파라다이스");
            list1.add("현대자동차");
            list1.add("셀트리온");

        } // if end

        if (ob == list1) {
            str = e.getActionCommand();

            // list2 중복체크 ----- 오른쪽 추가한 내용이 왼쪽에 잔류하는 경우에만
            for (int i = 0; i < list2.getItemCount(); i++) {

                if (list2.getItem(i).equals(str)) {
                    JOptionPane.showMessageDialog(this, "이미 추가 되있음");
                    return;
                }
            }
            list2.add(str);
        }

        if (ob == list2) {

        } // if end

    }

    // main
    public static void main(String[] args) {
        new Test09_list();
    }

}