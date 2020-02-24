package ch10_class;

// 부모클래스
class PersonSuper {
    protected String name;

    public PersonSuper() {
    }

    public PersonSuper(String name) {
        this.name = name;
    }// cons end

    public void disp() {
        System.out.println("이름 \t" + name);
    }
}

// 자식클래스 1
class PersonSub extends PersonSuper {
    private double left_eye;
    private double right_eye;

    public PersonSub() {
    }// 디폴트생성자

    public PersonSub(String name, double left_eye, double right_eye) {
        super(name);
        this.left_eye = left_eye;
        this.right_eye = right_eye;
    }// 생성자 end

    @Override
    public void disp() {
        System.out.println("이름 \t" + name);
        System.err.println("좌안 시력\t" + left_eye);
        System.err.println("우안 시력\t" + right_eye);
    }// disp end

}// class end

// 자식 클래스 2
class PersonSin extends PersonSuper {
    private String addr;// 전역변수, 주소
    private String hp;// 전역변수, 전화번호

    public PersonSin() {
    }

    public PersonSin(String name, String addr, String hp) {
        super(name);// 이것좀 해주세요
        this.addr = addr;/// 제껀 제가 할께요
        this.hp = hp;
    }

    @Override
    public void disp() {
        System.out.println("이름 \t" + name);
        System.err.println("주소\t" + addr);
        System.err.println("폰번호\t" + hp);
    }// disp end

}// class end

// main 클래스
public class Test07_extends {

    public static void main(String[] args) {

        PersonSuper m = new PersonSuper("홍길동");
        m.disp();

        m = new PersonSub("이순신", 1.5, 1.7);
        m.disp();

        m = new PersonSin("박문수", "서울 구로", "010-1234-4567");
        m.disp();
    }// main end
}
// class end