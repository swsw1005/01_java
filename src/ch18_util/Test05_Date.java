package ch18_util;

import java.text.SimpleDateFormat;

public class Test05_Date {

    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println("미국식표기");
        System.out.println(date);

        SimpleDateFormat sd1 = new SimpleDateFormat(
                "yyyy년 MM월 dd E요일  HH시 mm분 ss초");

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy MM dd E");
        System.out.println("한국식표기");
        System.out.println(sd1.format(date));
        System.out.println(sd2.format(date));

    }
}