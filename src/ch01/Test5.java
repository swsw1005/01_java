package ch01;

import java.util.Scanner;

//Test5.java

public class Test5 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input a b");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("sum:" + sum);
        scan.close();
    }// main end
}// class end
