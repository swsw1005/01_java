package ch17_io;

import java.io.*;

public class Test08_byteR {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;

        try {

            fis = new FileInputStream("src//ch17_io//txt//a3.txt");
            int a;

            while ((a = fis.read()) != -1) {
                System.out.println(a);
            }

        } catch (IOException ex1) {
            System.out.print(ex1);
        } finally {
            try {
                fis.close();
            } catch (IOException ex2) {
            }
        }

    }
}