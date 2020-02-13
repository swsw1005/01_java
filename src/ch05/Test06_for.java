package ch05;

import java.util.Scanner;

public class Test06_for {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("몇층짜리 피라미드?");
        int n = scan.nextInt();

        System.out.println();
        System.out.println(">>>" + n + "층짜리 피라미드 건설중...");
        System.out.println();
        // ★☆
        // 아래로 넓어지는 피라미드구간
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("☆");
            }
            for (int j = 0; j < (i * 2 + 1); j++) {
                System.out.print("★");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print("☆");
            }
            System.out.println();
        }
        // 아래로 줄어드는 역피라미드 구간
        for (int i = n; i > 0; i--) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print("☆");
            }
            for (int j = (i * 2 - 1); j > 0; j--) {
                System.out.print("★");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print("☆");
            }
            System.out.println();
        }

        scan.close();
        // for (int i = 10; i >= 0; i--)
    } // main end
} // class end