package ch25_db;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

import java.sql.*;
import java.util.*;
import java.io.*;

public class GuestBook extends JFrame implements ActionListener {

    // 변수--------------------------
    JLabel laJemok, laName, laId, laEmail, laTitle, laContent;

    JTextField tfName, tfId, tfEmail, tfTitle;
    JTextArea taContent;

    JButton b_insert, b_update, b_delete, b_list, b_exit;

    Object data[][] = new Object[0][5]; // 5개 데이터가 담길 오브젝트
    String cols[] = { "이름", "ID", "EMAIL", "글제목", "글내용" };

    // 테이블모델 >> 테이블 >> 스크롤
    // DefaultTableModel model = new DefaultTableModel(data, cols);
    DefaultTableModel model = new DefaultTableModel(data, cols) {
        @Override // 테이블모델...편집
                  // 못하게
                  // 메소드
                  // 오버라이딩
        public boolean isCellEditable(int i, int c) {
            return false;
        }
    };
    JTable table = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(table);
    JScrollPane scrollPane2 = new JScrollPane(taContent);

    // 읽어서 가져올 예정
    String driver, url, user, pwd;

    Connection con = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    // 생성자 -------------------------
    public GuestBook() {
        // 프로퍼티 읽어오기
        Properties pp = new Properties();

        try {
            pp.load(new FileInputStream("src\\ch25_db\\MySqlDB.properties"));
        } catch (Exception ex) {
            System.out.println("파일 읽기 오류 " + ex);
        }

        String driver = pp.getProperty("driver");
        String url = pp.getProperty("url");
        String user = pp.getProperty("user");
        String pwd = pp.getProperty("pwd");
        // 프로퍼티 ok

        laJemok = new JLabel("GuestBook");
        laJemok.setFont(new Font("굴림체", Font.BOLD, 30));
        laJemok.setForeground(Color.RED);

        laName = new JLabel("이름", JLabel.RIGHT);
        laId = new JLabel("ID", JLabel.RIGHT);
        laEmail = new JLabel("이메일", JLabel.RIGHT);
        laTitle = new JLabel("글제목", JLabel.RIGHT);
        laContent = new JLabel("글내용", JLabel.RIGHT);

        laName.setFont(new Font("굴림체", Font.PLAIN, 20));
        laId.setFont(new Font("굴림체", Font.PLAIN, 20));
        laEmail.setFont(new Font("굴림체", Font.PLAIN, 20));
        laTitle.setFont(new Font("굴림체", Font.PLAIN, 20));
        laContent.setFont(new Font("굴림체", Font.PLAIN, 20));

        laName.setForeground(Color.yellow);
        laId.setForeground(Color.yellow);
        laEmail.setForeground(Color.yellow);
        laTitle.setForeground(Color.yellow);
        laContent.setForeground(Color.yellow);

        tfName = new JTextField();
        tfId = new JTextField();
        tfEmail = new JTextField();
        tfTitle = new JTextField();
        taContent = new JTextArea();

        b_insert = new JButton("insert");
        b_update = new JButton("update");
        b_list = new JButton("list");
        b_delete = new JButton("delete");
        b_exit = new JButton("exit");

        getContentPane().setLayout(null); // 직접 디자인.....

        laJemok.setBounds(150, 30, 250, 30);
        laName.setBounds(80, 70, 70, 30);
        laId.setBounds(80, 100, 70, 30);
        laEmail.setBounds(80, 130, 70, 30);
        laTitle.setBounds(80, 160, 70, 30);
        laContent.setBounds(80, 190, 70, 30);

        scrollPane.setBounds(10, 350, 660, 285);

        tfName.setBounds(170, 70, 200, 28);
        tfId.setBounds(170, 100, 200, 28);
        tfEmail.setBounds(170, 130, 200, 28);
        tfTitle.setBounds(170, 160, 200, 28);
        taContent.setBounds(170, 190, 200, 130);
        // scrollPane2.setBounds(170, 190, 200, 130);
        taContent.setLineWrap(true);

        b_insert.setBounds(400, 50, 100, 40);
        b_update.setBounds(400, 100, 100, 40);
        b_list.setBounds(400, 150, 100, 40);
        b_delete.setBounds(400, 200, 100, 40);
        b_exit.setBounds(400, 250, 100, 40);

        getContentPane().add(laJemok);
        getContentPane().add(laName);
        getContentPane().add(laId);
        getContentPane().add(laEmail);
        getContentPane().add(laTitle);
        getContentPane().add(laContent);

        getContentPane().add(tfName);
        getContentPane().add(tfId);
        getContentPane().add(tfEmail);
        getContentPane().add(tfTitle);
        getContentPane().add(taContent);
        getContentPane().setBackground(Color.darkGray);

        getContentPane().add(b_insert);
        getContentPane().add(b_update);
        getContentPane().add(b_list);
        getContentPane().add(b_delete);
        getContentPane().add(b_exit);

        getContentPane().add(scrollPane);
        getContentPane().add(scrollPane2);
        table.getTableHeader().setReorderingAllowed(false); // 이동 불가
        table.getTableHeader().setResizingAllowed(false); // 크기 조절 불가

        // 테이블 너비 설정
        TableColumn tc = table.getColumnModel().getColumn(0);
        tc.setMaxWidth(70);
        tc.setMinWidth(70);
        tc = table.getColumnModel().getColumn(1);
        tc.setMaxWidth(80);
        tc.setMinWidth(80);
        tc = table.getColumnModel().getColumn(2);
        tc.setMaxWidth(130);
        tc.setMinWidth(140);

        b_insert.addActionListener(this);
        b_update.addActionListener(this);
        b_list.addActionListener(this);
        b_delete.addActionListener(this);
        b_exit.addActionListener(this);

        table.addMouseListener(new MyMouse()); // inner class로 마우스이벤트

        setTitle("게스트북이라 부르는 모종의 프로그램");
        setVisible(true);
        setSize(700, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        taContent.setBackground(Color.CYAN);

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex1) {
            ex1.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("DB Connection OK");
            stmt = con.createStatement();
        } catch (SQLException ex2) {
            System.out.println("DB Conn FAIL !!!! check DRIVER!!!");
        } // t-c end

        disp();// 시작하면서 바로 리스트 호출

    }// cons end

