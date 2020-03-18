package ch10_class;

class Panmae5 {

    protected String pum;
    protected int su;
    protected int dan;

    public Panmae5() {
    }

    public Panmae5(String pum, int su, int dan) {
        this.pum = pum;
        this.su = su;
        this.dan = dan;
    } // cons end

    public void disp() {
        System.out.println("품명 : " + pum);
        System.out.println("수량 : " + su);
        System.out.println("단가 : " + dan);
    }

} // class end

class SalesPanmae5 extends Panmae5 {

    private double rate;

    public SalesPanmae5() {
    }

    public SalesPanmae5(String pum, int su, int dan, double rate) {
        super(pum, su, dan);
        this.rate = rate;
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("할인율 : " + rate);
    }

    public void discount() {
        System.out.println("discount : " + (int) (dan * su * (1 - rate)));
    }

} // class end

public class Test12_downcasting {

    public static void main(String[] args) {

        Panmae5 p5[] = new Panmae5[4];

        p5[0] = new Panmae5("비빔밥", 1, 6000);
        p5[1] = new SalesPanmae5("설렁탕", 3, 8000, 0.2);
        p5[2] = new Panmae5("순대국", 1, 6000);
        p5[3] = new SalesPanmae5("부대찌개", 6, 8000, 0.2);

        for (int i = 0; i < p5.length; i++) {
            p5[i].disp();

            // // p5가 SalesPanmae5 클래스인 경우에만
            // discount 메소드 불러온다.
            // 할인단가 포함됨
            /// rate??? override 된 disp() 내장
            if (p5[i] instanceof SalesPanmae5) {
                ((SalesPanmae5) p5[i]).discount();
            } // if end

            System.out.println("---------");

        } // for end

    } // main end
} // class end