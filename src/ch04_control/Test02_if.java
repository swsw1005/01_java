package ch04_control;

import java.util.Scanner;

public class Test02_if {

    public static void main(String[] args) {
        // 점수를 입력받아서 학점을 구하시오
        // 90~100 A
        // 80~89 B
        // 70~79 C
        // 60~69 D
        // 60 미만 F
        Scanner scan = new Scanner(System.in);
        System.out.println("input score : ");
        int score = scan.nextInt();
        char grade = ' ';

        if (score >= 0 && score <= 100) {

            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'c';
            } else if (score >= 60 && score < 70) {
                grade = 'd';
            } else if (score < 60) {
                grade = 'f';
            }
            System.out.println("grade = " + grade);
        } else {
            System.out.println("0에서 100 사이의 숫자만 입력하세요");
        }
        scan.close();

    } // main end
} // class end