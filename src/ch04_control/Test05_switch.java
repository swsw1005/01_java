package ch04_control;

public class Test05_switch {

    public static void main(String[] args) throws Exception {

        System.out.print("+ - * / % 중 하나의 연산자를 입력하세요>>");
        char oper = (char) System.in.read();

        int a = 20;
        int b = 7;

        switch (oper) {

        case '+':
            System.out.println("a" + oper + "b =" + (a + b));
            break;
        case '-':
            System.out.println("a" + oper + "b =" + (a - b));
            break;
        case '*':
            System.out.println("a" + oper + "b =" + (a * b));
            break;
        case '/':
            System.out.println("a" + oper + "b =" + (a / b));
            break;
        case '%':
            System.out.println("a" + oper + "b =" + (a % b));
            break;
        default:
            System.out.println("입력오류 : + - * / % 중 하나를 입력하세요");
        } // switch end

    }
}