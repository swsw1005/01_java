package swsw.ch02;

public class Test03 {

    public static double simpleRatio(int x, int y) {
        return ((double) x) / ((double) y);
    }

    public double ssimpleRatio(int x, int y) {
        return ((double) x) / ((double) y);

    }

    public static void main(String[] args) {

        double z = simpleRatio(1, 6);
        // static 메소드 : 객체생성없이 쓴다
        System.out.println(z);

        Test03 tt = new Test03();
        z = tt.ssimpleRatio(2, 5);
        // 일반 메소드 : 객체생성 필요

    }
}