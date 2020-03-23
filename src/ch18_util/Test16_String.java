package ch18_util;

public class Test16_String {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Good";

        System.out.println(s1.concat(s2));
        System.out.println(s1.length());
        System.out.println(s1.concat(s2).length());
        System.out.println(s1.replace('e', 'a'));

        String msg = "홍길동 저팔계 손오공";

        System.out.println(msg.replace("저팔계", "왜이러셩"));

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

    } // main end
} // class end
