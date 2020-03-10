package ch09_cons;

//super : 부모(수퍼)클래스 객체 ★☆☆☆☆
//super()  : 부모(수퍼)클래스 내의 생성자 호출 ★★★★★

class SuperTest { // 아버지 클래스
    String title;
    int num;

    public SuperTest() { // 아버지 생성자
    }

    public SuperTest(String title, int num) {
        this.title = title;
        this.num = num;
    }

    public void disp() {
        System.out.println(title + "\t" + num);
    }

}

class SubTest extends SuperTest {// 상속받은 자식 클래스
    public SubTest() {
        super("연습1", 100);// 상위클래스 생성사 호출
    }
}

class ID extends ch08_oop.Test14_dto {
    // 다른 패키지에서 상속받기

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getId() {
        return super.getId();
    }

}

public class Test05_super {

    public static void main(String[] args) {
        SubTest st = new SubTest(); // 객체 생성
        st.disp(); // 객체.메서드()

        System.out.println("----------");

        ID id = new ID();
        id.setId("swsw");
        System.out.println(id.getId());

    }
}