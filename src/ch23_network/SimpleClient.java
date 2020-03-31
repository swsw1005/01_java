package ch23_network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleClient {

    public static void main(String[] args) {

        // 변수
        Socket s = null;
        DataInputStream in = null;
        DataOutputStream out = null;
        String msg = "클라이언트 192.168.137.24 접속";
        String ipAddr = "192.168.137.";

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();

        ipAddr = ipAddr + j + "";
        System.out.println();
        System.out.println(ipAddr);

        try {
            s = new Socket(ipAddr, 7777);// 서버 접속
            in = new DataInputStream(s.getInputStream());
            String str = in.readUTF();
            System.out.println(str);

            out = new DataOutputStream(s.getOutputStream());
            out.writeUTF(msg); // 서버로 보낸다.

            out.close();
            in.close();
            s.close();

        } catch (Exception e) {
            System.out.println("서버 접속 불가");
        }

        sc.close();

    } // main end
} // class end