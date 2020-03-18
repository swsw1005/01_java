package ch02_datatype;

public class Test01 {
    public static void main(String args[]) {
        int a1 = 10;
        int _a = 10;
        int $a = 10;

        System.out.println("a1\t=\t" + a1);
        System.out.println("_a\t=\t" + _a);
        System.out.println("$a\t=\t" + $a);

    } // main end
} // class end
/*
 * 
 * Java Data Type �� Primitive Type �� Boolean Type(boolean) �� Numeric Type ��
 * Integral Type �� Integer Type(short, int, long) �� Floating Point Type(float,
 * double) �� Character Type(char) �� Reference Type �� Class Type �� Interface
 * Type �� Array Type �� Enum Type �� etc.
 * 
 * �ڷ��� byte 1byte -128 ~ 127 char 2byte unicode short 2byte -32768 ~ 32767 int
 * 4byte -2,147,483,648 ~ 2,147,483,647
 * 
 * 
 * int a a1 _a $a ����
 * 
 * int kim 1 = 1000 ���� �Ұ��� int 2kim = 2000 ù���� ���ںҰ���
 * 
 * ���(constant) = data = ��
 * 
 * 1. ���� 10(int) 10L(long) 0xa(16��) 2. �Ǽ� 12.7(double) 12.7f(float) 3. ����
 * ��� 'a' 'A' 'f' 4. ���ڿ���� "A" "mbc" "ȫ�浿"
 * 
 * ����+"" ���ڿ� ����+'' ���� �ڷ��� ū������ ����+�Ǽ� �Ǽ��� �ڷ��� ū������
 * 
 */