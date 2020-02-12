package ch01;

//"Test6.java"
public class Test6 {
  public static void main(String args[]) {
    int a = 10;

    System.out.println(a);// 10진수
    System.out.println(Integer.toBinaryString(a));// 2진수
    System.out.println(Integer.toOctalString(a));// 8진수
    System.out.println(Integer.toHexString(a) + "\n");// 16진수

    //
    System.out.println(Integer.MIN_VALUE);// -2147483648
    System.out.println(Integer.MAX_VALUE);// 2147483647

    System.out.println(Long.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
  }// main end
}// class end