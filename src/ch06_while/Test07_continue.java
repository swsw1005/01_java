package ch06_while;

import java.util.Scanner;

//countinue 문
//반복문의 블럭 끝 만난것과 같다.
// 반복 loop를 수행한다.

public class Test07_continue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("최대 숫자? : ");
        int max_i = scan.nextInt();
        System.out.print("n의 배수? : ");
        int div_i = scan.nextInt();

        System.out.println(max_i + "이하 " + div_i + "의 배수 추적...");
        System.out.println();

        for (int i = 1; i <= max_i; i++) {
            if (i % div_i == 0) {
                System.out.println("i = " + i);
                continue;

            }

        } // for end

        System.out.println("Job's done!");

        scan.close();

    } // main end
} // class end
