package ch18_util;

enum Gender {
    MALE, FEMALE;
}
// 내부적으로 생략되었을 뿐 다음 class와 같습니다.
// class Gender {
// public static final Gender MALE = new Gender();
// public static final Gender FEMALE = new Gender();
// }

public class Enum_test {

    public static void main(String[] args) {

        // enum??
        // 서로 관련 있는 상수를 클래스형으로 집합.
        // 새로운 Enum class 선언하면, 내부적으로 static final 객체 생성.

        // 그리고나서 다음과 같이 Gender 타입으로 gender2라는 변수를 선언합니다.
        Gender gender2;

        // gender2가 Gender타입이기 때문에 다음과 같이 Gender타입인 MALE, FEMALE을 할당 할 수 있습니다.
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        // gender2 = "boy"; // 컴파일 에러 검출

        // 여기서 의문점이 드셔야합니다.
        // enum class의 인스턴스를 따로 생성하지 않고 바로 MALE, FEMALE 접근하였는데.
        System.out.println(gender2);

    } // main end
} // class end