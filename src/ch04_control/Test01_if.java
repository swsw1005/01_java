package ch04_control;

public class Test01_if {

    public static void main(String[] args) {
        int su = Integer.parseInt(args[0]);

        if (su > 0) {
            System.out.println(su + "는 양수");
        } // if end

        if (su < 0) {
            System.out.println(su + "는 음수");
        } // if end

        if (su > 0) {
            System.out.println(su + "는 양수입니다");
        } else {

        }

    }// main end
}// class end