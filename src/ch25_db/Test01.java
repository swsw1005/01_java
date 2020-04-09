package ch25_db;

import java.sql.*;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.println("press 1 to mysql,  press 2 to oracle");
        int a = sc.nextInt();

        switch (a) {
        case 1:
            MySqlTest mt = new MySqlTest();
            mt.sql_id();
            mt.test();

            break;
        case 2:
            OracleTest ot = new OracleTest();
            ot.sql_id();
            ot.test();
            break;

        default:
            System.out.println("다음기회에...");
            break;
        }

        sc.close();

    }// main end
}