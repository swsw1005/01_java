package ch18_util;

import java.util.Random;
import java.util.Scanner;

public class Test17_Random {

    public static void main(String[] args) {

        System.out.println(Math.random());
        // 0.0~0.1 사이 난수
        System.out.println(Math.random() * 10 + 4);
        // 4~10사이의 정수 난수

        int cnt = 0;
        int cnt2 = 0;

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < 10000; i++) {
            double temp = Math.random() * j + k;

            if (temp >= (j + 1)) {
                cnt++;
            }
            if (temp <= k) {
                cnt2++;
            }

        }

        double percent = ((double) (cnt + cnt2)) / 100;

        System.out.println("오류 발생 : " + cnt + "  " + cnt2);
        System.out.printf("발생율 : %.2f ", percent);
        System.out.println();
        System.out.println();

        Random rd = new Random();

        System.out.println(rd.nextInt());
        System.out.println(rd.nextInt(10));
        System.out.println(rd.nextBoolean());
        System.out.println(rd.nextDouble());

    }
}