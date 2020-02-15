package swsw.ch01;

public class sw4 {

    public static void main(String[] args) {
        String a = "show me the money";

        String b = "show me the m";

        String c = b.concat("oney");

        boolean ab = a.equals(b);
        boolean ac = a.equals(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(ab);
        System.out.println(ac);
    }
}