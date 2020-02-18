package ch07_array;

import java.util.Scanner;

public class Test09_random {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("주사위 몇회 굴리는가");
        int sc = scan.nextInt();
        double sum = 0.000;
        System.out.println("----------");

        for (int i = 1; i <= sc; i++) {
            // int a = (int) (Math.random() * 6 + 1);
            int a = (int) (((Math.random()) * 1000) % 6) + 1;
            System.out.println(a);
            sum = sum + a;
            // a = 0;
            // System.out.println("-----" + sum);
        }
        System.out.println();
        System.out.print("평균값\t");
        System.out.println(sum + "/" + sc);
        System.out.print("=  ");
        System.out.printf("%5.3f", sum / sc);

        scan.close();
    }
}