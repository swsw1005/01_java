package ch19_util2;

import java.util.Scanner;

public class Test06_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = sc.nextLine();

        switch (menu) {
        case "1":
            System.out.println("1번 메뉴");
            break;

        case "2":
            System.out.println("2번 메뉴");
            break;

        case "3":
            System.out.println("3번 메뉴");
            break;

        default:
            System.out.println("디퐅트");

        }

        sc.close();
    }
}