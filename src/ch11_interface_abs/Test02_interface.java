package ch11_interface_abs;

interface AAA {
    void aa();
}

interface BBB extends AAA {
    void bb();
}

interface CCC extends BBB {
    void cc();
}

class DDD implements CCC {
    // 모든 메소드 override 해줘야 ...
    @override
    public void aa() {
        System.out.println("aa call");
    };

    @override
    public void bb() {
        System.out.println("bb call");
    };

    @override
    public void cc() {
        System.out.println("cc call");
    };
}

public class Test02_interface {
    public static void main(String args[]) {
        CCC a = new DDD();
        a.aa();
        a.bb();
        a.cc();

        System.out.println();

        DDD a2 = new DDD();
        a2.aa();
        a2.bb();
        a2.cc();
    } // main end
} // class end---------------------------------
  // ------------------------------------------
