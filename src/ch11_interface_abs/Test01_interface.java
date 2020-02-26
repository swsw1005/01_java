package ch11_interface_abs;

interface AA {

    int MAX = 100; // 무조건 static final

    void aa();// 무조건 public
}

interface AA2 {
    void aa2();
}

class BB implements AA {
    public void aa() {
        System.out.println("interface aa()method overriding...");
    }
}

class CC implements AA, AA2 {

    public void aa() {
        System.out.println("AA aa overriding");
    }

    public void aa2() {
        System.out.println("AA2 aa2 overriding");
    }
}

public class Test01_interface {

    public static void main(String[] args) {
        AA A = new BB();
        A.aa();

        AA A2 = new CC();
        AA2 A2_1 = new CC();
        A2.aa();
        A2_1.aa2();

    }

}

// public Test01_interface(); // 추상 생성자

// public static void aa();// static 추상 메소드

// private void bb();// private 추상 메소드
