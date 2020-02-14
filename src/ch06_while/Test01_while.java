package ch06_while;

import java.util.Scanner;

public class Test01_while {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        int n = scan.nextInt();

        // 문장을 n번 출력한다.
        int i = 1;
        while (i <= n) {

            System.out.println("오늘은 즐거운 금요일!\t" + i);
            i++;
        } // while end
        System.out.println();
        // 1~n 까지 출력하시오
        i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println();

        scan.close();
    }// main end
}// class end