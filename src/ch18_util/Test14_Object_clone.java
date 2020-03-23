package ch18_util;

public class Test14_Object_clone implements Cloneable {

    // 변수
    String name;

    // 생성자
    public Test14_Object_clone(String name2) {
        this.name = name2;
    }// cons end

    @Override
    public String toString() {
        return name + "입니다";
    }

    // main
    public static void main(String[] args) {

        try {

            Test14_Object_clone A = new Test14_Object_clone("AAA");
            System.out.println(A.toString());
            System.out.println(A.getClass());
            System.out.println(A.hashCode());

            // 객체복사
            Test14_Object_clone B = (Test14_Object_clone) A.clone();
            System.out.println(B.toString());
            System.out.println(B.getClass());
            System.out.println(B.hashCode());

            if (A == B) {
                System.out.println("같다");
            } else {
                System.out.println("다르다");
            } // 다르다

            if (A.equals(B)) {
                System.out.println("같다");
            } else {
                System.out.println("다르다");
            } // 다르다

            if ((A.toString()).equals(B.toString())) {
                System.out.println("같다");
            } else {
                System.out.println("다르다");
            } // 같다(문자열은 같다)

        } catch (Exception ex) {
            System.out.println(ex);
        }

    } // main end
}