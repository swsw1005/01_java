package ch05_for;

public class Test03_for {

    public static void main(String[] args) {

        System.out.println(" // 1~10 짝수만 출력");
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " ");

            } // if end
        } // for end

        System.out.println();
        System.out.println();

        System.out.println(" // 10~100 7의배수 출력");
        for (int i = 10; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " ");
            } // if end
        } // for end

        System.out.println();
        System.out.println();

        System.out.println(" // 홀수 출력");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i + " ");

        } // for end
    } // main end
} // class end