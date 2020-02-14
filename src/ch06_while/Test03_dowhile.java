package ch06_while;

public class Test03_dowhile {

    public static void main(String[] args) {
        // 초기치;
        // do {
        // 반복수행 내용
        // } while (조건);
        // do while은 뭐가 다른가?
        // 무조건 한번은 수행한다.
        int i = 4;
        do {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 90);
    }
}