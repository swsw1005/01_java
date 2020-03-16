package swsw.ch02;

import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {

        int array1[] = { 1, 5, 2, 6, 3, 7, 4 };
        int commands1[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

        Solution sl = new Solution();

        int dap[] = sl.solution(array1, commands1);

        for (int i = 0; i < dap.length; i++) {
            System.out.print(dap[i]);
        } // for end

        System.out.println("-------------------------------");

        for (int i = 0; i < dap.length; i++) {

        }

        Arrays.toString(array1);
    }
}

// 클래스 정의
// 클래스 생성
// z클래스에서 생성자 쓰는 이유
// 내부 변수 선언

/*
 * 
 * 매개변수 자료형
 * 
 */