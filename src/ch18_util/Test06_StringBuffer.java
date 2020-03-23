package ch18_util;

public class Test06_StringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println("--------------------");
        sb.append("hello");
        sb.append("good");

        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println("--------------------");
        sb.append(new java.util.Date());

        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("--------------------");

        StringBuffer sb1 = new StringBuffer("");

        System.out.println(sb1.toString());
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println("--------------------");

        String str = "";

        for (int i = 0; i < 100; i++) {
            sb1.append("a");
            int a = sb1.length();
            int b = sb1.capacity();
            str = str + a + " " + b + "\n";
        }

        System.out.println(str);
    }
}