    int row = 0; // 행을 담을 변수
    String val = ""; // 값을 담을 변수

    class MyMouse extends MouseAdapter {
        // extends MouseAdapter : 프레스 하나만 쓰려면 이쪽이 편하다
        // implements MouseListener : 모든 마우스이벤트 오버라이딩....코드가 길다
        public void mousePressed(MouseEvent me) {
            row = table.getSelectedRow();
            val = (String) model.getValueAt(row, 1);

            String temp[] = new String[table.getColumnCount()];
            int cRow = table.getSelectedRow();
            for (int i = 0; i < temp.length; i++) {
                temp[i] = (String) table.getValueAt(cRow, i);
            }

            for (int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
            System.out.println();

            tfName.setText(temp[0]);
            tfId.setText(temp[1]);
            tfEmail.setText(temp[2]);
            tfTitle.setText(temp[3]);
            taContent.setText(temp[4]);

        }
    }// innerclass end

    // 메소드-------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {

        // b_exit 종료버튼
        if (e.getSource() == b_exit) {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception ex) {

            }
        }
        // b_insert ---------------------------------------
        if (e.getSource() == b_insert) {
            // 값 가져오기
            String name = tfName.getText().trim();
            String id = tfId.getText().trim();
            String email = tfEmail.getText().trim();
            String title = tfTitle.getText().trim();
            String content = taContent.getText();
            // 빈칸은 거르는 로직
            if (name.equals("") || name.length() < 2) {
                JOptionPane.showMessageDialog(this, "name 입력하세여");
                tfName.requestFocus();
                return;
            }
            if (id.equals("") || id.length() < 2) {
                JOptionPane.showMessageDialog(this, "id 입력하세여");
                tfId.requestFocus();
                return;
            }
            if (email.equals("") || email.length() < 2) {
                JOptionPane.showMessageDialog(this, "email 입력하세여");
                tfEmail.requestFocus();
                return;
            }
            if (title.equals("") || title.length() < 2) {
                JOptionPane.showMessageDialog(this, "title 입력하세여");
                tfTitle.requestFocus();
                return;
            }
            if (content.equals("") || content.length() < 2) {
                JOptionPane.showMessageDialog(this, "content 입력하세여");
                taContent.requestFocus();
                return;
            }
            // 데이터에 insert 로직
            String str_query = "insert into guest values ('" + name + "','" + id
                    + "','" + email + "','" + title + "','" + content + "')";

            str_query = "insert into guest values(?,?,?,?,?)";
            try {
                pstmt = con.prepareStatement(str_query);
                pstmt.setString(1, name);
                pstmt.setString(2, id);
                pstmt.setString(3, email);
                pstmt.setString(4, title);
                pstmt.setString(5, content);

            } catch (SQLException e1) {
                System.out.println("pstmt 하다가 오류...");
                e1.printStackTrace();
            }

            try {
                // stmt.executeUpdate(str_query);
                pstmt.executeUpdate();
                System.out.println("insert OK");
                tfName.setText("");
                tfId.setText("");
                tfEmail.setText("");
                tfTitle.setText("");
                taContent.setText("");

                pstmt.close();

            } catch (SQLException ex) {
                System.out.println("insert 하다가 오류  " + ex);
            }
            disp();
            tfName.requestFocus();
        }

        // b_update ---------------------------------------
        if (e.getSource() == b_update) {
        }

        // b_list ---------------------------------------
        if (e.getSource() == b_list) {
            disp();
        }

        // b_delete ---------------------------------------
        if (e.getSource() == b_delete) {
        }

    }

    private void disp() {
        model.setRowCount(0); // 초기화
        try {
            rs = stmt.executeQuery("select * from guest");
            while (rs.next()) {
                String temp_name = rs.getString("name");
                String temp_id = rs.getString("id");
                String temp_email = rs.getString("email");
                String temp_title = rs.getString("title");
                String temp_content = rs.getString("content");

                String temp[] = { temp_name, temp_id, temp_email, temp_title,
                        temp_content };
                model.addRow(temp);
            } // while end
            rs.close();

        } catch (Exception ex3) {
            System.out.println("disp() exception  " + ex3);
        }
    }

    // main------------------------------------
    public static void main(String[] args) {
        new GuestBook();
    }

}

// create table guest(
// name varchar(15) not null,
// id varchar(20) not null,
// email varchar(30) not null,
// title varchar(40) not null,
// content text not null
// );

// guest 테이블 데이터

// insert into guest values ('홍길동','hong','hong@naver.com','홍길동글','안녕하세요
// 홍길동입니다');
// insert into guest values ('박문수','park','park@naver.com','박문수글','안녕하세요
// 박문수입니다');
// insert into guest values ('임성우','im','im@naver.com','임성우글','안녕하세요 임성우입니다');
// insert into guest values ('김철수','kim','kim@naver.com','김철수글','안녕하세요 김철수입니다');
// insert into guest values ('이세진','lee','lee@naver.com','이세진글','안녕하세요 이세진입니다');
// insert into guest values ('보리차','bo','bo@naver.com','보리차글','안녕하세요 보리차입니다');
// insert into guest values ('핸드폰','hand','hand@naver.com','핸드폰글','안녕하세요
// 핸드폰입니다');
