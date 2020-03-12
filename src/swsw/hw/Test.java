package swsw.hw;

import java.util.Scanner;

/**
 * Test
 */

public class Test {

    public static void main(String[] args) {

        double coordinates[][] = { { 9.15, 1.28 }, { 5.97, 4.91 },
                { 2.7, 7.13 }, { 1.97, 2.19 }, { 5.62, 1.64 }, { 4.75, 9.84 },
                { 8.04, 2.41 }, { 0.68, 6.93 }, { 2.33, 3.55 }, { 5.66, 4.48 },
                { 7.1, 8.81 }, { 0.65, 2.73 }, { 8.54, 0.15 }, { 7.77, 3.28 },
                { 2.82, 7.98 }, { 7.93, 3.09 }, { 4.3, 6.55 }, { 1.61, 9.37 },
                { 1.3, 8.91 }, { 0.84, 1.78 } };

        // Math.sqrt((Math.pow(1 - 4, 2) + Math.pow(5 - 7, 2)));

        for (int i = 0; i < coordinates.length - 1; i++) {
            double x1 = coordinates[i][0];
            double y1 = coordinates[i][1];

            double x2 = coordinates[i + 1][0];
            double y2 = coordinates[i + 1][1];

            double distance = Math
                    .sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

            System.out.println(distance);
        }

    }// main end

}// class end