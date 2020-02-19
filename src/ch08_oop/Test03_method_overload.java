package ch08_oop;

//메서드 중복
//하나의 클래스 안에 이름같은 메서 여러개
// 자료형, 매개변수 갯수로 구분
//접근제한자 같아도 달라도 no상관
//또다른 클래스에  상속 가능

// 접근제한자
// private   현재 객체 내에서만 접근
// default(생략)  같은 패키지 내에서만 접근
// proteced  같은 패키지 객체와 상속관계인 객체들만
// public   모든 접근 허용

public class Test03_method_overload {

    public int sum(int a, int b) {

        int s;
        s = a + b + 100000;
        return s;
    }// sum end

    public double sum(double a, double b) {

        double s;
        s = a + b + 200000;
        return s;
    }

    public float sum(float a, float b) {
        float s;
        s = a + b + 300000;
        return s;
    }

    public static void main(String[] args) {
        Test03_method_overload t2mo = new Test03_method_overload();
        int s1 = t2mo.sum(2, 3);
        double s2 = t2mo.sum(5.24, 56.794);
        float s3 = t2mo.sum(5.5f, 2.2f);
        System.out.println("s1\t" + s1);
        System.out.println("s2\t" + s2);
        System.out.println("s3\t" + s3);
    }// main end

}// class end