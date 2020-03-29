package ch19_util2;

public class Test04_AutoUnboxing {

    public static void main(String[] args) {

        // 오토박싱
        int a = 100;
        Integer A = a;

        // 언박싱
        Integer B = new Integer(200);
        int b = B;

        System.out.println("a " + a);
        System.out.println("A " + A);
        System.out.println("b " + b);
        System.out.println("B " + B);

    }
}