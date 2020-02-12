package ch04_control;

import java.util.Scanner;

public class Test01_if {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("su 값을 입력해라");
        int su = scan.nextInt();

        if (su > 0) {
            System.out.println(su + "는 양수");
        } // if end

        if (su < 0) {
            System.out.println(su + "는 음수");
        } // if end

        if (su > 0) {
            System.out.println(su + "는 양수입니다");
        } else {

        }
        scan.close();

    }// main end
}// class end