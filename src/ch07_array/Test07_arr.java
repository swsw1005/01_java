package ch07_array;

public class Test07_arr {

    public static void main(String[] args) {
        double ki[][] = { { 1.1, 2.2, 3.3 }, { 4.4, 5.5, 6.6, 7.7 } };
        double sum = 0.0;

        for (int i = 0; i < ki.length; i++) {
            for (int j = 0; j < 7; j++) {

                try {

                    sum += ki[i][j];
                    System.out.print(ki[i][j] + "\t");

                } catch (Exception e) {
                    System.out.print("   \t");
                }

            } // inner for end
            System.out.printf("\tavg:%6.2f\n", (sum / ki[i].length));
            sum = 0.0;
        } // out for end

        System.out.println();
        System.out.println(ki.length);
        System.out.println(ki[0].length);
        System.out.println(ki[1].length);
    }// main end
}// class end