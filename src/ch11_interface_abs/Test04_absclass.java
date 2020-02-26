package ch11_interface_abs;

abstract class AbsTest {
    abstract public void aa();// 추상메소드

    public void bb() {
        System.out.println("추상클래스 안의 일반 메서드 bb");
    }

}// class end

class AbsDemo extends AbsTest {
    public void aa() {
        System.out.println("메소드aa");
    }

}

public class Test04_absclass {

    public static void main(String[] args) {

    } // main end
} // class end

// TODO 코드 복사해오기