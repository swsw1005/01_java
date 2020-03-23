package ch18_util;
// Property : 자료형

import java.util.*;

// 전역변수, 필드, Property = 속성

// 속성을 모아서 하나의 객체로 

// ex)

// db.properties
// --------------------------------------
// DRIVER = oracle.jdbc.driver.OracleDriver
// URL = jdbc:oracle:thin

public class Test11_Properties {

    public static void main(String[] args) {

        Properties pro = new Properties();

        pro.put("driver", "com.mysql.jdbc.Driver");
        pro.put("url", "jdbc:mysql://localhost:3306/mydb");
        pro.put("user", "root");
        pro.put("pwd", "q1w2e3");

        String driver = pro.getProperty("driver");
        String url = pro.getProperty("url");
        String user = pro.getProperty("user");
        String pwd = pro.getProperty("pwd");

        System.out.println("---01----------------");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(pwd);

        System.out.println("---02----------------");

        Enumeration en = pro.propertyNames();

        while (en.hasMoreElements()) {
            String k = (String) en.nextElement();
            String v = pro.getProperty(k);

            System.out.println(k + " : " + v);
        }

        System.out.println("---03----------------");

        pro.list(System.out);

    } // main end
} // class end