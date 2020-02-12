package ch03;

// ch03
// 연산자(operation)
// 1. 산술연산자
//  +	(더하기)
//  - 	(빼기)
//  *	(곱하기)
//  / 	(몫)
//  %	(나머지)

//  ++i	전위연산 (어떤 연산자보다 가장 먼저 연산)
//  i++	후위연산 (어떤 연산자보다 가장 나중에 연산)

//  i++, ++i 	단독 사용시 = 1씩 증가 = 전위 후위 구분 없다
// 		복합 연산시 우선순위 구분

public class Test01 {
    public static void main(String args[]) {

        int a = 5;
        int b = ++a + ++a;
        // ++5 + ++a
        // 6 + ++6
        // 6 + 7
        // 13

        System.out.println("a \t=\t" + a);
        System.out.println("b \t=\t" + b);
        System.out.println("\n");

        a = (int) 7;
        b = (int) 3;

        System.out.println("a+b\t=\t" + (a + b));
        System.out.println("a-b\t=\t" + (a - b));
        System.out.println("a*b\t=\t" + (a * b));
        System.out.println("a/b\t=\t" + (a / b));
        System.out.println("a%b\t=\t" + (a % b));

    } // main end
} // class end