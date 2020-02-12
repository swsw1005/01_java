package ch03;

import java.util.Scanner;

// 관계연산자
public class Test02 {

    public static void main(String args[]) {

        // > 초과
        // < 미만

        // >= 이상
        // <= 미만
        // == 같다
        // != 같지않다
        Scanner scan = new Scanner(System.in);
        System.out.println("a b 를 입력하시오");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.print("a > b\t"); // true
        System.out.println(a > b); // true
        System.out.print("a >= b\t"); // true
        System.out.println(a >= b); // true
        System.out.print("a < b\t"); // false
        System.out.println(a < b); // false
        System.out.print("a <= b\t"); // false
        System.out.println(a <= b); // false
        System.out.print("a == b\t"); // false
        System.out.println(a == b); // false
        System.out.print("a != b\t"); // true
        System.out.println(a != b); // true

        scan.close();
    }

}