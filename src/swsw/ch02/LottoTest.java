package swsw.ch02;

import java.util.*;

public class LottoTest {
    // 변수
    int pick, max_num;
    List<Integer> li = new ArrayList<>();

    // 생성자
    // 인자있는 생성자
    public LottoTest(int pick, int max_num) {
        // 입력받은 매개변수
        this.pick = pick;
        this.max_num = max_num;

        // 골라낸 숫자를 담을 배열
        int picked_num[] = new int[pick];

        // List에 1~ max_index 까지 정수를 담는다.
        for (int i = 0; i < max_num; i++) {
            li.add(i + 1);
        }

        // List에서 정수 골라서 담는다.
        int j = max_num;
        for (int i = 0; i < pick; i++) {
            // a. 0 ~ max_num-1 사이의 랜덤 정수 얻기
            int temp = (int) (Math.random() * j);
            // b. 얻은정수를 index로 하는 List의 값을 배열에 넣기
            picked_num[i] = li.get(temp);
            // c. 배열에 넣었다면, 해당 값을 List에서 삭제
            li.remove(temp);
            // d. List가 한칸 줄었으므로, j값을 1 줄인다.
            j--;
        } // for end

        // 배열 오름차순 정렬
        Arrays.sort(picked_num);

        // 배열의 값 순서대로 출력
        for (int i = 0; i < picked_num.length; i++) {
            System.out.print(picked_num[i] + "\t");
        }
        System.out.println();// 한줄 띄우기
    }// cons end

    public static void main(String[] args) {
        new LottoTest(6, 45);
    }
}