package swsw.hw;

import java.util.Arrays;

/**
 * Test
 */

public class Test {

    public static void main(String[] args) {

        char a = 65;
        System.out.println(a);

        char abc[] = new char[26];

        for (int i = 0; i < abc.length; i++) {
            abc[i] = (char) (65 + i);
        }

        System.out.println("char abc[]");
        System.out.println(Arrays.toString(abc));

        String s1[] = new String[26];

        for (int i = 0; i < abc.length; i++) {
            s1[i] = String.valueOf(abc[i]);
        }

        System.out.println("String s1[]");
        System.out.println(Arrays.toString(s1));

        String s2[] = new String[7];
        int j = 0;

        int k[] = new int[7];

        for (int i = 0; i < k.length; i++) {
            k[i] = i + 1;
        }
        System.out.println("int k[]");
        System.out.println(Arrays.toString(k));

        for (int i = 0; i < s2.length; i++) {
            s2[i] = s1[j];
            j = j + k[i];
        }

        System.out.println("String s2[]");
        System.out.println(Arrays.toString(s2));

        char ch2[] = new char[7];

        for (int i = 0; i < ch2.length; i++) {
            ch2[i] = s2[i].charAt(0);
        }

        System.out.println("Char ch2[]");
        System.out.println(Arrays.toString(ch2));

        for (int i = 0; i < ch2.length; i++) {
            ch2[i] = (char) (ch2[i] + 32);
        }

        System.out.println("Char ch2[]");
        System.out.println(Arrays.toString(ch2));

        for (int i = 0; i < ch2.length; i++) {
            s2[i] = String.valueOf(ch2[i]);
        }

        System.out.println("String s2[]");
        System.out.println(Arrays.toString(s2));

    }// main end
}// class end
