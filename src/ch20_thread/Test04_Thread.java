package ch20_thread;

import java.util.Date;
import java.util.Scanner;

public class Test04_Thread {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();

        MyThread3 mt1 = new MyThread3("A", l + 500);
        MyThread3 mt2 = new MyThread3("B", l);
        MyThread3 mt3 = new MyThread3("C", l + 200);

        mt1.start();
        mt2.start();
        mt3.start();

    }
}

class MyThread3 extends Thread {
    String msg;
    long msec;

    public MyThread3(String msg, long msec) {
        this.msg = msg;
        this.msec = msec;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(msec);
                System.out.print(msg + "\t");
                System.out.println(new Date());
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}