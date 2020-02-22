package ch09_cons;

import java.awt.*;//frame 패키지

public class Test04_cons_super extends Frame {
    // Frame 상속받았다.

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Test04_cons_super() {

        super("연습1");// 상위클래스 생성자 호출

        setTitle(this.getTitle());

        super.setSize(450, 450);// 필요없다.
        this.setSize(450, 450);// 필요없다.
        setSize(430, 430);// 상속 받았잖아. 그냥 써도 된다.

        setVisible(true);

    }

    public static void main(String[] args) {
        new Test04_cons_super();// 바로 객체 생성

    }
}

// 객체지향 4특성

// ** 캡슐화 class Test{}
// -----은닉화(private)로 선언된 변수. 외부클래스에서 접근 불가

// ** 상속 class 클래스명 extends 수퍼클래스()

// ** 다형성 overload, overriding

// ** 추상화 (복잡한것을 단순화)
// -------복잡한것 클래스 설계 입장
// -------단순화 클래스를 사용하는 입장

// 다형성이란?
// 프로그램에서 하나의 형태로 여러가지 작업 의미는 하나지만 형태는 다양할수있다.

// 먹는다.(){순대국}
// 먹는다.(){쌈밥}
// 먹는다.(){백반}

// 강남을 간다(){버스}
// 강남을 간다(){전철}
// 강남을 간다(){자가용}

// 오버로드 (중복 메소드)
// ---하나의 클래스 내에 이름 같은 메서드 여러개
// ---매개변수 자료형 매개변수 갯수로 구분
// --- ex) java(int a, int b) != java(int a, String c)

// 오버라이딩
// --- 상속받은 메소드 내용 재정의
// --- 리턴형, 메소드 이름, 매개변수 반드시 같아야 한다.
// --- 접근제한자는 더 넓은 것을 사용할 수 있다.
// --- protected =>> public
// ----상위클래스 ----파생클래스
// --- 또 다른 상속 가능하다.