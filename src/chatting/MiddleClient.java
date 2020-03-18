package chatting;

//package ch20_network;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

//Ŭ���̾�Ʈ
public class MiddleClient extends JFrame implements ActionListener, Runnable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// ����
	JButton b1, b2, b3;
	JTextField tf; // ��ȭ ���� �Է¶�
	JTextArea ta; // ��ȭ ���� ��� �뵵
	String name; // ��ȭ�� ���� ����

	private DataInputStream in;
	private DataOutputStream out;
	private Thread thread;
	JScrollPane scrollPane;
	JScrollBar scrollBar;

	// ������
	public MiddleClient(String ip, int port) {
		try {
			Socket sock = new Socket(ip, port); // ���� ����
			in = new DataInputStream(sock.getInputStream());
			out = new DataOutputStream(sock.getOutputStream());

		} catch (Exception ex) {
			System.out.println("���� ���� ���� :" + ex);
			System.exit(0);
		} // catch

		ImageIcon i1 = new ImageIcon("c:\\_java\\imgs\\a1.gif");
		b1 = new JButton("����", i1);
		b1.addActionListener(this); // �̺�Ʈ ���

		ImageIcon i2 = new ImageIcon("c:\\_java\\imgs\\a2.gif");
		b2 = new JButton("����Ʈ", i2);
		b2.addActionListener(this); // �̺�Ʈ ���

		ImageIcon i3 = new ImageIcon("c:\\_java\\imgs\\a3.gif");
		b3 = new JButton("��������", i3);
		b3.addActionListener(this); // �̺�Ʈ ���

		tf = new JTextField();
		tf.addActionListener(this); // �̺�Ʈ ���

		ta = new JTextArea();
		ta.setLineWrap(true); // ������ ������ �ڵ����� ���� �Ϸ���

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 1));
		p.add(b1);
		p.add(b2);
		p.add(b3);

		scrollPane = new JScrollPane(ta);
		scrollBar = scrollPane.getVerticalScrollBar();
		scrollBar.setValue(scrollBar.getMaximum());

		getContentPane().add(p, "East");
		getContentPane().add(scrollPane, "Center");
		getContentPane().add(tf, "South");

		setSize(400, 300); // âũ��
		setVisible(true); // âǥ��
		tf.requestFocus(); // ��Ŀ�� ����

		// ��ȭ�� �ޱ�
		name = JOptionPane.showInputDialog(this, "��ȭ���� �Է� �Ͻÿ�");

		thread = new Thread(this);
		thread.start(); // �غ�ܰ�, run()ȣ��
	} // cons end

	// �޼��� : ������ ��û�Ҷ� ����� �뵵
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf) {
			// ��ȭ������ ������ ������
			try {
				String msg = tf.getText().trim();
				if (msg.length() < 1) {
					JOptionPane.showMessageDialog(this, "��ȭ������ �Է��Ͻÿ�");
					tf.requestFocus(); // ��Ŀ�� ����
					return;
				} // if

				// ������ ������ �۾�
				out.writeUTF("[" + name + "]���� ��>>" + msg);
				tf.setText(""); // �����

			} catch (Exception ex) {
				ta.append("������ �����͸� �������� ���� �߻� :" + ex);
				ta.append("10�� �Ŀ� ���� �մϴ� ");
				try {
					Thread.sleep(10000);
				} catch (Exception ex2) {
				}

				System.exit(0);
			} // catch

		} else if (e.getSource() == b1) { // ����
			int an = JOptionPane.showConfirmDialog(this, "�����ұ��", "����",
					JOptionPane.YES_NO_OPTION);
			switch (an) {
			case JOptionPane.YES_OPTION:
				System.exit(0);
				break;
			case JOptionPane.NO_OPTION:
				break;
			} // switch

		} else if (e.getSource() == b2) { // ����Ʈ
			// ��ȭ�� ����Ʈ
			ta.setText("");
			ta.append(name);
		} else if (e.getSource() == b3) { // ����
			ta.setFont(new Font("Dialog", Font.BOLD, 16));

			ta.setForeground(Color.blue);

			tf.setFont(new Font("Dialog", Font.BOLD, 16));
			tf.setBackground(Color.yellow);
		}
	} // actionPerformed

	// �޼��� : ������ ������ ������ ó��(���)
	public void run() {
		try {
			while (true) {
				String str = in.readUTF();
				ta.append(str + "\n");
				scrollBar.setValue(scrollBar.getMaximum());

			} // while
		} catch (Exception ex) {
			ta.append("�����κ��� �����͸� �޴��� ���� :" + ex);
			ta.append("10�� �Ŀ� ���� �մϴ�");
			try {
				Thread.sleep(10000);
			} catch (Exception ex2) {
			}

			System.exit(0);
		} // catch
	} // run

	// main
	public static void main(String[] args) {
		new MiddleClient(args[0], Integer.parseInt(args[1]));
		// ����ip ����port
	} // main
} // class
