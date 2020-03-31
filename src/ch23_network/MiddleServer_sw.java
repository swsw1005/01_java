package ch23_network;

import java.io.*;
import java.awt.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleServer_sw extends Frame {
	/**
	 *
	 */
	private static final long serialVersionUID = -6209529656599579771L;

	// 변수
	public TextArea ta1;
	public TextArea ta2;

	// 생성자
	public MiddleServer_sw() {
		setTitle("채팅방 관리자_sw ver");// 창제목

		ta1 = new TextArea();
		ta2 = new TextArea();

		setLayout(new GridLayout(1, 2));
		this.add(ta1);
		this.add(ta2);

		ta1.setEditable(false);// 편집못하게
		ta2.setEditable(false);// 편집못하게
	}// cons end

	// 메서드

	// main
	public static void main(String[] args) {

		MiddleServer_sw f = new MiddleServer_sw();
		f.setSize(900, 800);
		f.setVisible(true);

		int i = 1;// 접속한 인원 넣을 변수
		try {
			// ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 구동중 (^.^)");

			while (true) {
				Socket sock = ss.accept();// 클라이언트 접속을 받아서, 소켓연결 시킨다
				f.ta1.append(i + "번째 손님이 방문 했음\t" + sock + "\n");
				new Handler1(sock, i, f.ta1, f.ta2).start();
				i++;// 인원 증가
			} // while
		} catch (Exception ex) {
		}

	}// main
}// class
	// ------------------------------------------

class Handler1 extends Thread {
	// 변수
	private int number;// 인원수 넣으려고
	static private Vector vec = new Vector();
	private TextArea ta1;
	private TextArea ta2;

	private Socket sock;
	private DataInputStream in;
	private DataOutputStream out;

	// 생성자
	public Handler1(Socket s, int num, TextArea ta11, TextArea ta22)
			throws Exception {
		number = num;
		sock = s;
		ta1 = ta11;
		ta2 = ta22;
		in = new DataInputStream(sock.getInputStream());
		out = new DataOutputStream(sock.getOutputStream());
	}// cons end

	// run() 오버라이딩
	public void run() {
		try {
			vec.add(this);// 현재(this) 접속자를 vec에 넣는다

			while (true) {
				String msg = in.readUTF();// 클라이이언트가 보내준 내용을 받는다
				String dt = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss")
						.format(new Date().getTime());
				msg = msg + "\n\t" + dt + "\n";
				toMsg(msg);// 메서드 호출 , 이 메소드에서 모든 클라이언트에게 msg를 뿌려준다
				ta2.append(msg);
			} // while
		} catch (Exception ex2) {
			ta1.append(number + "번째 손님이 퇴실 하였습니다\n");
			toMsg(number + " 번손님이 퇴장 하였습니다\n");// 모든 클라이언트 에게 보낸다
			vec.remove(this);// 퇴실한 사람을 vec에서 제거

			try {
				sock.close();// 지금 퇴실한 클라이언트 소켓을 끊는다
			} catch (IOException ie) {
				System.out.println("소켓 닫는중 예외 발생 :" + ie);
			}
		} // catch
	}// run

	// 사용자 정의 메서드
	// 메서드: 클라이언트로 대화 내용 보내는 메서드
	private void toMsg(String msg) {
		synchronized (vec) {
			Enumeration en = vec.elements();// 클라이언트들 꺼내기
			while (en.hasMoreElements()) {

				Handler1 temp = (Handler1) en.nextElement();
				try {
					temp.out.writeUTF(msg);// 클라이언트로 보낸다
				} catch (IOException ie) {

					try {
						sock.close();
					} catch (IOException ie2) {
					}

					System.out.println("클라이언트로 메시지를 출력하던중 예외 발생 :" + ie);
				} // catch
			} // while end
		} // synchronized
	}// toMsg()

}// class