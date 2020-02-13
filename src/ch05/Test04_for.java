package ch05;

public class Test04_for {

    public static void main(String[] args) {
        int sum = 0; // 변수선언, 초기화

        for (int i = 1; i <= 10; i++) {
            System.out.println("sum += i\t" + (sum += i));
            System.out.println("sum : " + sum);
        } // for end

        System.out.println("Q. 1~100까지 합계구하기");

        sum = (int) 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;

        }
        System.out.println("합계 : " + sum);
    }// main end
}// class end