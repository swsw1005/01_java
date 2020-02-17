package ch07_array;

public class Test04_arr {

    public static void main(String[] args) {
        int a[] = { 10, 20, 30 };
        int b[];
        b = a;

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "]\t");
            System.out.println(b[i]);
        }
    }
}