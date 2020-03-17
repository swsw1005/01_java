package ch17_io;

import java.io.*;

public class Test07_byteM {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream("src//ch17_io//txt//a3.txt");

            for (int i = 1; i < 10; i++) {
                fos.write(i);
            }

        } catch (IOException ex1) {
            System.out.println(ex1);

        } finally {

            try {
                fos.close();
            } catch (IOException ex2) {
                System.out.println(ex2);
            }

        }

    } // main end
} // class end