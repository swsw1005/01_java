package ch17_io;

import java.io.*;

public class Test11_dataByteWR {

    public static void main(String[] args) throws IOException {

        // FileOutputStream fos = new FileOutputStream("a5.txt");
        // DataOutputStream dos = new DataOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("src//ch17_io//txt//a5.txt"));

        dos.writeByte(Integer.MAX_VALUE);
        dos.writeChar('a');
        dos.writeShort(Short.MAX_VALUE);
        dos.writeLong(Long.MAX_VALUE);
        dos.writeBoolean(true);
        // dos.writeChars("kim");
        dos.writeUTF("이 글자는 UTF-8인코딩입니다.");
        // 유일하게 정상적인 글자로 보인다.

        dos.close();

        // 파일 읽어오기
        // FileInputStream fis = new
        // FileInputStream("src//ch17_io//txt//a5.txt")
        // DataInputStream dis = new DataInputStream(fis);
        DataInputStream dis = new DataInputStream(
                new FileInputStream("src//ch17_io//txt//a5.txt"));

        System.out.println(dis.readByte());
        System.out.println(dis.readChar());
        System.out.println(dis.readShort());
        System.out.println(dis.readLong());
        System.out.println(dis.readBoolean());
        // System.out.println(dis.readLine());
        System.out.println(dis.readUTF());

        dis.close();

    }
}