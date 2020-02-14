package ch06_while;

public class Test04_while {

    public static void main(String[] args) {
        int i = 4;
        int sum = 0;
        do {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        } while (i <= 90);

        System.out.println();

        System.out.println("sum : " + sum);

    }

}