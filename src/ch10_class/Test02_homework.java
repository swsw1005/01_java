package ch10_class;

import java.util.Scanner;

public class Test02_homework {

    public static void main(String[] args) {
        System.out.print("주민번호 입력 : ");
        Scanner scan = new Scanner(System.in);
        String jumin = scan.nextLine();

        try {

            switch (Integer.parseInt(jumin.substring(7, 8))) {
                case 1:
                case 3:
                    System.out.println("주민번호뒷자리 시작 홀수\t남자");
                    break;

                case 2:
                case 4:
                    System.out.println("주민번호뒷자리 시작 짝수\t여자");
                    break;

                default:
                    System.out.println("올바른 번호를 입력해주세요");
                    break;
            }

        } catch (Exception e) {
            System.out.println("주민번호 형식에 맞게 입력하세요");

        }
        scan.close();
    }
}