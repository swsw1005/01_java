package ch16_exception;

public class Test02_throw {

    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(args[0]);

        if (n % 2 == 0) {
            System.out.println(n + " 짝수");
        } else {
            System.out.println(n + " 홀수");
        } // if else end

        try {
            System.out.println("정상적인 실행문");
        } catch (Exception e) {
            System.out.println("예외발생 실행문");
            System.out.println(e);
        }

    }
}