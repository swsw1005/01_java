package ch08_oop;
// static 변수...모든 객체 공유

// 잘못된 사용 예제

class Sangpum2 {
    String pum;
    int su;
    static int dan;

    // 사용자 정의 메소드
    public void setData(String p, int s, int d) {
        // setDate(3개의 인자)
        pum = p;
        su = s;
        dan = d;
        // 각각 pum, su, dan에 넣는다.

    }// setData end

    // 사용자 정의 메서드
    public void disp() {
        System.out.println("품명\t" + pum);
        System.out.println("수량\t" + su);
        System.out.println("단가\t" + dan + "\n");
    }

}
//

public class Test12_static_var {

    public static void main(String[] args) {

        Sangpum2 apple = new Sangpum2();
        Sangpum2 banana = new Sangpum2();
        Sangpum2 orange = new Sangpum2();
        Sangpum2 cocoa = new Sangpum2();

        apple.setData("사과", 5, 2000);
        banana.setData("바나나", 1, 3500);
        orange.setData("오렌지", 7, 1000);
        cocoa.setData("코코아", 23, 9999);

        apple.disp();
        banana.disp();
        orange.disp();
        // dan은 static...
        // 마지막에 입력된 9999로 전역 적용.

        Sangpum2.dan = 1515;
        System.out.println("\ndan을 1515로 바꾼 결과\n\n");

        apple.disp();
        banana.disp();
        orange.disp();
        // 모든 단가 1515로 출력
    }
}