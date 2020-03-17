package ch17_io;

import java.io.*;

//FileInputStream
//BufferedInputStream
public class Test10_bufferbyteR {
    public static void main(String[] args) throws Exception {
        // FileInputStream fis = new FileInputStream("a4.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis);

        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("src//ch17_io//txt//a4.txt"));
        int a;
        while ((a = bis.read()) != -1) {// 파일 끝이 아닌동안 반복
            System.out.print(a + " ");
        } // while end

        bis.close();
    }// main end
}// class end