package swsw.hw;

import java.util.Arrays;

public class TTest {

    public static void main(String[] args) {

        long pivo[] = new long[50];

        for (int i = 0; i < pivo.length; i++) {
            if (i <= 1) {
                pivo[i] = 1;
            } else {
                pivo[i] = pivo[i - 1] + pivo[i - 2];
            }
        } // for end

        System.out.println(Arrays.toString(pivo));

    }// main end
}// class end

/*
 * 1,1,2,3,5,8,13...
 * 
 * (첫번째 두번째 숫자는 1이고, 세번째부터는 자기 앞의 2개 숫자를 더한 값이다. 1+1 = 2 2+3 = 5 3+5 =8....)
 */
