package swsw.generic;

public class GenericSum<T, U> {

    // 변수
    private T a;
    private U b;

    // 게터세터
    public T getA() {
        return this.a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public U getB() {
        return this.b;
    }

    public void setB(U b) {
        this.b = b;
    }

    public void sum() {

    }

    public void disp() {
        System.out.println(a + " " + b);
    }

    // swsw.generic.GenericSum<String, Integer> gs1 = new
    // swsw.generic.GenericSum<>();

    // gs1.setA("abc");
    // gs1.setB(123);

    // gs1.disp();
    // System.out.println();

    // System.out.println(gs1.getA());
    // System.out.println(gs1.getB());

    // System.out.println(gs1.getClass());

}