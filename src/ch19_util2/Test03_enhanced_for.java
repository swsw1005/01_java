package ch19_util2;

import java.util.ArrayList;
import java.util.List;

public class Test03_enhanced_for {

    public static void main(String[] args) {
        // 단축 for (향상된 for문) Enhanced Loop
        int[] ss = { 2, 13, 45, 65, 45 };
        for (int i : ss) {
            System.out.println(i);
        }
        System.out.println("-----");
        // 아래와 같다
        for (int j = 0; j < ss.length; j++) {
            int i = ss[j];
            System.out.println(i);
        }

        System.out.println("-------------");

        String[] name = { "KIM", "JACK", "LEE", "DACUYA" };

        for (String Nm : name) {
            System.out.println(Nm);
        }
        System.out.println("-----");
        // 아래와 같다.
        for (int i = 0; i < name.length; i++) {
            String Nm = name[i];
            System.out.println(Nm);
        }

        System.out.println("-------------");

        List<String> list_1 = new ArrayList<>();

        list_1.add("피자");
        list_1.add("치킨");
        list_1.add("짜장면");
        list_1.add("라면");
        list_1.add("족발");

        for (String s : list_1) {
            System.out.println(s);
        }

    }
}