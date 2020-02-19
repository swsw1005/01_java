package ch08_oop;

import ch01.Demo4;

public class Test02_method {

    public int aa() {
        System.out.println("aa!");
        return 100;
    }

    public double bb() {
        System.out.println("bb!");
        return 12.7;
    }

    public void cc() {
        System.out.println("cc!");
    }

    public String name() {
        return "아이유";
    }

    public static void main(String[] args) {
        Test02_method t = new Test02_method(); // 객체생성
        int a = t.aa();

        String irum = t.name();

        System.out.println("a\t" + a);
        double b = t.bb();
        System.out.println("b\t" + b);
        System.out.println("irum\t" + irum);
        t.cc();

        Demo4 de3 = new Demo4();
        de3.dd();

    }
}