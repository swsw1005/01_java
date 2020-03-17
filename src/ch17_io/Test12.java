package ch17_io;

import java.io.*;

public class Test12 {

    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException {

        String filename = "src//ch17_io//txt//obj.txt";

        Test12_Handphone hp = new Test12_Handphone("갤럭시 Z Flip", 2958000);

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename));

        oos.writeObject(hp);
        oos.close();

        // 파일 읽어오기
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename));

        Test12_Handphone ph2 = (Test12_Handphone) ois.readObject();

        System.out.println("핸드폰 이름\t" + ph2.phName);
        System.out.println("핸드폰 가격\t" + ph2.price);

        ois.close();

    } // main end
} // class end