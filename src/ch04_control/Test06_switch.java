package ch04_control;

import java.util.Scanner;

public class Test06_switch {

    public static void main(String[] args) {

        int days = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("input month : ");
        int month = scan.nextInt();
        System.out.println("input year : ");
        int year = scan.nextInt();

        if ((year / 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "년도 2월은 29일까지 있습니다. 윤년입니다.");
        } else {
            System.out.println(year + "년도 2월은 28일까지 있습니다.");
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
            break;
        case 2:
            // 4의 배수 && not 100의 배수 || 400의 배수 = 윤년
            if ((year / 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                days = 29;
            } else {
                days = 28;
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
            break;
        } // swtich end

        System.out.println(month + "월은 " + days + "까지 있습니다.");

        scan.close();
    } // main end
}// class end