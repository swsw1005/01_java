package ch05_for;

import java.util.Scanner;

public class Test09_for {

    public static void main(String[] args) {
        // A
        // AB
        // ABC
        // ABCD
        Scanner scan = new Scanner(System.in);
        System.out.print("몇층 알파벳? >>>");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 64;
            for (int j = 1; j <= i; j++) {
                ch++;
                System.out.print(ch);
            } // inner for end
            System.out.println();

        } // out for end

        System.out.println("-----------------------");

        // A
        // BC
        // DEF
        // GHIJ

        char ch2 = 64;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                ch2++;
                System.out.print(ch2);
            } // inner for end
            System.out.println();

        } // out for end

        scan.close();
    }// main end
}// class end