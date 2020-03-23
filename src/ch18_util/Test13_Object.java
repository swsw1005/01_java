package ch18_util;

// protected Object clone() 객체 복사

// public Class getClass()
// 객체 클래스 이름 class형으로 반환

// public String toString 객체를 문자열로 반환한다.

// public void notify() 현제 스레드 완료 알림

// public void notifyAll() 현재 스레드 완료 모두에게 알림

// public void wait() 현제 스레드 기다리게...(대기상태)

import static java.lang.System.out;

class Test {
}

public class Test13_Object {

    public static void main(String[] args) {
        Test A = new Test();
        Test B = new Test();
        Test C = new Test();
        Test D = new Test();
        System.out.println("-----\tgetClass()\t-----");
        out.println(A.getClass());
        out.println(B.getClass());
        out.println(C.getClass());
        out.println(D.getClass());
        System.out.println("-----\thashCode()\t-----");
        out.println(A.hashCode());
        out.println(B.hashCode());
        out.println(C.hashCode());
        out.println(D.hashCode());
        System.out.println("-----\ttoString()\t-----");
        out.println(A.toString());
        out.println(B.toString());
        out.println(C.toString());
        out.println(D.toString());
        System.out.println("-----\t그냥 인쇄()\t-----");
        out.println(A);
        out.println(B);
        out.println(C);
        out.println(D);

        System.out.println("-----\tgetClass()\t-----");

    }
}