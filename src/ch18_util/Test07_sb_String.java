package ch18_util;

public class Test07_sb_String {

    // 1. String 보다 StringBuffer 600배 정도 빠른듯.
    // 2. StringBuffer보다 StringBuilder가 더 빠르다.
    // 3. 근데 왜 StringBuffer???
    // >>> 멀티쓰레드 안전하다

    public static void main(String[] args) {

        long start, end;

        start = System.currentTimeMillis(); // 1/1000초

        String str = "";

        for (int i = 0; i <= 10000; i++) {
            str += i;
            str += "+";
        } // for end
        end = System.currentTimeMillis();
        System.out.println("연산시간 : " + (end - start));

        // StringBuffer

        StringBuffer sb = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 6000000; i++) {
            sb.append(i);
            sb.append("+");
        }
        end = System.currentTimeMillis();
        System.out.println("연산시간 : " + (end - start));

        str = " ";
        System.out.println(str);

    }
}