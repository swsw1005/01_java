package swsw.polymorphism;

class A {

    public static final int cnt1 = 1;
    public static final int cnt2 = 2;

    public int c1() {
        return cnt1;
    }

    public int c2() {
        return cnt2;
    }

    public void xx() {
        System.out.println("A.x");
    }

    public void yy() {
        System.out.println("A.y");
    }
}

class B extends A {

    public static final int cnt1 = 5;

    public int c1() {
        return cnt1;
    }

    public int c2() {
        return cnt2;
    }

    public void xx() {
        System.out.println("B.x");
    }

    public void zz() {
        System.out.println("B.z");
    }
}

class B2 extends A {

    public static final int cnt2 = 6;
    public static final int cnt3 = 8;

    public int c1() {
        return cnt1;
    }

    public int c2() {
        return cnt2;
    }

    public int c3() {
        return cnt3;
    }

    public void xx() {
        System.out.println("B2.x");
    }
}

interface I2 {
    public String A();
}

interface I3 {
    public String B();
}

class D implements I2, I3 {
    public String A() {
        return "A";
    }

    public String B() {
        return "B";
    }
}

public class C {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();
        B a3 = new B();
        // B a4 = new A();

        A a5 = new B2();
        B2 a6 = new B2();

        System.out.println("1----");
        a1.xx(); // A.x
        a2.xx(); // B.x --> 생성자 B + 양쪽 모두 존재 = 오버로딩?
        a3.xx(); // B.x --> //
        System.out.println("2----");
        a1.yy(); // A.y
        a2.yy(); // A.y --> A의 메소드 그대로 상속
        a3.yy(); // A.y --> //
        System.out.println("3----");
        // a1.zz(); --> A니까 zz 불가 (B의 고유 메소드)
        // a2.zz(); --> 데이터형(앞부분) A....B로 생성했어도 A쓰는것과 동일
        a3.zz(); // B.z
        System.out.println("4----");
        a2.xx(); // B.x
        a5.xx(); // B2.x
        a6.xx(); // B2.x
        // 3개 다 B, B2의 메소드로 오버라이딩
        System.out.println("5----");
        System.out.println(a1.c1()); // 1
        System.out.println(a1.c2()); // 2

        System.out.println(a2.c1()); // 5
        System.out.println(a2.c2()); // 2

        System.out.println(a3.c1()); // 5
        System.out.println(a3.c2()); // 2

        System.out.println(a5.c1()); // 1
        System.out.println(a5.c2()); // 6

        System.out.println(a6.c1()); // 1
        System.out.println(a6.c2()); // 6
        // 오버로딩안된 값은 수퍼클래스 그대로,
        // 오버로딩한 값은 새로운 값으로 (생성자 기준)
        System.out.println("6----");
        // System.out.println(a5.c3()); 데이터형 A... c3()은 B2 메소드
        System.out.println(a6.c3());

        System.out.println("7----");
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        obj.A();
        obj.B();

        objI2.A();
        // objI2.B();
        // objI3.A();
        objI3.B();
        // 데이터형 I2 ... == 외부에서 제어할 인터페이스를 I2 멤버로 제한한다

    }

}