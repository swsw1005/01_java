package ch15_event;

import java.text.SimpleDateFormat;
import java.util.*;

public class DatePrint {

    // custom***
    // 날짜 데이터 포맷
    SimpleDateFormat yyyymmdd = new SimpleDateFormat(
            "yyyy년 MM월 dd일 E요일 HH:mm:ss");
    // 최종출력되는 날짜
    String date;

    public String sysdate() {
        Date today_date = new Date();
        // date에 시스템 날짜 넣어주기
        date = yyyymmdd.format(today_date);
        return date;
    }

    public String sysdateOnly() {
        Calendar today_cal = Calendar.getInstance();

        int y = today_cal.get(Calendar.YEAR);
        int m = today_cal.get(Calendar.MONTH);
        int d = today_cal.get(Calendar.DATE);
        today_cal.set(y, m, d, 0, 0, 0);
        Date todayDate = today_cal.getTime();
        date = yyyymmdd.format(todayDate);
        return date;
    }

    public String date() {
        return date;
    }

    public String mydate(int a, int b, int c) {
        // 연 월 일
        Calendar mydate = Calendar.getInstance(); // 새로운 Calendar 인스턴스
        mydate.set(a, b - 1, c, 0, 0, 0); // a, b, c입력받아서
                                          // 각각 년 월 일 입력
        // Date mydate_date = mydate.getTime(); // Date 형식으로 변경

        // date에 임의의 날짜 넣어주기
        // date = yyyymmdd.format(mydate_date);
        date = yyyymmdd.format(mydate.getTime());
        return date;
    }

    public String mydate2(int a, int b, int c, int d, int e, int f) {
        // 연 월 일 + 시 분 초
        Calendar mydate = Calendar.getInstance(); // 새로운 Calendar 인스턴스
        mydate.set(a, b - 1, c, d, e, f); // a, b, c입력받아서
                                          // 각각 년 월 일 입력
        // Date mydate_date = mydate.getTime(); // Date 형식으로 변경

        // date에 임의의 날짜 넣어주기
        // date = yyyymmdd.format(mydate_date);
        date = yyyymmdd.format(mydate.getTime());
        return date;
    }

    // 출력 메소드
    public void disp() {
        System.out.println("----- ----- ----- ----- -----");
        System.out.println(date);
        System.out.println("----- ----- ----- ----- -----");

    }

    // 생성자 - 년 월 일
    public DatePrint(int a, int b, int c) {
        // 연 월 일
        Calendar mydate = Calendar.getInstance(); // 새로운 Calendar 인스턴스
        mydate.set(a, b - 1, c, 0, 0, 0); // a, b, c입력받아서
                                          // 각각 년 월 일 입력
        // Date mydate_date = mydate.getTime(); // Date 형식으로 변경

        // date에 임의의 날짜 넣어주기
        // date = yyyymmdd.format(mydate_date);
        date = yyyymmdd.format(mydate.getTime());

    }

    // 생성자 - 년 월 일 시 분 초
    public DatePrint(int a, int b, int c, int d, int e, int f) {
        // 연 월 일 + 시 분 초
        Calendar mydate = Calendar.getInstance(); // 새로운 Calendar 인스턴스
        mydate.set(a, b - 1, c, d, e, f); // a, b, c입력받아서
                                          // 각각 년 월 일 입력
        Date mydate_date = mydate.getTime(); // Date 형식으로 변경

        // date에 임의의 날짜 넣어주기
        date = yyyymmdd.format(mydate_date);

    }

    // 기본 생성자 - sysdate
    public DatePrint() {
        Date today_date = new Date();
        // date에 시스템 날짜 넣어주기
        date = yyyymmdd.format(today_date);
    }

}