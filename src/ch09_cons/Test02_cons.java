package ch09_cons;

class SinSang {

    String name;
    int age;
    double ki;

    public SinSang() {
        System.out.println("디폴트 생성자");
    }

    public SinSang(String name, int age, double ki) {
        System.out.println("name, age, ki 생성자");

        this.name = name;
        this.age = age;
        this.ki = ki;
    }

    public SinSang(int age, String name, double ki) {
        // System.out.println("age, name, ki 생성자");
        this.name = name;
        this.age = age;
        this.ki = ki;
    }

    public void disp() {
        System.out.println("\n이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("키 : " + this.ki);
    }

    public void disp(String name, int age, double ki) {
        this.name = name;
        this.age = age;
        this.ki = ki;

        disp();
    }

    public void disp(String name, double ki, int age) {
        this.name = name;
        this.age = age;
        this.ki = ki;

        disp();
    }

} // class end

public class Test02_cons {

    public static void main(String[] args) {
        SinSang ss = new SinSang();
        ss.disp();
        System.out.println("---------------");
        SinSang kim = new SinSang();
        kim.disp("김연아", 15, 177.5);

    }
}