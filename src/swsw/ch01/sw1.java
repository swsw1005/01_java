package swsw.ch01;

public class sw1 {

    public static void main(String[] args) {
        // 006 문자열과 배열
        String city1 = "Seoul";
        String city2 = "busan";
        System.out.println(city1 + " " + city2);
        System.out.println();

        city2 = city1;
        System.out.println(city1 + " " + city2);

        System.out.println(city1.length());

        String city4 = String.format("%s-%s", city1, city2);

        System.out.println(city4);

        int[] nums2 = { 1, 2, 3 };
        // new없이 생성된 배열...절대 변경불가

        System.out.println(nums2[1]);
        System.out.println();

        int[] lotto = new int[6]; // {0,0,0,0,0,0}

        System.out.println(lotto[0]);
        System.out.println(lotto[1]);
        System.out.println(lotto[2]);
        System.out.println(lotto[3]);
        System.out.println(lotto[4]);
        System.out.println(lotto[5]);
        // lotto[0] = -1; // -1 넣기,{-1,0,0,0,0,0}
        lotto = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35 };
        System.out.println();

        for (int i = 0; i < 1000000; i++) {

            System.out.print("lotto[" + i + "]\t");

            try {
                System.out.println(lotto[i]);
            } catch (Exception e) {
                System.out.println("no int bye bye");
                break;
            } // try catch end
        } // for end
    } // main end
} // class end
