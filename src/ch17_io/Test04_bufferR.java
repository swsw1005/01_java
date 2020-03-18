package ch17_io;

import java.io.*;

public class Test04_bufferR {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("src //ch17_io //txt //a2.txt"));

        String a2 = "";
        String str = "";

        while ((str = br.readLine()) != null) {

            a2 = a2 + str + "\n";
            // a2.txt를 한줄씩 읽어서(str)
            // String a2 에 저장(줄바꿈추가해서)

        }

        System.out.println(a2);

        br.close();
    }
}