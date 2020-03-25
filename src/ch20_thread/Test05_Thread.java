package ch20_thread;

import java.util.*;

public class Test05_Thread {

    public static void main(String[] args) {
        House h = new House();

        Product p = new Product(h);
        Consumer c = new Consumer(h);

        p.start();
        c.start();

    }
}

class House {
    Vector<Character> vec;

    public House() {
        vec = new Vector<Character>();
    }

    synchronized void put(char c) {
        while (vec.size() == 10) {
            try {
                wait(); // 기다린다(notify 받으면 작동한다.)
            } catch (InterruptedException ex) {
            }
        } // while end

        // 랜덤 대기
        int msec = (int) (Math.random() * 500 + 500);
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // 대기 종료

        vec.add(new Character(c));
        System.out.println("입고 : " + c + "  재고(개) : " + vec.size());
        notifyAll();
    } // put() end

    synchronized char get() {
        while (vec.size() == 0) {
            try {
                wait(); // 기다린다(notify 받으면 작동한다.)
            } catch (InterruptedException ex) {
            }

        } // while end

        // 랜덤 대기
        int msec = (int) (Math.random() * 1000 + 1500);
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // 대기 종료

        // 정상처리
        Character ch = (Character) vec.remove(0);

        System.out.println("출고 : " + ch + "  재고(개) : " + vec.size());
        notifyAll();

        return ch;
    } // get() end
}// class House end

class Product extends Thread {

    // 변수
    private House house;

    // 생성자
    public Product(House house) {
        this.house = house;
    } // cons end

    public void run() {
        for (char ch = 'A'; ch <= 'J'; ch++) {
            // 랜덤 대기
            int msec = (int) (Math.random() * 500 + 500);
            try {
                Thread.sleep(msec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // 대기 종료

            System.out.println("제품 생산 : " + ch);
            house.put(ch);
        } // for end
    }// run end

} // class Product end

class Consumer extends Thread {

    // 변수
    private House house;

    // 생성자
    public Consumer(House house) {
        this.house = house;
    } // cons end

    public void run() {

        char ch;
        for (int i = 0; i < 10; i++) {

            // 랜덤 대기
            int msec = (int) (Math.random() * 1000 + 1500);
            try {
                Thread.sleep(msec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // 대기 종료

            ch = house.get();
            System.out.println("제품 판매 : " + ch);
        } // for end
    } // run() end

} // class Consumer end
