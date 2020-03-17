import java.util.Scanner;

/**
 * Test
 */

public class Test {

    public static void main(String[] args) {

        String a = "java";
        String b = "java";

        /////////////////////////////////////////////
        if (!(a.equals(b)))
            return;
        ////////////////////////////////////////////
        System.out.println("답이 같습니다.");

        Scanner sc = new Scanner(System.in);
        System.out.println("최소값, 최대값을 입력하여 랜덤출력");
        System.out.print("최소값 입력 : ");
        int rand_min = sc.nextInt();
        System.out.print("최대값 입력 : ");
        int rand_max = sc.nextInt();

        for (int i = 0; i < 100; i++) {
            int temp = (int) (Math.random() * rand_max + rand_min);

            if (temp > rand_max) {
                for (int j = 0; j < 500; j++) {
                    temp = (int) (Math.random() * rand_max + rand_min);

                    if (temp < rand_max)
                        break;
                }
            }

            if ((i + 1) % 15 == 0) {
                System.out.print(temp + "\n");
            } else {
                System.out.print(temp + "\t");
            }

        }

        sc.close();

    }// main end
}// class end
