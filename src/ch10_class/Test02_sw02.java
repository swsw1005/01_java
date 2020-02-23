package ch10_class;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

class Jumin {

    String jumin;

    public Jumin(String jumin) {
        /// 조각조각 쪼개기
        int jumin_yy = Integer.parseInt(jumin.substring(0, 2)) * 1; /// yy >> int
        int jumin_mm = Integer.parseInt(jumin.substring(2, 4)) * 1; /// mm >> int
        int jumin_dd = Integer.parseInt(jumin.substring(4, 6)) * 1; /// dd >> int

        String jumin_mid = jumin.substring(6, 7); /// 중간 구분자 -

        int jumin_back1 = Integer.parseInt(jumin.substring(7, 8)) * 1;
        int jumin_length = jumin.length();
        /// 쪼개기 끗

        /// 오늘날짜
        SimpleDateFormat yyyymmdd = new SimpleDateFormat("yyyy-MM-dd");/// 포맷 생성
        Calendar today_cal = new GregorianCalendar(Locale.KOREA);// 오늘날짜 가져오기(cal)
        Date today_date = today_cal.getTime();
        // 오늘 날짜 가져오기 (date)

        int today_year = (today_cal.get(Calendar.YEAR)); // 현재 날짜 연도 추출

        // int today_year_yy = today_year % 100; // 현재날짜 연도 2자리값
        /// 일단 킵

        int jumin_yy_yy = 0; // 4자리 출생연도 변수선언

        if (jumin_back1 == 9 || jumin_back1 == 0) {
            jumin_yy_yy = jumin_yy + 1800;
        } else {
            jumin_yy_yy = jumin_yy + 2000;
        }

        Calendar birth = Calendar.getInstance(); // 주민번호 앞자리로 생년월일 생성
        birth.set(jumin_yy_yy, jumin_mm - 1, jumin_dd, 0, 0, 0);// 주민번호 앞자리로 생년월일 생성
        Date birth_date = birth.getTime();// 주민번호 앞자리로 생년월일 생성
        ///
        /// 생년월일이 현재시간보다 크면, 연도에서 100을 뺀다
        /// 그리고 birth_date 재 설정
        if (birth_date.getTime() > today_date.getTime()) {
            jumin_yy_yy = jumin_yy_yy - 100;
            birth.set(jumin_yy_yy, jumin_mm - 1, jumin_dd, 0, 0, 0);
            birth_date = birth.getTime();
        }

        // 직전 생일 구하기
        // if 위 날짜 > today, year = year -1
        Calendar last_birth = Calendar.getInstance();
        last_birth.set(today_year, jumin_mm - 1, jumin_dd, 0, 0, 0);
        Date last_birth_Date = last_birth.getTime();
        // if 위 날짜 > today, year = year -1
        if (last_birth_Date.getTime() > today_date.getTime()) {
            last_birth.set(today_year - 1, jumin_mm - 1, jumin_dd, 0, 0, 0);
            last_birth_Date = last_birth.getTime();
        }

        /// yyyy-mm-dd 형식으로 String 변환
        String today_format = yyyymmdd.format(today_date);
        String birth_format = yyyymmdd.format(birth_date);
        String last_format = yyyymmdd.format(last_birth_Date);

        String jumin_sung; //// 성별____남자 or 여자
        switch (jumin_back1 % 2) { /// 남자 여자 결정
            case 0:
                jumin_sung = "여자";
                break;
            default:
                jumin_sung = "남자";
                break;
        }

        //// 나이 구하기
        int age = (int) ((last_birth_Date.getTime() - birth_date.getTime()) / 365 / 24 / 60 / 60 / 1000);
        int age_kor = today_cal.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + 1;
        //// 나이 구하기 end

        System.out.println(jumin_yy_yy);

        boolean j_yy = (jumin_yy >= 0 && jumin_yy <= 99);
        boolean j_mm = (jumin_mm >= 1 && jumin_mm <= 12);
        boolean j_dd = (jumin_dd >= 1 && jumin_dd <= 31);
        boolean j_mid = jumin_mid.equals("-");
        boolean j_back1 = (jumin_back1 >= 0 && jumin_back1 <= 9);
        boolean j_length = (jumin_length == 14);

        boolean j_all = j_yy && j_mm && j_dd && j_mid && j_back1 && j_length;

        if (j_all) {

            System.out.print(jumin_yy + " " + jumin_mm + " " + jumin_dd + " " + jumin_mid);
            System.out.println(" " + jumin_back1 + "****** ");
            System.out.println("length : \t" + jumin_length); //// 주민등록 번호 각각 분리되어 보여준다
            System.out.println("--------------------------------------");

            System.out.println("--------------------------------------");
            System.out.println("today  \t" + today_date);
            System.out.println("birth  \t" + birth_date);
            System.out.println("--------------------------------------"); // 날것 그대로의 날짜 출력

            System.out.println("주민등록번호를 입력하였습니다.");
            System.out.println("당신의 개인정보 바르게 저장되었다.");
            System.out.println();
            System.out.println("출생일  \t" + birth_format);
            System.out.println("직전생일 \t" + last_format);
            System.out.println("오늘날짜  \t" + today_format);
            System.out.println();

            System.out.println("나이\t\t" + age);
            System.out.println("한국나이\t" + age_kor);

            System.out.println((today_date.getTime() - birth_date.getTime()) / (24 * 60 * 60 * 1000) + "일 살아오셨습니다...");
            System.out.println();
            System.out.print("당신은 99% 확률로  " + jumin_sung + "입니다.");
            // System.out.print(jumin_sung);
            // System.out.println("입니다.");
            System.out.println();

        } else {
            System.out.println("주민번호가 이상합니다.");
        }
    }

}

public class Test02_sw02 {

    public static void main(String[] args) {

        System.out.println();
        System.out.print("---주민등록번호를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String j = scan.nextLine();

        new Jumin(j);

        scan.close();

    }
}