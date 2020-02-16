package swsw.ch01;

public class sw6 {

    public static void main(String[] args) {

        double x = 123.4564;
        System.out.println();
        System.out.println("x = " + x);
        System.out.println();

        System.out.println("---01-----------------");
        double x1 = Math.sin(x);
        System.out.println(x1);// -0.804175189839928
        System.out.println();

        System.out.println("---02-----------------");
        double x2 = Math.cos(x);
        System.out.println(x2);// -0.5943923485761873
        System.out.println();

        System.out.println("---03-----------------");
        double x3 = Math.toRadians(x);
        System.out.println(x3);// 2.1547206626591273
        System.out.println();

        System.out.println("---04-----------------");
        double x4 = Math.sqrt(x);
        System.out.println(x4);// 11.111093555541686
        System.out.println();

        System.out.println("---05-----------------");
        double x5 = Math.random();
        System.out.println(x5);// 0.19318159945966218
        System.out.println();

        System.out.println("---06-----------------");
        double x6 = Math.abs(x);
        int x6_1 = Math.abs((int) x);
        System.out.println(x6);// 123.4564
        System.out.println(x6_1);// 123
        System.out.println();

        System.out.println("---07-----------------");
        double x7 = Math.ceil(x);
        System.out.println(x7);// 124.0
        System.out.println();

        System.out.println("---08-----------------");
        double x8 = Math.floor(x);
        System.out.println(x8);// 123.0
        System.out.println();

        System.out.println("---09-----------------");
        double x9 = Math.pow(2, 12);
        System.out.println(x9);// 4096.0
        System.out.println();

        System.out.println("---10-----------------");
        double x10 = Math.max(1, 6);
        System.out.println(x10);// 6.0
        System.out.println();

        System.out.println("---11-----------------");
        double x11 = Math.min(1, 6);
        System.out.println(x11);// 1.0
        System.out.println();

    }// main end
}// class end