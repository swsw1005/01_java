package ch17_io;

import java.io.*;

// PrintWriter(OutputStream os)
// PrintWriter(OutputStream os.boolean flushOnNewLine);
//  flushOnNewLine ??  >>> 줄바꿈 true , 안바꿈 false

//  PrintWriter(Writer w)
//  PrintWriter(Writer w, boolean flushOnNewLine)

// PrintWriter 객체는, Object 비롯한 모든 형식에 대해서
// print() println()메서드를 지원한다.

public class Test06_printM {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        Object ob = new String("hello");
        pw.println(ob);
        pw.println(12);
        pw.println("34");
        pw.println('5');
        pw.println(true);
        pw.println(new java.util.Date());

        pw.flush();

    }
}