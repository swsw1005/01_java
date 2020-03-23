package ch18_util;

import java.io.*;
import java.util.*;

public class Test12_properties {

    public static void main(String[] args) {

        Properties pp = new Properties();

        try {
            pp.load(new FileInputStream("src//ch18_util//DB.properties"));
        } catch (Exception ex) {
            System.out.println("파일 읽기 예외  " + ex);
        }

        String driver = pp.getProperty("driver");
        String url = pp.getProperty("url");
        String user = pp.getProperty("user");
        String pwd = pp.getProperty("pwd");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(pwd);

    } // main end
} // class end