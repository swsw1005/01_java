package ch18_util;

public class Test15_String {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String ss = "Hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2); // true 같은 글자 > 같은 메모리
        System.out.println(s3 == s4); // false 객체생성 > 다른 메모리
        System.out.println(s1 == ss); // false 다른 글자 > 다른 메모리

        System.out.println(s1.hashCode()); // 99162322
        System.out.println(s2.hashCode()); // 99162322
        // 그냥 변수일때...같은 값이면 같은 메모리 참조

        s2 = "hello2";
        System.out.println(s2.hashCode()); // -1220935264
        s1 = "hello2";
        System.out.println(s1.hashCode()); // -1220935264
        // 값이 바뀌면 주소가 바뀌지만...여전히 같은값이면 같은 hashCode

        s1 = "hello";
        s2 = "hello";
        System.out.println(s1.hashCode()); // 99162322
        System.out.println(s2.hashCode()); // 99162322
        // 다시 같은 곳으로

        if (s3.equals(s4)) { // true
            System.out.println("같습니다.");
        }

    }
}