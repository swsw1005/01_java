package ch04_control;

public class Test03_switch {

    public static void main(String[] args) {
        // 어떤수를 입력받아 홀수인지 짝수인지 판정하여 출력
        int su = Integer.parseInt(args[0]);

        switch (su % 2) {
        case 0:
            System.out.println(su + "\t>>짝수");
            break;
        case 1:
            System.out.println(su + "\t>>홀수");
            break;// 마지막엔 안써도 무관
        } // switch end
    }// main end
}// class end