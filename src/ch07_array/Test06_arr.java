package ch07_array;

public class Test06_arr {

    public static void main(String[] args) {

        int a[][] = { { 10, 20 }, { 30, 40, 50 } };

        System.out.println("행 갯수 : " + a.length);

        // System.out.println("열 갯수 : " + a[0].length);

        for (int i = 0; i < a.length; i++) {
            System.out.println("열 갯수 a[" + i + "] : " + a[i].length);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            } // inner for end
            System.out.println();
        } // out for end
    }// main end
}// class end