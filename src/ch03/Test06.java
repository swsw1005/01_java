package ch03;

// 대입연산자

// 연산자      사용법      의미
// =           a = 2       a = 2
// +=          a += 2      a = a+2
// -=          a -= 2      a = a-2
// *=          a *= 2      a = a*2     
// /=          a /= 2      a = a/2
// %=          a %= 2      a = a%2

// <<=         a <<= 2     a = <<2
// >>=         a >>= 2     a = >>2

// &=          
// !=
// ^=

public class Test06 {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("a+=b\t\t" + (a += b));
        a = 10;
        b = 3;
        System.out.println("a-=b\t\t" + (a -= b));
        a = 10;
        b = 3;
        System.out.println("a*=b\t\t" + (a *= b));
        a = 10;
        b = 3;
        System.out.println("a/=b\t\t" + (a /= b));
        a = 10;
        b = 3;
        System.out.println("a%=b\t\t" + (a %= b));
        // 중간에 a b 다시 안잡아주면, a 값은 계속 이어진다.

    }
}
