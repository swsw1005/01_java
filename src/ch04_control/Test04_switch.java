package ch04_control;

import java.util.Scanner;

public class Test04_switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력하세요 (0~100)");
        int score = scan.nextInt();

        char grade = ' ';

        if (score >= 0 && score <= 100) {

            switch (score / 10) {

            case 10:
                grade = 'a';
                break;
            case 9:
                grade = 'a';
                break;
            case 8:
                grade = 'b';
                break;
            case 7:
                grade = 'c';
                break;
            case 6:
                grade = 'd';
                break;
            default:
                grade = 'f';
            } // switch end

            System.out.println("점수\t" + score + "\t학점\t" + grade);
        } else {
            System.out.println("0~100 까지 숫자를 입력하세요");
        }
        scan.close();
    }
}