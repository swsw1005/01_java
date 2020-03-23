package ch19_util2;

import java.util.Scanner;

public class Test05_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("int a 입력하세요");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println();

        System.out.print("double b 입력하세요");
        double b = sc.nextDouble();
        System.out.println(b);
        System.out.println();

        System.out.print("String d 입력하세요");
        String d = sc.next();
        System.out.println(d);
        System.out.println();

        System.out.print("boolean c 입력하세요");
        boolean c = sc.nextBoolean();
        System.out.println(c);
        System.out.println();

        sc.nextLine();

        System.out.print("String e 입력하세요");
        String e = sc.nextLine();
        System.out.println(e);
        System.out.println();

        sc.close();

    }
}