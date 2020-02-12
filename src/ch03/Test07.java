package ch03;

//3항연산자
public class Test07 {
    public static void main(String[] args) {
        int a = (7 > 5) ? 7 : 3;
        System.out.println("a = " + a);

        int b = (a < 5) ? a * 10 : a * 100;
        System.out.println(b);

    }
}