package ch25_db;

import java.io.*;
import java.sql.*;
import java.util.*;

public class MySqlTest {

    String driver, url, user, pwd;

    HashMap<String, String> hm = new HashMap<>();

    public void sql_id() {
        Properties pp = new Properties();

        try {
            pp.load(new FileInputStream("src\\ch25_db\\MySqlDB.properties"));
        } catch (Exception ex) {
            System.out.println("파일 읽기 오류 " + ex);
        }

        // 읽어들여서
        driver = pp.getProperty("driver");
        url = pp.getProperty("url");
        user = pp.getProperty("user");
        pwd = pp.getProperty("pwd");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(pwd);

        System.out.println();
        System.out.println();

    }

    public void test() {

        Connection con = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        String sql = "";
        ResultSet rs;
        sql_id();

        try {
            // 1. 드라이버 확인
            Class.forName(driver);
            System.out.println("드라이버 OK");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        try {

            // 2. 연결
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("연결  OK");
            // 3. sql 문 작성 : String으로 쿼리문 넣어준다.
            stmt = con.createStatement();

            //// list
            sql = "select * from member ";
            rs = stmt.executeQuery(sql);

            // ---------- selece 일때
            // ---------- executeQuery()
            // ---------- update, alter 일때
            // ---------- executeUpdate()

            // 6. 실행된 결과 표시 --> HTML, CSS , JS
            if (rs != null) {
                while (rs.next()) {
                    String temp_id = rs.getString("id");
                    String temp_pwd = rs.getString("pwd");
                    String temp_name = rs.getString("name");

                    System.out.println(
                            temp_id + "\t" + temp_pwd + "\t" + temp_name);
                }
            }

        } catch (SQLException ex2) {
            // 예외처리
            System.out.println("실패");
            ex2.printStackTrace(); // 에러 스택 보여준다.
        } finally {
            // 예외가 발생 하든말든 무조건 실행되는 부분
            // 7. 닫기 -->> 오류가 나든 안나든 닫아야 한다.
            //// 자원절약
            if (con != null) {

                try {
                    con.close();
                    stmt.close();

                } catch (SQLException eSqlException) {
                    // sql 예외처리
                    eSqlException.printStackTrace();// 에러스택
                } // end try catch

            } // end if
        } // end try cateh
    }
}// class end