package ch10_class;

public class Test01_str {

    public static void main(String[] args) {

        String str = "good morning";

        String s = str.substring(4);
        System.out.println(s);

        String s2 = str.substring(4, 10);
        System.out.println(s2);

        int i = str.indexOf("s");
        System.out.println(i);

        i = str.indexOf("d");
        System.out.println(i);
        // 첫글자 0부터 시작
    }
}