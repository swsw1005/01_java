package ch10_class;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test02_sw_ver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");

        String jumin = sc.nextLine();

        try {

            int jumin_yy = Integer.parseInt(jumin.substring(0, 2)) * 1;
            int jumin_mm = Integer.parseInt(jumin.substring(2, 4)) * 1;
            int jumin_dd = Integer.parseInt(jumin.substring(4, 6)) * 1;

            String jumin_mid = jumin.substring(6, 7);

            int jumin_back = Integer.parseInt(jumin.substring(7, 14)) * 1;
            int jumin_back1 = Integer.parseInt(jumin.substring(7, 8)) * 1;
            int jumin_length = jumin.length();

            int jumin_yyyy = 0;

            if (jumin_yy >= 0 && jumin_yy < 25) {
                jumin_yyyy = jumin_yy + 2000;
            } else if (jumin_back1 == 9 || jumin_back1 == 0) {
                jumin_yyyy = jumin_yy + 1800;
            } else {
                jumin_yyyy = jumin_yy + 1900;
            }

            System.out.println(jumin_yyyy);

            boolean j_yy = (jumin_yy >= 0 && jumin_yy <= 99);
            boolean j_mm = (jumin_mm >= 1 && jumin_mm <= 12);
            boolean j_dd = (jumin_dd >= 1 && jumin_dd <= 31);
            boolean j_mid = jumin_mid.equals("-");
            boolean j_back1 = (jumin_back1 >= 0 && jumin_back1 <= 9);
            boolean j_length = (jumin_length == 14);

            boolean j_all = j_yy && j_mm && j_dd && j_mid && j_back1 && j_length;

            System.out.print(jumin_yy + " " + jumin_mm + " " + jumin_dd + " " + jumin_mid);
            System.out.println(" (" + jumin_back1 + ") " + jumin_back);
            System.out.println("length : \t" + jumin_length);

            SimpleDateFormat yyyymmdd = new SimpleDateFormat("yyyy-MM-dd");
            Date today = new Date();

            // Date birth = new Date();

            // Calendar cal = Calendar.getInstance();
            // cal.set(jumin_yyyy, jumin_mm, jumin_dd, 0, 0, 0);

            String today_format = yyyymmdd.format(today);
            // String birth_format = yyyymmdd.format(cal);

            if (j_all) {
                System.out.println("축하합니다. 올바른 주민번호를 입력하였습니다.");
                System.out.println();
                System.out.println("오늘은 \t" + today_format);
                // System.out.println("출생일 \t" + birth_format);

            } else {
                System.out.println("주민번호가 이상합니다.");
            }

        } catch (NumberFormatException ee) {
            System.out.println("숫자가 아닌 것이 있다??");

        }
        sc.close();
    }
}