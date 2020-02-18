package ch08_oop;

public class Test02_method {

    public int aa() {
        System.out.println("aa!");
        return 100;
    }

    public double bb() {
        System.out.println("bb!");
        return 12.7;
    }

    public String name() {
        return "아이유";
    }

    public static void main(String[] args) {
        Test02_method t = new Test02_method(); // 객체생성
        int a = t.aa();
        double b = t.bb();
        String irum = t.name();

        System.out.println("a\t" + a);
        System.out.println("b\t" + b);
        System.out.println("irum\t" + irum);
    }
}