package ch06_while;

public class Sw_test02 {

    public static void main(String[] args) {

        System.out.println("----");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println("----------------");

        System.out.println("----");

    }
}