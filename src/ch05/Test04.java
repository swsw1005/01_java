package ch05;

public class Test04 {

    public static void main(String[] args) {
        int sum = 0; // 변수선언, 초기화

        for (int i = 1; i <= 10; i++) {
            System.out.println("sum += i\t" + (sum += i));
            System.out.println("sum : " + sum);
        }
    }
}