package ch05_for;

import java.util.Scanner;

public class Test07_2for {
	public static void main(String args[]) {

		// 다음과 같이 출력하시오
		// *
		// **
		// ***
		// ****

		Scanner scan = new Scanner(System.in);
		System.out.print("몇층 피라미드? >>>");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			} // inner for end
			System.out.println();

		} // outer for end

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 1; i <= n; i++) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			} // inner for end

			for (int j = 1; j <= (n - i); j++) {
				System.out.print("-");
			}
			System.out.println();

		} // outer for end

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i + 1; j++) {
				System.out.println(" ");
			}

			for (int j = 1; j <= n; j++) {

			}
			System.out.print("-");

		}

		scan.close();

	} // main end

} // class end