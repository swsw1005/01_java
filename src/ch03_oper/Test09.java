package ch03_oper;
// == 연산자 기본 데이터형 equals() 문자열 비교(대소문자구분) equalsIgnoreCase() 문자열 비교(대소문자 구분X)

// instanceof 객체 비교할때 사용
// ex) Object ob = new Object();
// String str = new String("abc");

// 객체 instanceof 클래스
// ob instanceof Object
// str instanceof Object
// ob instanceof String

public class Test09 {

    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println("s1.equals\t\t" + s1.equals("hello"));
        // hello = hello >> true
        System.out.println("s1.equals\t\t" + s1.equals("Hello"));
        // hello = Hello >> false (대소문자 구별)
        System.out.println(
                "s1.equalsIgnoreCase\t" + s1.equalsIgnoreCase("Hello"));
        // hello = Hello(hello) >> true (대소문자 구별 X)
        System.out.println("\n");

        Object ob = new Object();
        String str2 = new String("abc");

        // instanceof 객체 비교할때 사용한다.
        System.out.println("str2 instanceof String");
        System.out.println(str2 instanceof String);
        System.out.println("str2 instanceof Object");
        System.out.println(str2 instanceof Object);
        System.out.println("ob instanceof String");
        System.out.println(ob instanceof String);

    }
}