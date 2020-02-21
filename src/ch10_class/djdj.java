package ch10_class;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class djdj {

    public static void main(String[] args) {
        SimpleDateFormat yyyymmdd = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();

        Calendar birth = new GregorianCalendar(2020, 5, 12);
        String today_format = yyyymmdd.format(today);
        String birth_format = yyyymmdd.format(birth);

        System.out.println(today_format);

        System.out.println(birth_format);
    }
}