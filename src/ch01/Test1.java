package ch01;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자3개를 입력하세요");

		int a0 = scan.nextInt();
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();

		// System.out.println("args[0]\t: " + args[0]);
		// System.out.println("args[1]\t: " + args[1]);
		// System.out.println("args[2]\t: " + args[2]);
		System.out.println("args[0]\t: " + a0);
		System.out.println("args[1]\t: " + a1);
		System.out.println("args[2]\t: " + a2);

		scan.close();

	} // main end
} // class end
