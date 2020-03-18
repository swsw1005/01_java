package ch05_for;

import java.util.Scanner;

public class Test10_1for {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("몇단까지 보여줄까영 >>");
        int n = scan.nextInt();
        // 구구단
        for (int i = 1; i <= n; i++) {

            for (int j = 2; j <= n; j++) {

                System.out.print(j + "*" + i + "=" + (j * i) + "\t");

            } // inner for
            System.out.println();
        } // out for

        scan.close();
    } // main out
} // class end