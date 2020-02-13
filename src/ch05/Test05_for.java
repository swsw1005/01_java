package ch05;

public class Test05_for {
    public static void main(String args[]) {
        System.out.println("Q. 1~10까지 짝수의 합을 구하세요");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                sum += i;
                System.out.println("i =\t" + i + "\tsum = \t" + sum);
            } // if end

        } // for end
        System.out.println();
        System.out.println("합계 :\t" + sum);
        System.out.println();

        System.out.println("Q. 1~30까지 3의 배수 합계");
        sum = 0;
        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0) {
                sum += i;

                System.out.println("i =\t" + i + "\tsum = \t" + sum);
            } // if end

        } // for end
        System.out.println();
        System.out.println("1~30 3배수합계 : " + sum);
        System.out.println();
    }// main end
}// class end