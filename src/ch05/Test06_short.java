package ch05;

import java.util.Scanner;

public class Test06_short {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("몇층짜리 백승민?");
        int n = scan.nextInt();
        System.out.println();
        System.out.println(">>>" + n + "층짜리 백승민 건설중...");
        System.out.println();

        int i = 0;
        for (i = -n; i <= n; i++) {

            if (i <= 0) {
                for (int j = -i; j > 0; j--) {
                    System.out.print("☆");
                }
                for (int j = 1; j <= (2 * i + 2 * n + 1); j++) {
                    System.out.print("★");
                }
                for (int j = -i; j > 0; j--) {
                    System.out.print("☆");
                }
                System.out.println();

            } else if (i > 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("☆");
                }
                for (int j = 1 - 2 * (i - n); j >= 1; j--) {
                    System.out.print("★");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("☆");
                }
                System.out.println();

            }

        }

        scan.close();

        System.out.println("\n\n\n");

    } // main end

}// class end
