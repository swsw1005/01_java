package swsw.generic;

public class Test01 {

    public static void main(String[] args) {

        // String형으로 Person 객체 생성 p1
        Person<String> p1 = new Person<String>();
        Person<Double> p2 = new Person<Double>();
        // p1.info는 int형
        p1.info = "이것은 String";
        p2.info = 123.123;
        System.out.println(p1.info); // 이것은 String
        System.out.println(p2.info); // 123.123

        // Double형으로 Person 객체 생성 p3
        Person<Double> p3 = new Person<Double>();
        // p3.info는 double형
        p3.info = 12.134;
        System.out.println(p3.info);// 12.134

    }
}

/**
 * InnerTest01
 */
class Person<T> {
    public T info;
}
// Person 객체 생성하면서 T에 넣어준 타입으로 변수 info이 결정됨