
package swsw.jdbc;

import java.io.*;
import java.sql.*;
import java.util.*;

public class BoardList {

    String driver;
    String url;
    String user;
    String pwd;

    HashMap<String, String> hm = new HashMap<String, String>();

    public void sql_id() {
        Properties pp = new Properties();

        try {
            pp.load(new FileInputStream("src\\swsw\\jdbc\\DB.properties"));
        } catch (Exception ex) {
            System.out.println("파일 읽기 예외  " + ex);
        }

        driver = pp.getProperty("driver");
        url = pp.getProperty("url");
        user = pp.getProperty("user");
        pwd = pp.getProperty("pwd");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(pwd);

        System.out.println("---02----------------");

        Enumeration en = pp.propertyNames();

        while (en.hasMoreElements()) {
            String k = (String) en.nextElement();
            String v = pp.getProperty(k);
            System.out.println(k + " : " + v);
            hm.put(k, v);
        }

        System.out.println("---03----------------");

        System.out.println();
        pp.list(System.out);

    }

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement pstmt = null;
        BoardList bl = new BoardList();
        bl.sql_id();

        // 파일로 읽어주기

        try {
            // 1. 드라이버 확인
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName(bl.driver);

            // 2. 연결
            // con =
            // DriverManager.getConnection("JDBC:oracle:thin:@localhost:1551:xe",
            // "java00", "q1w2e3");
            con = DriverManager.getConnection(bl.url, bl.user, bl.pwd);

            // 3. sql 문 작성
            //// sql 쿼리 String으로 넣어준다.
            String sql = "select no, title, writedate from notice order by no desc";

            // 4. 실행 객체
            pstmt = con.prepareStatement(sql);

            // 5. 실행
            ResultSet rs = pstmt.executeQuery();
            // ---------- selece 일때
            // ---------- executeQuery()
            // ---------- update, alter 일때
            // ---------- executeUpdate()

            // 6. 실행된 결과 표시 --> HTML, CSS , JS
            if (rs != null) {
                while (rs.next()) {
                    System.out.printf("%d / %s / %s %n", rs.getInt("no"),
                            rs.getString("title"), rs.getString("writedate"));
                }
            }

        } catch (ClassNotFoundException e) {
            // 예외처리
            e.printStackTrace(); // 에러 스택 보여준다.

        } finally {
            // 예외가 발생 하든말든 무조건 실행되는 부분
            // 7. 닫기 -->> 오류가 나든 안나든 닫아야 한다.
            //// 자원절약
            if (con != null) {

                try {
                    con.close();
                    pstmt.close();

                } catch (SQLException eSqlException) {
                    // sql 예외처리
                    eSqlException.printStackTrace();// 에러스택

                } // end try catch

            } // end if
        } // end try cateh
    }// main end
}// class end
