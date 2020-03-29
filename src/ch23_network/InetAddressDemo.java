package ch23_network;

import java.net.*;

public class InetAddressDemo {

    public static void main(String[] args) {

        String str = "www.google.com";

        try {
            InetAddress iaddr[] = InetAddress.getAllByName(str);

            for (int i = 0; i < iaddr.length; i++) {
                System.out.println(iaddr[i].getHostName());// 도메인
                System.out.println(iaddr[i].getHostAddress()); // 주소
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}