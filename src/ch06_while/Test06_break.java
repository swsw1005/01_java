package ch06_while;

public class Test06_break {

    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {

            System.out.println(i + " ");
            if (i == 10)
                break;
        }

        System.out.println("----------");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
                // 원래 1~10 출력해야 하지만...
                if (j == 5)
                    break;
                // 5에 다다르면 inner for 빠져나가버린다.
            } // inner for end
            System.out.println();
            // 이것도 10줄 반복되어야 하지만...
            if (i == 3)
                break;// 3줄만 하고끝내버린다.
        } // out for end
    }// main end
}// class end