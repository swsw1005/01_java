package ch26_regular_expression;

import java.util.regex.Pattern;

public class EngPattern {

    public static void main(String[] args) {

        String pattern = "^[a-zA-Z][*+-/][a-zA-Z]*$";
        String input = "ABzzzDAWRAWR";

        boolean i = Pattern.matches(pattern, input);
        if (i == true) {
            System.out.println(input + "는 패턴에 일치함.");
        } else {
            System.out.println("패턴 일치하지 않음.");
        }

    }

}
