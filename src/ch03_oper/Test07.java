package ch03_oper;

import java.util.Scanner;

//3항연산자
public class Test07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("input two numbers : ");
        int i = scan.nextInt();
        int j = scan.nextInt();

        int a = (i > j) ? i : j;
        System.out.println("a = " + a);

        int b = (i < 5) ? i * 10 : i * 100;
        System.out.println("b = " + b);

        scan.close();
    }
}