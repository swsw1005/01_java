package ch06_while;

public class Test05_while {

    public static void main(String[] args) {

        // while do while 비교
        int i = 100;
        int j = 100;

        while (i <= 10) {
            System.out.print("while\t");
            System.out.println(i + "는 10보다 작다");
            i++;
        }

        do {
            System.out.print("do while\t");
            System.out.println(i + "는 10보다 작다");
            j++;
        } while (j <= 10);

        // do while은 일단 1회 실행하고, 조건 따진다.

        // for문 . 자료 최종치 알고 있을때 사용
        // while문, 자료 최종치 불확실하면 사용
        // 주로 while 사용'

    }
}