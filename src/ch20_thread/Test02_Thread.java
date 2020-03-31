package ch20_thread;

public class Test02_Thread {

    public static void main(String[] args) {

        MyThread01 mt = new MyThread01();
        YourThread01 yt = new YourThread01();

        mt.setPriority(1);
        yt.setPriority(9);

        mt.start();
        yt.start();

    }
}

class MyThread01 extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
        System.out.println("---m end---");
    }
}

class YourThread01 extends Thread {
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
        System.out.println("---y end---");
    }
}