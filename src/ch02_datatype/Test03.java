package ch02_datatype;

public class Test03 {
	public static void main(String args[]) {

		final int MAX = 100;

		System.out.println("MAX \t=\t" + MAX);

		char ch = 65400;
		char ch2 = 555;
		int i = 'a';
		double d = 100;
		int aa = (int) 12.7;
		// int�� �ڵ� ����ȯ

		System.out.println("ch \t=\t" + ch);
		System.out.println("i \t=\t" + i);
		System.out.println("d \t=\t" + d);
		System.out.println("aa\t=\t" + aa);

		System.out.println("10 +12.7\t=" + (10 + 12.7));
		// 22.7
		System.out.println("'a'+2 \t=\t" + ('a' + 2));
		System.out.println("'b'+2 \t=\t" + ('b' + 2));
		System.out.println("'c'+2 \t=\t" + ('c' + 2));
		// 99 100 101
		System.out.println("\n\n");

		i = (int) 12.7;
		// 자동형변환 int 정수
		ch = (char) 65;
		// 자동형변환 char 문자열
		ch2 = (char) 65.7;

		System.out.println("i \t=\t" + i);
		// A
		System.out.println("ch \t=\t" + ch);
		// A
		System.out.println("ch2 \t=\t" + ch2);
		// A

		ch = (char) 107; // K
		ch2 = (char) 107.715511414;
		System.out.println("ch \t=\t" + ch);
		System.out.println("ch2 \t=\t" + ch2);

		System.out.println((int) 66.7);

	} // main end

} // class end
