package ch11_interface_abs;

interface AA3 {
    int aa();
}

interface BB3 {
    char bb();
}

interface CC3 {
    String cc();
}

class DD3 implements AA3, BB3, CC3 {
    public int aa() {
        return 100;
    }

    public char bb() {
        return 'a';
    }

    public String cc() {
        return "홍길동";
    }
}

public class Test03_interface {

    public static void main(String[] args) {
        // 따로 선언 안하고 바로 호출+출력
        System.out.println(new DD3().aa());
        System.out.println(new DD3().bb());
        System.out.println(new DD3().cc());

        // 물론 따로 변수 뽑아서 출력할수도
        DD3 d3 = new DD3();
        int aa_d3 = d3.aa();
        char bb_d3 = d3.bb();
        String cc_d3 = d3.cc();

        System.out.println(aa_d3 + "\n" + bb_d3 + "\n" + cc_d3);
    }
}