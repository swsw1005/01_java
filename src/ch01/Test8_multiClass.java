package ch01;

class Test8_multiClass {
  public static void main(String args[]) {

    Demo1 demo1 = new Demo1(); // ��ü ����
    Demo2 demo2 = new Demo2();

    demo1.aa(); // aa() 출력
    demo2.bb(); // bb() �޼��� ȣ��
    demo1.aa1(); // aa1() �޼��� ȣ��
    demo2.bb1(); // bb1 () �޼��� ȣ��

  } // main end
} // class end

class Demo1 {
  public void aa() {
    System.out.println("Demo\tclass\n\t\t aa\tmethod\r");
  } // aa end

  public void aa1() {
    System.out.println("Demo\tclass\n\t\t aa1\tmethod\r");
  } // aa1 end
} // class end

class Demo2 {
  public void bb() {
    System.out.println("Demo2\tclass\n\t\t bb\tmethod\r");
  } // bb end

  public void bb1() {
    System.out.println("Demo2\tclass\n\t\t bb1\tmethod\r");
  } // bb1 end
} // class end
