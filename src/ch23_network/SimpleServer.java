package ch23_network;

import java.net.*;
import java.io.*;

public class SimpleServer {

    public static void main(String[] args) {
        // 변수

        ServerSocket ss = null;
        Socket s = null;
        DataOutputStream out = null;
        DataInputStream in = null;

        String msg = "서버구동중입니다. 192.168.137.24...";

        try {

            ss = new ServerSocket(7777);
            System.out.println("24 서버접속하셨습니다.");

        } catch (Exception ex) {

            System.out.println(ex);
        }

        while (true) {
            try {
                s = ss.accept();// 클라이언트 요청으로 소켓 연결
                out = new DataOutputStream(s.getOutputStream());
                out.writeUTF(msg);

                // 클라이언트 보내준 내용 받아서 출력
                in = new DataInputStream(s.getInputStream());
                System.out.println(in.readUTF());

                out.close();
                in.close();
                s.close();

            } catch (Exception ex2) {
                System.out.println(ex2);
            }
        }

    }
}
