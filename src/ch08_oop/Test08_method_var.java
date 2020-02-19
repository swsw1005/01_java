package ch08_oop;

class SangPum {
    String pum; // 품명
    int su; // 수량
    int dan;// 단가

    // 사용자 정의 메소드
    public void setData(String pum, int su, int dan) {

        this.pum = pum;
        this.su = su;
        this.dan = dan;
    }// setDate end

    // 사용자 정의 메소드
    public void disp() {
        System.out.println("품명  " + this.pum);
        System.out.println("수량  " + this.su);
        System.out.println("단가  " + dan);
        System.out.println("금액  " + (su * dan));
        System.out.println();
    }// disp end

}// class end

public class Test08_method_var {

    public static void main(String[] args) {
        SangPum p = new SangPum();
        p.setData("쌈밤", 4, 9000);
        p.disp();

        p.setData("라면", 4, 1500);
        p.disp();

    }
}