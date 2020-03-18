package ch04_control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06_switch {

    public static void main(String[] args) {

        try {

            int days = 0;

            Scanner scan = new Scanner(System.in);
            System.out.println("input month : ");
            int month = scan.nextInt();
            System.out.println("input year : ");
            int year = scan.nextInt();
            int yoondal = 0;

            if ((year / 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + "년도 2월은 29일까지 있습니다. 윤년입니다.");
                yoondal = 29;
            } else {
                System.out.println(year + "년도 2월은 28일까지 있습니다.");
                yoondal = 28;
            }

            switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println(month + "월은 " + days + "까지 있습니다.");

                break;
            case 2:
                days = yoondal;
                System.out.println(month + "월은 " + days + "까지 있습니다.");

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println(month + "월은 " + days + "까지 있습니다.");

                break;
            default:
                System.out.println(month + "?  이게 month냐??");
            } // swtich end

            scan.close();

        } catch (InputMismatchException e) {
            System.out.println("제발 숫자 입력하라고");
        }
    } // main end
} // class end