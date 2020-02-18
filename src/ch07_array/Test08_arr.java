package ch07_array;

public class Test08_arr {

    public static void main(String[] args) {
        String name[] = { "홍길동", "이순신", "박문수" };
        int score[][] = { { 100, 90, 80, 70 }, { 100, 70, 60, 50 }, { 100, 50, 40, 30 } };

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%10s", name[i]);
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%5d", score[i][j]);
                sum += score[i][j];
            }
            System.out.printf("%7d", sum);
            System.out.printf("%7.1f", (double) sum / score[i].length);
            System.out.println();
        }

    }
}