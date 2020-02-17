package swsw.ch01;

public class sw5 {

    public static void main(String[] args) {

        // 문자열 처리 메소드
        System.out.println("01-----------------");
        String text = " Hello java world";
        char c = text.charAt(2);

        System.out.println(text);
        System.out.println(c);

        System.out.println("02-----------------");
        String t = text.concat("s");
        System.out.println(t);

        System.out.println("03-----------------");
        boolean b1 = text.contains("And");
        boolean b2 = text.contains("and");
        System.out.println(b1 + "\t\t" + b2);

        System.out.println("04-----------------");
        String text2 = "Hello java world";
        boolean b3 = text.trim().equals(text2);
        System.out.println(b3);

        System.out.println("05-----------------");
        String text3 = "hello JAVA world";
        boolean b4 = text.trim().equalsIgnoreCase(text3);
        System.out.println(b4);

        System.out.println("06-----------------");
        int index = text.indexOf("v");
        System.out.println(index);

        System.out.println("07-----------------");
        int index1 = text.indexOf("a");
        int index2 = text.indexOf("o");
        int index3 = text.indexOf("r");
        int index4 = text.indexOf("x");
        System.out.printf("%d\t%d\t%d\t%d", index1, index2, index3, index4);
        System.out.println();

        System.out.println("08-----------------");
        String trim_text = text.trim();
        System.out.println(text);
        System.out.println(trim_text);

        System.out.println("09-----------------");
        int l1 = text.length();
        int l2 = text.trim().length();
        int l3 = text2.length();
        System.out.printf("%d\t%d\t%d\t", l1, l2, l3);
        System.out.println();

        System.out.println("10-----------------");
        String text4 = "12345678901234567890";
        String text4_index = text4.substring(7);
        System.out.println(text4_index);

        System.out.println("11-----------------");
        String text_replace = text.replace("Hello", "Bye Bye");
        System.out.println(text_replace);
        text_replace = text_replace.replace("java", "JAVA");
        System.out.println(text_replace);

    }
}