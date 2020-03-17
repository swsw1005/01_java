package ch17_io;

import java.io.*;

public class Test05_readConsole {

    // System.in은 InputStream 객체이기 때문에
    // InputStreamReader
    // ex) InputStreamReader(InputStream is)
    //
    // InputStreamReader 객체가 BufferedReader 생성자 인수로 전달한다
    // ex) BufferedReader(InputStreamReader isr)

    // 키보드로 부터 입력받는다.

    public static void main(String[] args) throws IOException {

        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String sKor, sEng;
        int kor, eng;

        System.out.print("국어점수입력 : ");
        sKor = br.readLine();
        System.out.print("영어점수입력 : ");
        sEng = br.readLine();

        kor = Integer.parseInt(sKor);
        eng = Integer.parseInt(sEng);

        int jumsu_sum = kor + eng;
        int jumsu_avg = (kor + eng) / 2;

        System.out.println("합계 " + jumsu_sum);
        System.out.println("평균 " + jumsu_avg);
        System.out.println("편차");

    } // main
} // class