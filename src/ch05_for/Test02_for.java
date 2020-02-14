package ch05_for;

public class Test02_for {

    public static void main(String[] args) {

        // A ~ Z 까지 아스키 코드값
        System.out.println("----- char i = 65~90");
        for (char i = 65; i <= 90; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println();

        // a ~ Z 까지 아스키코드값
        System.out.println("----- char i = 97~122");
        for (char i = 97; i <= 122; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println();

        // A ~ Z 까지 아스키코드 값
        System.out.println("----- char ch = A ~ Z");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
        System.out.println();
        System.out.println();

    } // main end
} // class end