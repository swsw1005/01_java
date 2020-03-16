package swsw.generic;

// StudentInfo <> EmployeePerson 비슷
// StudentPerson <> EmpolyeePerson 비슷
// 하나로 구현해보자

// Person p1 = new Person("부장");
// EmployeeInfo ei2 = (EmployeeInfo) p1.info;
// System.out.println(ei2.rank);
// 컴파일 에러 뜨지 않는다....논리 에러
// <<< 타입이 불안정하다 >>>
// 논리에러 없게 코드를 짜라.
// ?? 불편한 컴파일 언어의 혜택.

// 편의성 위해 코드를 합쳤지만, 타입이 불안정해졌다.
// 2마리 토끼를 동시에...제네릭을 이용하자.

// Person<EmployeeInfo, int> p1
// = new Person<EmployeeInfo, int>(new EmployeeInfo(1),id);
//
// 제네릭에는 레퍼런스data타입만 가능 ... int char 등 사용불가
// 진짜 못쓰나? WrapperClass
// int 대신 Integer

// wrapper class 이용해서...2라는 값을 가지는 Integer id 인스턴스 생성

// 래퍼클래스 Integer의 메소드 intValue()
// 담고있는 숫자를 원시data타입 int로 반환;

class EmployeeInfo2 {
    public int rank;

    EmployeeInfo2(int rank) {
        this.rank = rank;
    }
}

class Person2<T, S> {
    public T info;
    public S id;

    Person2(T info, S id) {
        this.info = info;
        this.id = id;
    }

}

public class Test03 {

    public static void main(String[] args) {

        EmployeeInfo2 ee = new EmployeeInfo2(1);
        Integer ii = new Integer(2);
        Person2<EmployeeInfo2, Integer> p1 = new Person2<EmployeeInfo2, Integer>(
                ee, ii);

        System.out.println("p1.id.intValue() : " + p1.id.intValue());
        System.out.println("p1.info.rank : " + p1.info.rank);

    }
}