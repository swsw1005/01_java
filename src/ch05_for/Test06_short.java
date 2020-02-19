package ch05_for;

import java.util.Scanner;

public class Test06_short {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 이중 for문 2개 쓰지말고, 하나로 합쳐라
        System.out.print("몇층짜리 다이아몬드?");
        int n = sc.nextInt() / 2;
        System.out.println();
        System.out.println(">>>" + n + "층짜리 다이아 제작중...");
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
                sc.close();
            } // if else if end
        } // for end

        System.out.println("\n\n\n");

    } // main end

}// class end
