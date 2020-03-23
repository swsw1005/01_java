package ch19_util2;

import java.util.*;

public class Test09_set_Lotto {

    public static void main(String[] args) {

        System.out.println("--------------------");

        Set<Integer> set1 = new HashSet<Integer>();

        while (set1.size() < 6) {
            int a = (int) (Math.random() * 45 + 1);
            set1.add(a);
        }

        for (Integer i : set1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("--------------------");

        Set<Integer> set2 = new HashSet<Integer>();
        Random rd = new Random();

        while (set2.size() < 6) {
            int a = rd.nextInt(44) + 1;
            set2.add(a);
        }

        for (Integer i : set2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("--------------------");

    }
}