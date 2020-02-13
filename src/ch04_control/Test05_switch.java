package ch04_control;

import java.io.IOException;
import java.util.Scanner;

public class Test05_switch {

    public static void main(String[] args) throws IOException {

        System.out.print("+ - * / % 중 하나의 연산자를 입력하세요>>");
        char oper = (char) System.in.read();
        // char 한글자밖에 못읽는다.
        System.out.println("숫자 a b입력");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        // int a = 20;
        // int b = 7;

        switch (oper) {

        case '+':
            System.out.println("a" + oper + "b =" + (a + b));
            break;
        case '-':
            System.out.println("a" + oper + "b =" + (a - b));
            break;
        case '*':
            System.out.println("a" + oper + "b =" + (a * b));
            break;
        case '/':
            System.out.println("a" + oper + "b =" + (a / b));
            break;
        case '%':
            System.out.println("a" + oper + "b =" + (a % b));
            break;
        default:
            System.out.println("입력오류 : + - * / % 중 하나를 입력하세요");
        } // switch end

        scan.close();

    }
}