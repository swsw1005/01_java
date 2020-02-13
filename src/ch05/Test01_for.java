package ch05;

public class Test01_for {
    /*
     * for (초기값 ; 조건(최종값) ; 증감치 ){ 처리내용 처리내용 }
     * 
     * 증감치, 처리내용, 처리내용 >> 조건이 참일때까지 무한반복
     */

    public static void main(String[] args) {
        // 수요일 5번 출력
        for (int i = 1; i <= 5; i++) {
            System.out.println("오늘은 수요일\t" + i);
        }
        System.out.println();
        // 오늘은 수요일 1
        // 오늘은 수요일 2
        // 오늘은 수요일 3
        // 오늘은 수요일 4
        // 오늘은 수요일 5

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}