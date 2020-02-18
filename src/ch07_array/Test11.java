package ch07_array;

public class Test11 {

    public static void main(String[] args) {
        double d1 = 3.1;
        double d2 = 3.7;

        System.out.println("반올림");
        System.out.println(Math.round(d1));
        System.out.println(Math.round(d2));
        System.out.println("절대값");

        System.out.println(Math.abs(d1 * (-1)));
        System.out.println(Math.abs(d2));
        System.out.println("가장 작은 것");
        System.out.println(Math.min(d1, d2));
        System.out.println("가장 큰 것");
        System.out.println(Math.max(d1, d2));
        System.out.println();
        System.out.println("PI = ");
        System.out.printf("%5.5f", Math.PI);
    }
}