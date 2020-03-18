package ch07_array;

public class Test06_arr {

    public static void main(String[] args) {

        int b[] = { 1, 2, 3, 4 };

        int a[][] = { { 10, 20 }, { 30, 40, 50 } };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            } // inner for end
            System.out.println();
        } // out for end

        System.out.println(b[1]);
    } // main end
} // class end