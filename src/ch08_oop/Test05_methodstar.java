package ch08_oop;

public class Test05_methodstar {

    public void star() {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            } // inner 1 for end

            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            } // inner 2 for end
            System.out.println();
        } // out for end

    } // star end

    public static void main(String[] args) {

        Test05_methodstar t = new Test05_methodstar();
        t.star();

    } // main end

} // class end