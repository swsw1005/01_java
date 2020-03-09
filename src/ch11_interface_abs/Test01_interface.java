package ch11_interface_abs;

interface AA {

    int MAX = 100; // 무조건 static final

    void aa();// 무조건 public
}

interface AA2 {
    void aa2();
}

class BB implements AA {

    @override
    public void aa() {
        System.out.println("interface aa()method overriding...");
    }
}

class CC implements AA, AA2 {

    @override
    public void aa() {
        System.out.println("AA aa overriding");
    }

    @override
    public void aa2() {
        System.out.println("AA2 aa2 overriding");
    }
}

public class Test01_interface {

    public static void main(String[] args) {

        System.out.println("-1-------");

        AA A = new BB();
        A.aa();

        System.out.println("-2-------");

        AA a2 = new CC();
        a2.aa();

        System.out.println("-3-------");

        AA2 A2_1 = new CC();
        A2_1.aa2();

        System.out.println("-4-------");

        BB b1 = new BB();
        b1.aa();

        System.out.println("-5-------");
    }

}

// public Test01_interface(); // 추상 생성자

// public static void aa();// static 추상 메소드

// private void bb();// private 추상 메소드
