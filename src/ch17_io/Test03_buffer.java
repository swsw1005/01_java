package ch17_io;

import java.io.*;

public class Test03_buffer {

    public static void main(String[] args) throws IOException {

        // FileWriter fw = new FileWriter("a2.txt");
        // BufferedWriter bw = new BufferedWriter(fw);
        // 2줄로 나눌수 있지만
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src//ch17_io//txt//a2.txt"));
        // 한번에 쓴다.

        for (int i = 1; i <= 5; i++) {
            bw.write("줄번호 : " + i + "\n");
        }

        bw.close();

    }// main end
}// class end