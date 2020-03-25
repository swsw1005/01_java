package ch20_thread;

class Go extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 30) {
            System.out.print("go  ");
            i++;
        }
    }
}

class Come extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 30) {
            System.out.print("come  ");
            i++;
        }
    }
}

public class Test01_Thread {

    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();
        g.start();// run() 메소드 호출
        c.start();// run() 메소드 호출
    }
}