package chatting;

import java.net.*;
import java.io.*; //�씤�뭼 �븘�썐�뭼

public class simpleserver {
	public static void main(String args[]) throws Exception {
		// 蹂��닔
		ServerSocket ss = null;
		Socket sock = null;

		String msg = "Welcome to 192.168.137.24 !!";
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			ss = new ServerSocket(5555);
			System.out.println("***Running Server****");
		} catch (Exception ex) {
			System.out.println("�삁�쇅server1 : " + ex);
		} // catch end

		while (true) {
			try {
				sock = ss.accept();
				dos = new DataOutputStream(sock.getOutputStream()); // �뜲�씠�꽣蹂대궪媛앹껜
				dos.writeUTF(msg); // �겢�씪�씠�뼵�듃濡� 蹂대궦�떎.

				// �겢�씪�씠�뼵�듃 蹂대궦 �궡�슜 異쒕젰
				dis = new DataInputStream(sock.getInputStream());
				System.out.println(dis.readUTF());

				dos.close();
				dis.close();
				sock.close();
				// ���옣 而댄뙆�씪

			} catch (Exception ex2) {
				System.out.println("�삁�쇅server2 : " + ex2);
			} // catch end

		} // while end

	} // main end
} // class end
