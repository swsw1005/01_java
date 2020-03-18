package ch07_array;

public class Test01_arr {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a+ " + a);
        System.out.println("b+ " + b);
        System.out.println("c+ " + c);
        System.out.println();

        int arr[] = { a, b, c };
        int arr2[] = { 40, 50, 60 };

        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("arr[" + i + "] = " + arr[i]);

            } catch (Exception e) {
                System.out.println("\t--------------------");
                break;
            }

        } // for end
        System.out.println();

        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("arr2[" + i + "] = " + arr2[i]);

            } catch (Exception e) {
                System.out.println("\t--------------------");
                break;
            }

        } // for end

    } // main end
} // class end