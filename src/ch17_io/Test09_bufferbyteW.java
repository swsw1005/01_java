package ch17_io;

import java.io.*;

public class Test09_bufferbyteW {

    public static void main(String[] args) throws IOException {
        // FileOutputStream fos = new FileOutputStream("a4.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("src //ch17_io //txt //a4.txt"));

        for (int i = 1; i <= 10; i++) {
            bos.write(i);
        } // for end

        bos.close();
    }
}