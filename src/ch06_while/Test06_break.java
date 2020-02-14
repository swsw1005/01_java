package ch06_while;

public class Test06_break {

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {

            System.out.println(i + " ");
            if (i == 10)
                break;
        }
    }
}