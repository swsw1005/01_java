package ch10_class;

class GeneralSuper {

    static int roomNo = 100;
}// class end

public class Test04_extends extends GeneralSuper {

    public static void main(String args[]) {
        /// static 메서드는 static 변수, 메서드만 호출 가능

        System.out.println("roomNo \t: " + roomNo);

    }// main end
}// class end