package ch06_while;

public class Sw_test01 {

    public static void main(String[] args) {

        String s1[] = { "월", "화", "수", "목", "금", "토", "일" };

        // for 문으로
        for (int i = 0; i < s1.length; i++) {

            System.out.println("오늘은 " + s1[i] + "요일");
        }

        System.out.println("-------------------");

        // while 문으로
        int j = 0;
        while (j < s1.length) {
            System.out.println("오늘은 " + s1[j] + "요일");
            j++;
        }

        System.out.println("-------------------");

        // do while 문으로
        int k = 0;
        do {
            System.out.println("오늘은 " + s1[k] + "요일");
            k++;
        } while (k < s1.length);

        System.out.println("-------------------");

    } // main end
} // class end