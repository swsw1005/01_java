package ch01;

import java.util.InputMismatchException;
import java.util.Scanner;

//"Test6.java"
public class Test6 {
  public static void main(String args[]) {

    try {

      Scanner scan = new Scanner(System.in);
      System.out.println("숫자 입력해라");
      int a = scan.nextInt();

      System.out.println();
      System.out.println("10진수\t" + a);// 10진수
      System.out.println("2진수\t" + Integer.toBinaryString(a));// 2진수
      System.out.println("8진수\t" + Integer.toOctalString(a));// 8진수
      System.out.println("16진수\t" + Integer.toHexString(a) + "\n");// 16진수
      System.out.println();
      //
      System.out.println(Integer.MIN_VALUE);// -2147483648
      System.out.println(Integer.MAX_VALUE);// 2147483647
      System.out.println();
      System.out.println(Long.MIN_VALUE);
      System.out.println(Long.MAX_VALUE);

      scan.close();

    } catch (InputMismatchException exception) {

      System.out.println("숫자입력하라니까 임마");

    }

  }// main end
}// class end