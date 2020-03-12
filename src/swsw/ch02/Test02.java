package swsw.ch02;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수타입 정의해야 하지만, 숫자 문자 번갈아 쓰려면 system인풋스트림
        System.out.println("몇의 배수를 구하는가?");
        int x = sc.nextInt();
        String s = "의 배수는 ";
        int j = 0;

        // 배수 갯수 구하기
        for (int i = 20; i <= 50; i++) {
            if (i % x == 0) {
                j++;
            }
        }
        System.out.println("배수갯수 : " + j);
        System.out.println();

        // 배수 갯수 길이로 배열 선언
        int[] x1 = new int[j];
        String[] s1 = new String[j];

        // 배열에 배수 넣기
        j = 0;
        for (int i = 20; i <= 50; i++) {
            if (i % x == 0) {
                x1[j] = i;
                j++;
            }
        }

        // 중간점검용 출력
        // int x1[] 출력
        System.out.println("----------------"); // 위쪽 구분
        for (int i = 0; i < s1.length; i++) {
            System.out.print(x1[i] + "\t");
        }
        System.out.println("\n----------------"); // 아래쪽 구분

        // int x1[i]값을 String s1[i]로 넣어준다.
        for (int i = 0; i < x1.length; i++) {
            s1[i] = x1[i] + "";
        }

        // 배열을 ", " 구분자로... 하나의 문자열(str)로 합쳐준다.
        String str = String.join(", ", s1);

        // x + "의 배수는 " + str
        System.out.println(x + s + str);

        // 스캐너 끄기
        sc.close();

    }
}