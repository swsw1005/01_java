package ch10_class;

class Panmae3 {

    protected String pum;
    protected int su;
    protected int dan;

    public Panmae3() { // 디폴트 생성자
    }

    public Panmae3(String pum, int su, int dan) {
        this.pum = pum;
        this.dan = dan;
        this.su = su;
    } // cons end

    public void disp() {

        System.out.println("----------------------");
        System.out.println(pum + "-\t-" + su + "-\t-" + dan);
        System.out.println("----------------------");

    } // disp end
} // class end--------------------------------------
  // -----------------------------------------------

class SalePanmae extends Panmae3 {

    private double rate;

    public SalePanmae() {
    }

    public SalePanmae(String pum, int su, int dan, double rate) {

        super(pum, su, dan);
        this.rate = rate;
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("할인된 금액\t" + (int) (dan * (1 - rate)));
    } // disp end

} // class end--------------------------------------
  // -----------------------------------------------

public class Test10_upcasting {

    public static void main(String[] args) {
        Panmae3 p3 = new Panmae3("부대찌개", 1, 7000);

        p3.disp();

        p3 = new SalePanmae("김치찌개", 2, 8000, 0.3);

        p3.disp();

    }
}