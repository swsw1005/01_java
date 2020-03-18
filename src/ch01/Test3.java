package ch01;

class Test3 {
  public static void main(String args[]) {
    System.out.print("김씨");
    System.out.print("이씨");
    System.out.print("박씨");
    System.out.println(); // line skip

    System.out.print("김씨\n"); // \n은 line skip
    System.out.print("이씨\n");
    System.out.print("박씨\n\n");

    // \t 는 tab(탭) 기능, 8칸 정도 띄운다
    System.out.println("국어\t영어\t수학\t과학\n\n");

    // \r은 carrage return, 현재 줄의 첫번째로 커서가 이동
    System.out.print("자바\r");
    System.out.print("안녕\r");

  } // main end
} // class end