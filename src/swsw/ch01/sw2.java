package swsw.ch01;

import java.util.Scanner;

public class sw2 {

    public static void main(String[] args) {

        System.out.println("다른 방식으로 다시 만들어봐라");
        System.out.println("다이아몬드");

        System.out.println();
        System.out.print("몇층짜리? >> ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n = (int) n / 2;
        System.out.println();
        System.out.println(n + "층짜리");
        System.out.println();

        for (int i = 0; i <= 2 * n; i++) {

            if (i <= n) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print("☆");
                }

                for (int j = 0; j <= 2 * i; j++) {
                    System.out.print("★");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("☆");
                }
                System.out.println();

            } else {

                for (int j = 1; j <= i - n; j++) {
                    System.out.print("☆");
                }

                for (int j = 0; j <= 2 * (2 * n - i); j++) {
                    System.out.print("★");
                }
                for (int j = 1; j <= i - n; j++) {
                    System.out.print("☆");
                }

                System.out.println();

            }

        }
        System.out.println("-------------------------");
        System.out.println();
        scan.close();

    }
}