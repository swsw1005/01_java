package swsw.ch01;

import java.util.Scanner;
//계산기
//객체지향
//int 2개를 이용하는 공통점

class Calculator {
    int left, right;

    public void setleftright(int left, int right) {
        this.left = left;
        this.right = right;
    }// 인수 2개를 이용한다는 공통점

    public void sum() {
        System.out.print("sum\t=\t");
        System.out.println(this.left + this.right);
        System.out.println("-----------------------");
    }// 같은 클래스내의 변수 left right...
     // 그래도 이용했다.

    public void avg() {
        System.out.print("avg\t=\t");
        System.out.println((double) (this.left + this.right) / 2);
        System.out.println("-----------------------");
    } // 역시 같은 클래스의 변수 left right 똑같이 이용한다.

    public void avg(int left, int right) {
        System.out.print("avg\t=\t");
        System.out.println((double) (this.left + this.right) / 2);
        System.out.println("-----------------------");
    }

    public void je_gob() {

        long je = this.left;

        for (int i = 2; i <= this.right; i++) {
            je = je * this.left;
        }

        int je_length = (int) Math.log10(je) + 1;
        long je_length_10 = 1;

        for (int i = 2; i <= je_length; i++) {
            je_length_10 = je_length_10 * 10;
        }

        System.out.println(je);
        System.out.println(je_length);
        System.out.println(je_length_10);
        System.out.print("je_gob\t=\t");
        System.out.printf("%2.2d", je / je_length_10);
        System.out.println("-----------------------");
    }

    public void Calset(int left, int right) {
        setleftright(left, right);
        sum();
        avg();
        je_gob();
    }
}

public class sw9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // int x1 = scan.nextInt();
        // int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        int x4 = scan.nextInt();
        // int x3 = scan.nextInt();
        // int x4 = scan.nextInt();
        Calculator c1 = new Calculator();
        // c1.setleftright(x1, x2);
        // c1.sum();
        // c1.avg();
        // c1.je_gob();
        // c1.Calset(x1, x2);
        // Calculator c2 = new Calculator();
        // c2.setleftright(x3, x4);
        // c2.sum();
        // c2.avg();
        // c2.je_gob();
        System.out.println("--------------");

        c1.avg(x3, x4);
        System.out.println("--------------");

        scan.close();
    }

}