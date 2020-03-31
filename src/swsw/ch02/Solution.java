package swsw.ch02;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {

        // array [1, 5, 2, 6, 3, 7, 4]
        // commands [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
        // return [5, 6, 3]

        // int array[] = { 1, 5, 2, 6, 3, 7, 4 };
        // int commands[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

        int[] answer = new int[commands.length];

        // System.out.println("commands.length : " + commands.length);

        for (int a = 0; a < commands.length; a++) {

            int i = commands[a][0]; // if(a==0) 2
            int j = commands[a][1]; // if(a==0) 5
            int k = commands[a][2]; // if(a==0) 3

            // System.out.println(i + " " + j + " " + k);

            // i == j 이면 별도의 처리
            if (i == j) {
                answer[a] = array[i - 1];

            } else {

                // i부터 j까지 분리해서 넣어줄 새로운 배열 int arr[]선언
                int arr[] = new int[j - i + 1]; // (2,5)>> 5-2+1 = 4칸

                // int arr[]에 값을 넣어주자 (2,5)>> 5-2+1 >>> b<4
                for (int b = 0; b < (j - i + 1); b++) {
                    arr[b] = array[b + i - 1];
                } // for b

                // for b 의 결과.. int arr[]가 완성되었다.
                // 정렬
                Arrays.sort(arr);

                // arr[k]의 값을 answer[a]에...
                int answer1 = arr[k - 1];
                answer[a] = answer1;

            }
        } // for a end
        return answer; // [5, 6, 3]

    } // solution() end

}