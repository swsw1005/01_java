package ch10_class;

class Super {
    protected String name; // 전역변수

    public Super() {
        // 디폴트 생성자
    }

    public Super(String name) {
        this.name = name;// this.전역변수 = 매개변수
    }

    public void disp() {
        System.out.println("이름\t" + name);
    }

}// class end-----------------------------------
 // --------------------------------------------

class SungSub extends Super {

    private int kor;
    private int eng;
    private int tot;

    public SungSub() {
    }// 디폴트 생성자

    public SungSub(String name, int kor, int eng) {

        super(name);
        this.kor = kor;
        this.eng = eng;
        tot = eng + kor; // 총점계산
    }// cons end

    @Override
    public void disp() {

        System.out.println("-----------------------------");
        super.disp(); // 수퍼클래스에서 이름 출력해준다.
        // System.out.println("이름\t" + name);
        System.out.println("kor\t" + kor);
        System.out.println("eng\t" + eng);
        System.out.println("tot\t" + tot);

        System.out.println("-----------------------------");
    }

}// class end-----------------------------------
 // --------------------------------------------

class SinSub extends Super {

    private int age;
    private String addr;

    public SinSub() {
    }

    public SinSub(String name, int age, String addr) {
        super(name);// 수퍼클래스 생성자 호출
        this.age = age;
        this.addr = addr;
    }

    @Override
    public void disp() {

        System.out.println("-----------------------------");
        super.disp(); // 이름은 super클래스에서 처리
        System.out.println("age \t" + age);
        System.out.println("addr \t" + addr);
        System.out.println("-----------------------------");

    }// disp end
}// class end-----------------------------------
 // --------------------------------------------}

public class Test08_extends {

    public static void main(String[] args) {

        Super s = new SungSub("임성우", 50, 60);

        s.disp();

        s = new SinSub("홍길동", 25, "서울시 강남구");

        s.disp();

    }
}// class end-----------------------------------
 // --------------------------------------------

//