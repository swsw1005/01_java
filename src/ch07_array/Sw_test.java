package ch07_array;

public class Sw_test {

    public static void main(String[] args) {
        int a[] = { 0, 1, 2 };

        for (int i = 0; i < a.length; i++) {

            try {
                System.out.println("a[" + i + "]\t" + i);
            } catch (Exception e) {
            }
        } // for end

        // a={Integer.valueOf(a[0]),Integer.valueOf(a[1]),Integer.valueOf(a[2]),3};

        System.out.println("------------------------");

        for (int i = 0; i < a.length; i++) {

            try {
                System.out.println("a[" + i + "]\t" + i);
            } catch (Exception e) {
            }

        } // for end

    }
}