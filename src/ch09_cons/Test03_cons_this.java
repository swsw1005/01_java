package ch09_cons;

//this  자신의 객체
//this()    자신의 클래스 안에있는 생성사 호출
// this()   super()는  생성자 첫줄 기재
// 따라서 동시 사용 불가

class Cons {

    String title;
    int num;

    // 1. 디폴트 생성자
    public Cons() {
        this.title = "제목";
        this.num = 190;

        System.out.println("1 생성자'");
    }

    // 2. 인자있는 생성자
    public Cons(String title) {
        this.title = title;
        this.num = 200;
        System.out.println("2 생성자");
        // 자신의 클래스 내의 생성사 호출한다.
        // 3번 생성자 호출
    }

    // 3.인자있는 생성자
    public Cons(String title, int num) {
        this.title = title;
        this.num = num;

        System.out.println("3 생성자");
    }

    public void disp() {
        System.out.println("title :\t" + title + "\tnum : \t" + num);
    }

}

public class Test03_cons_this {

    public static void main(String[] args) {
        Cons c1 = new Cons();
        c1.disp();

        Cons c2 = new Cons("뭐임마");
        c2.disp();

        Cons c3 = new Cons("뭐", 123);
        c3.disp();
    } // maini end
} // class end