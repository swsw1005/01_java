package ch06_while;

public class Test02_while {

    public static void main(String[] args) {
        // 1~20까지 짝수 출력
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } // while end
        System.out.println();
        // 10~90 7배수
        i = 10;
        while (i <= 90) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }// main end
}// class end