package ch08_oop;

class Idol_girl {
    private String name;
    int age;
    public double ki;
    protected String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    // 생성자
    // >>> 인스턴스 만드는 특수한 메소드
    // 1. 클래스명과 같은 이름 써야한다.
    // 2. 리턴값 없다.
    // 3. 객체필드 초기화
    // 4. 인수를 갖는다. 오버로드(같은 이름 클래스) 가능하다
    // 5. 생성자 없으면 내부적으로 디폴트 생성자 취급

}// class end

public class Test13_var {

    public static void main(String[] args) {
        Idol_girl iu = new Idol_girl();
        // iu.name = "아이유";
        // private 사용불가
        iu.age = 17;
        iu.ki = 159.7;
        iu.addr = "서울시 구로구 당산동 123-45";

        // System.out.println(iu.name);
        System.out.println(iu.age);
        System.out.println(iu.ki);

        System.out.println(iu.addr);

    }
}