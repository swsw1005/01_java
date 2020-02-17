package ch07_array;

public class Test03_arr {

    public static void main(String[] args) {
        int[] age = { 10, 20, 30 };
        double[] height = { 130.5, 177.7, 185.9 };
        String name[] = { "손여은", "전소미", "이유비" };

        for (int i = 0; i <= age.length; i++) {

            System.out.printf("이름:%12s\t나이:%7d\t키:%7.1f\n", name[i], age[i], height[i]);

        }

    }// main end
}// class end