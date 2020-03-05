package ch08_oop;

class SinSang {
    // 전역변수
    String name;
    int age;
    double height;
    // 값을 세팅하는 메서드

    public void setData(String name, int age, double height) {
        // this.전역변수 = 매개변수
        this.name = name;
        this.age = age;
        this.height = height;

    }// setData end

    public void disp() {
        System.out.println("이름\t>\t" + name);
        System.out.println("나이\t>\t" + age);
        System.out.println("키\t>\t" + height);
        System.out.println();
    }// disp end

    public void disp2() {
        System.out.println(name + "\t" + age + "\t" + height);
    }
}// class SinSang end

public class Test07_method_var {

    public static void main(String[] args) {
        SinSang ss = new SinSang();// 객체생성

        ss.setData("홍길동", 5, 100.352);
        ss.disp();

        ss.setData("아이유", 25, 160.11);
        ss.disp();





        ss.age = 26;
        ss.disp();

        for (int i = 0; i < 100; i++) {
                 ss.setData("서장훈", 1 + i, 100 + i * 1.5);
            ss.disp2();
            if (ss.height >= 200) {
                break;
            }
        }
        System.out.println();

    }// main end
}// class end