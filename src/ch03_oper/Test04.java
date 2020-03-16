package ch03_oper;
// shift 연산

// 좌 shift << : 1비트씩 왼쪽이동, 우측은 0으로 채운다
// 우 shift >> : 1비트씩 오른쪽이동, 좌측은 sign bit로 채운다

public class Test04 {
    public static void main(String args[]) {

        int a = 10; // 00001010
        int b = 7; // 00000111

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println("\n\n");

        int c = b << 2;
        // 00000111 >> 00011100
        System.out.println("c :\t=\t" + c);
        System.out.println(Integer.toBinaryString(c));
        int d = b >> 2;
        System.out.println("d :\t=\t" + d);
        System.out.println(Integer.toBinaryString(d));
        // 00000111 >> 00000001
        System.out.println("\n");

        c = c * (-1);
        b = b * (-1);
        System.out.println("c :\t=\t" + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("d :\t=\t" + d);
        System.out.println(Integer.toBinaryString(d));
        System.out.println("\n");

        c = ~c; // 보수
        b = ~b; // 보수
        System.out.println("c :\t=\t" + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("d :\t=\t" + d);
        System.out.println(Integer.toBinaryString(d));
        System.out.println("\n");

        c = ~c;
        b = ~b;
        c = c << 3;
        d = d << 3;
        System.out.println("c :\t=\t" + c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println("d :\t=\t" + d);
        System.out.println(Integer.toBinaryString(d));
        System.out.println("\n");

    }

}