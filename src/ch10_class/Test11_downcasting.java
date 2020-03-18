package ch10_class;

class Super2 {

    public void disp() {

        System.out.println("Super2.disp() call----");
    }

} // class end----------------------------
  // -------------------------------------

class Sub2 extends Super2 {
    @Override
    public void disp() {
        System.out.println("Sub2.disp() call----");
    }

    public void aa() {
        System.out.println("Sub2.aa() call----");
    }

} // class end----------------------------
  // -------------------------------------

public class Test11_downcasting {

    public static void main(String[] args) {

        Super2 s2 = new Super2();
        s2.disp();

        System.out.println("------------------------");

        s2 = new Sub2();
        s2.disp();

        System.out.println("------------------------");

        ((Sub2) s2).aa();
        // s2.disp();

    }
} // class end----------------------------
  // -------------------------------------
