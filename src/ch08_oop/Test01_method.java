package ch08_oop;

public class Test01_method {
    public void aa() {
        System.out.println("aa() call...");
    }

    public void bb() {
        System.out.println("bb() call...");
    }

    public static void main(String args[]) {
        Test01_method t1 = new Test01_method();
        t1.aa();
        t1.bb();
    }

}