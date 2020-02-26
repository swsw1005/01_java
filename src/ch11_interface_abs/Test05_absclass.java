package ch11_interface_abs;

abstract class Abs {
    String name;// 전역변수

    // 생성자
    public Abs(String name) {
        this.name = name;
    }

    // 일반메소드
    public void kk() {
        System.out.println("# 추상클래스 내부 일반메소드KK");
    }

    // 추상메소드
    abstract public void disp();
}// class end ------------------------------------
 // --------------------------------------------

public class Test05_absclass extends Abs {

    // 생성자
    public Test05_absclass(String name) {
        super(name);
    }

    // 오버라이딩
    public void disp() {
        System.out.println("# 추상메소드 overriding  disp");
        System.out.println("name\t" + name);
    }

    public static void main(String[] args) {
        Test05_absclass t = new Test05_absclass("홍길동");

        t.kk();
        t.disp();

    }// main end
}// class end