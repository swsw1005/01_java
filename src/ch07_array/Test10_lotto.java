package ch07_array;

import java.util.Arrays;

public class Test10_lotto {

    public static void main(String[] args) {

        System.out.println("학원방식 lotto");
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i++) {

            lotto[i] = (int) (Math.random() * 45 + 1);

            // 같은값 나오는 해결
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;// inner out
                } // if end

            } // inner for end
        } // for end

        for (int i = 0; i < 6; i++) {
            System.out.println(lotto[i] + " ");

        }
        System.out.println("--------------------------");

        int a1 = lotto[0];
        int a2 = lotto[1];
        int a3 = lotto[2];
        int a4 = lotto[3];
        int a5 = lotto[4];
        int a6 = lotto[5];
        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6);

        // int b1 = 0;
        // int b2 = 0;
        // int b3 = 0;
        // int b4 = 0;
        // int b5 = 0;
        // int b6 = 0;

        System.out.println("--------------------------");

        Arrays.sort(lotto);
        // 정렬

        System.out.println(Arrays.toString(lotto));

        // while (a1 > 0) {
        // b1 = Math.min(a1, a2);
        // b2 = Math.max(a1, a2);
        // a1 = b1;
        // a2 = b2;

        // b2 = Math.min(a3, a2);
        // b3 = Math.max(a3, a2);
        // a2 = b2;
        // a3 = b3;

        // b3 = Math.min(a3, a4);
        // b4 = Math.max(a3, a4);
        // a3 = b3;
        // a4 = b4;

        // b4 = Math.min(a4, a5);
        // b5 = Math.max(a4, a5);
        // a4 = b4;
        // a5 = b5;

        // b5 = Math.min(a5, a6);
        // b6 = Math.max(a5, a6);
        // a5 = b5;
        // a6 = b6;

        // if (a1 < a2 && a2 < a3 && a3 < a4 && a4 < a5 && a5 < a6) {
        // break;
        // }

        // } // while end
        // System.out.println("순서대로 정렬");
        // System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " +
        // a6);
        // System.out.println("--------------------------");
    }// main end
}// class end