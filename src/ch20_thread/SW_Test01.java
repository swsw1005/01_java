package ch20_thread;

class Go1 extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(1);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !1! ");
    }
}

class Go2 extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(2);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !2! ");
    }
}

class Go3 extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(3);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !3! ");
    }
}

class Go4 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(4);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !4! ");
    }
}

class Go5 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(5);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !5! ");
    }
}

class Go6 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(6);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !6! ");
    }
}

class Go7 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(7);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !7! ");
    }
}

class Go8 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(8);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !8! ");
    }
}

class Go9 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(9);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !9! ");
    }
}

class Go10 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 20) {
            try {
                System.out.print(0);
                i++;
                int j = (int) (Math.random() * 2000 + 1000);
                sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" !0! ");
    }
}

public class SW_Test01 {

    public static void main(String[] args) {

        Go1 g1 = new Go1();
        Go2 g2 = new Go2();
        Go3 g3 = new Go3();
        Go4 g4 = new Go4();
        Go5 g5 = new Go5();
        Go6 g6 = new Go6();
        Go7 g7 = new Go7();
        Go8 g8 = new Go8();
        Go9 g9 = new Go9();
        Go10 g10 = new Go10();

        g1.start();
        g2.start();
        g3.start();
        g4.start();
        g5.start();
        g6.start();
        g7.start();
        g8.start();
        g9.start();
        g10.start();

    }
}