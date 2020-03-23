package ch18_util;

import java.util.*;

import ch15_event.DatePrint;

public class Test03_Calendar {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();// 객체 생성
        Date date = cal.getTime();

        System.out.println("---------------------");
        System.out.println(cal);
        System.out.println("---------------------");
        System.out.println(date);

        int y1 = cal.get(Calendar.YEAR);
        int m1 = cal.get(Calendar.MONTH) + 1;
        int d1 = cal.get(Calendar.DATE);

        System.out.printf("%d %d %d", y1, m1, d1);
        System.out.println();

        DatePrint dp = new DatePrint();

        System.out.println(dp.sysdateOnly());

        System.out.println(new DatePrint().sysdate());
    }
}