package ch07_array;

public class Test02_arr {

    static int aa = 100;// 전역변수
    // static에서는 static 변수만 사용 가능
    static int bb;

    public static void main(String[] args) {
        // static에서는 static 변수만 사용 가능
        System.out.println("aa : " + aa);
        System.out.println("bb : " + bb); // 전역 변수는 자동 초기화

        int b = 0;// int b;// 지역변수는 자동 초기화 불가능
        System.out.println("b : " + b);

        // 배열은 지역변수라도 자동초기화
        // 자료형 별로 어떻게 초기화 될까?

        int c[] = new int[3];
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "]\t" + c[i]);
        } // 0 0 0

        double d[] = new double[3];
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "]\t" + d[i]);
        } // 0.0 0.0 0.0

        char ch[] = new char[3];
        for (int i = 0; i < ch.length; i++) {
            System.out.println("ch[" + i + "]\t" + ch[i]);
        } // 아무 내용 없다

        String st[] = new String[3];
        for (int i = 0; i < st.length; i++) {
            System.out.println("st[" + i + "]\t" + st[i]);
        } // null null null
    }
}