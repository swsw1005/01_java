package swsw.ch02;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        // 객체 생성
        LottoMachine machine = new LottoMachine();

        // 번호 생성
        int[] arr = machine.generate();

        // 결과 출력
        System.out.print("생성 번호: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

class LottoMachine {
    // 필드
    private ArrayList<Integer> numbers;

    // 생성자
    public LottoMachine() {
        numbers = new ArrayList<Integer>();

        /* 1. 번호(1 ~ 45)를 추가하세요. */

        for (int i = 0; i < 45; i++) {
            numbers.add(i + 1);
        }

    }

    // 메소드
    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random rand = new Random();

        /* 2. 임의의 숫자 6개를 추출하세요. */
        int k = 45;
        for (int i = 0; i < pickedNumbers.length; i++) {

            int temp = (int) rand.nextInt(k); // 44, 43, 42, 41, 40, 39 까지랜덤 넘버
                                              // 얻어서
            pickedNumbers[i] = numbers.get(temp); // 0~5번째 칸에 넣는다
            numbers.remove(temp); // 고른 숫자는 지운다.
            k--; // 지웠으니 index 최대값 --
        }
        k = 45; // 예의상 초기화

        return pickedNumbers;
    }
}