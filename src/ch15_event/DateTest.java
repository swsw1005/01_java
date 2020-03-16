package ch15_event;

public class DateTest {

    public static void main(String[] args) {

        DatePrint d = new DatePrint();

        d.sysdate();
        d.disp();

        d.mydate(2000, 5, 3);
        d.disp();

        d.mydate2(2020, 5, 12, 12, 44, 48);
        d.disp();
    }
}