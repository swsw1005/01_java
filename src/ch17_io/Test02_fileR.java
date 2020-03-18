package ch17_io;

import java.io.*;

public class Test02_fileR {

    public static void main(String[] args) {

        FileReader fr = null;

        try {

            fr = new FileReader("src //ch17_io //txt //a1.txt");

            int a;

            String b = "";
            while ((a = fr.read()) != -1) { // 배열 index에 음수 없으니까

                b = b + (char) a;
                // System.out.print((char) a);
            }

            System.out.println(b);

        } catch (IOException ex1) {
            System.out.println(ex1);

        } finally { // 무조건 실행

            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception ex2) {
            }

        } // try catch finally end

    } // main end
} // class end