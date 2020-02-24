package ch10_class;

class PanMae {
    protected String pum;
    protected int su;
    protected int dan;

    /// 기본생성자
    public PanMae() {
    }

    // 인자있는 생성자
    public PanMae(String pum, int su, int dan) {
        this.pum = pum;
        this.su = su;
        this.dan = dan;
    }

    // 사용자 정의 메소드
    public void disp() {
        System.out.print("pum =\t" + pum);
        System.out.print("\tsu =\t" + su);
        System.out.print("\tdan =\t" + dan);
        System.out.println();
    }
}// class end
 //////////////////////////////////////////////////////////

// 자식 클래스
class PanMaeSub extends PanMae {
    private double rate;

    // 디폴트생성자
    public PanMaeSub() {
    }

    // 생성자
    public PanMaeSub(String pum, int su, int dan, double rate) {

        super(pum, su, dan);// 수퍼클래스 생성자 호출
        this.rate = rate;
    }// cons end

    //// 오버라이딩.
    public void disp() {
        System.out.print("pum =\t" + pum);
        System.out.print("\tsu =\t" + su);
        System.out.print("\tdan =\t" + dan);
        System.out.print("\trate =\t" + rate);
        System.out.println();
    }

}// class end

//////////////////////////////////////////////////////

public class Test06_extends {

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        // 판매 메소드
        PanMae m = new PanMae("사과", 50, 2000);
        m.disp();

        System.out.println("---------------------------------------");

        // m 재활용해서 판매sub 까지 구현
        m = new PanMaeSub("바나나", 10, 2000, 55);
        m.disp();
        System.out.println("---------------------------------------");

    }
}