package ch15_event;

public class DateOutputTest {

    public static void main(String[] args) {
        DatePrint d = new DatePrint(2020, 10, 25);

        d.disp();

        d.sysdate();
        d.disp();

        System.out.println();

        d.mydate(1999, 5, 5);
        d.disp();

        System.out.println();

        d.mydate2(1545, 4, 4, 13, 5, 5);
        d.disp();

    }
}