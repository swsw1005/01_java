package ch02_datatype;

public class Test02 {
	public static void main(String args[]) {
		byte b = 127;
		char ch = 'a';
		char ch2 = 65;

		short s = 32767;
		int i = 2147483647;

		long l = 922301374813809L;
		float f = 12.7f;
		double d = 12.7d;

		boolean bb = true;

		System.out.println("b=\t" + b);
		System.out.println("ch=\t" + ch);
		System.out.println("ch2=\t" + ch2);
		System.out.println("s=\t" + s);
		System.out.println("i=\t" + i);
		System.out.println("l=\t" + l);
		System.out.println("f=\t" + f);
		System.out.println("d=\t" + d);
		System.out.println("bb=\t" + bb);

		String name = "홍길동";
		String name2 = new String("홍길동");

		System.out.println("name\t" + name);
		System.out.println("name2\t" + name2);

		System.out.println("안녕하세요 ㅎㅎ");

	}
}
