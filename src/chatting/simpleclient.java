package chatting;

import java.net.*;
import java.io.*;

public class simpleclient {
	public static void main(String args[]) {

		Socket sock = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		String msg = "�븞�뀞�븯�꽭�슂";
		// String msg="援щ줈�뿭�떇�떦 �씠踰덉＜ �떇�떒�몴 援ы븿"+args[1];

		try {
			sock = new Socket(args[0], 5555);
			// �꽌踰� sip �꽌踰꾪룷�듃
			dis = new DataInputStream(sock.getInputStream());
			System.out.println(dis.readUTF()); // �꽌踰꾧�蹂대궡以��궡�슜異쒕젰

			dos = new DataOutputStream(sock.getOutputStream());
			dos.writeUTF(msg);

			dis.close();
			dos.close();
			sock.close();

		} catch (Exception ex) {
			System.out.println("�삁�쇅 client ex : " + ex);

		} // catch end
	} // main end
} // class SC end