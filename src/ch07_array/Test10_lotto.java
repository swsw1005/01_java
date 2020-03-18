package ch07_array;

import java.util.Arrays;

class Lotto {

    public void lotto6num() {

        // System.out.println("학원방식 lotto");
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i++) {

            lotto[i] = (int) (Math.random() * 45 + 1);

            // 같은값 나오는 해결
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break; // inner out
                } // if end

            } // inner for end
        } // for end

        Arrays.sort(lotto);
        // 정렬

        String lottosrt = Arrays.toString(lotto);

        // [1],[2],[3] 방식 표기...
        // [ ] , 빼고 Tab으로 정렬
        lottosrt = lottosrt.replace("[", "");
        lottosrt = lottosrt.replace("]", "");
        lottosrt = lottosrt.replace(",", "\t");
        System.out.println(lottosrt);
    }

}

public class Test10_lotto {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Lotto lot = new Lotto();
            lot.lotto6num();
        }
    } // main end
} // class end
