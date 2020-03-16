package ch16_exception;

import java.util.Scanner;

//직접처리
public class Test01_try_catch {

    public static void main(String[] args) {

        // try_catch
        try {

            Scanner sc = new Scanner(System.in);
            System.err.print("입력하세요");

            String arr[] = new String[2];

            arr[0] = sc.nextLine();

            int n = Integer.parseInt(arr[0]);

            if (n % 2 == 0) {
                System.out.println(n + " is 짝수");
            } else {
                System.out.println(n + " is 홀수");
            }

            sc.close();

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("배열 예외 : " + e1);
        } catch (NumberFormatException e2) {
            System.out.println("int값이 아니네요 : " + e2);
        } catch (ArithmeticException e3) {
            System.out.println("0으로 나눌수 없음 : " + e3);
        } finally {
            System.out.println("안녕 나는 finally야");
            System.out.println("오류와 관계없이 나타날꺼야");
        }
    }
}