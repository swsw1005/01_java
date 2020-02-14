package ch05_for;

import java.util.Scanner;

public class Test08_quiz {

    // 1
    // 5 6
    // 9 10 11
    // 13 14 15 16

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(4 * (i - 1) + j + "\t");
            }
            // for (int j = 1; j <= i; j++) {
            // System.out.print("☆");
            // }
            System.out.println();
        }

        scan.close();

    }// main end
}// class end