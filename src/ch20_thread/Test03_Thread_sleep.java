package ch20_thread;

public class Test03_Thread_sleep {

    public static void main(String[] args) {

        MyThread2 mt2 = new MyThread2();
        mt2.run();

    }
}

class MyThread2 {
    int i = 0;

    public void run() {
        try {

            while (i < 5) {
                i++;
                Thread.sleep(2000);
                System.out.println("안녕");
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

    }
}