package ch17_io;

import java.io.*;

public class Test01_io {

    public static void main(String[] args) {
        FileWriter fw = null;

        try {

            fw = new FileWriter("src//ch17_io//txt//a1.txt");
            for (int i = 0; i < 5; i++) {
                fw.write("줄번호 : " + i + "\n");

            }

        } catch (IOException ex1) {
            System.out.println(ex1);

        } finally {

            try {

                if (fw != null) {// fw가 아직 살아있으면
                    fw.close();// 종료한다.
                } // 되든 안되는 종료는 해야하니까 finally 내부에서 닫는다

            } catch (IOException ex2) {

            } // inner try

        } // finally end
    } // main end
} // class end