package ch01;

public class Test10 {

    public static void main(String[] args) {
        String name = "朴";
        System.out.println("name : " + name);

        System.out.println("\"hello\""); // "hello'"
        // System.out.println('\n');
        System.out.println("\'hello\'"); // 'hello'

        System.out.println("\u0041"); // A
        System.out.println("\u0042"); // B
        System.out.println("\45"); // %
        System.out.println("\55"); // -
        System.out.println("\65"); // 5
        System.out.println("\66"); // 6

    }
}