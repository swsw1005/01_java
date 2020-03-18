package chatting;

import java.net.*;

public class InetAddressDemo {
	public static void main(String args[]) {
		try {
			InetAddress addr[] = InetAddress.getAllByName(args[0]);

			for (int i = 0; i < addr.length; i++) {
				System.out.println(addr[i].getHostName()); // 주소
				System.out.println(addr[i].getHostAddress());
			} // for end
		} catch (Exception ex) {
			System.out.println(ex);
		} // try end
	} // main end
} // class end
