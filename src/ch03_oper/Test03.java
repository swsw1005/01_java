package ch03_oper;

// 논리연산자

// 일반 논리연산자     비트 논리연산자

// &&  and             &   and
// ||  or              |   or
// !   not             ~   not^

// 관계연산자 논리연산자 함께 사용시
// 관계연산자 우선
public class Test03 {
    public static void main(String args[]) {

        int a = 10;
        int b = 7;
        System.out.println("a > b && a >= b\t\t" + (a > b && a >= b));
        // true
        System.out.println("a > b || a < b\t\t" + (a > b || a < b));
        // true || false = true

        a = 10;
        // 00001010
        b = 7;
        // 00000111

        System.out.println(a & b);
        // 00000010
        // 2의자리만 a b 둘다 1
        System.out.println(a | b);
        // 00001111 = 15
        System.out.println(a ^ b);
        // 같을때 0 (1이 짝수개 = 0)
        // 1이 홀수개 = 1
        // 00001101 = 13
        System.out.println(a ^ b ^ (a ^ b));
        // 00001010 a
        // 00000111 b
        // 00001101 a^b
        // 00000000 a^b^(a^b)
    } // main end
} // class end