package ch25_db;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UpdateTest extends JFrame implements ActionListener {

    JLabel laJemok;
    JLabel laName, laId, laEmail, laTitle, laContent;

    JTextField tfName, tfId, tfEmail, tfTitle;
    JTextArea taContent;

    JButton b_update;

    // 생성자
    public UpdateTest() {

        laJemok = new JLabel("GuestBook");
        laJemok.setFont(new Font("굴림체", Font.BOLD, 30));
        laJemok.setForeground(Color.RED);

        laName = new JLabel("이름", JLabel.RIGHT);
        laId = new JLabel("ID", JLabel.RIGHT);
        laEmail = new JLabel("이메일", JLabel.RIGHT);
        laTitle = new JLabel("글제목", JLabel.RIGHT);
        laContent = new JLabel("글내용", JLabel.RIGHT);

        laName.setFont(new Font("굴림체", Font.PLAIN, 20));
        laId.setFont(new Font("굴림체", Font.PLAIN, 20));
        laEmail.setFont(new Font("굴림체", Font.PLAIN, 20));
        laTitle.setFont(new Font("굴림체", Font.PLAIN, 20));
        laContent.setFont(new Font("굴림체", Font.PLAIN, 20));

        laName.setForeground(Color.yellow);
        laId.setForeground(Color.yellow);
        laEmail.setForeground(Color.yellow);
        laTitle.setForeground(Color.yellow);
        laContent.setForeground(Color.yellow);

        tfName = new JTextField();
        tfId = new JTextField();
        tfId.setEditable(false);
        tfEmail = new JTextField();
        tfTitle = new JTextField();
        taContent = new JTextArea();

        b_update = new JButton("update");

        getContentPane().setLayout(null); // 직접 디자인.....

        laJemok.setBounds(50, 30, 250, 30);
        laName.setBounds(20, 70, 70, 30);
        laId.setBounds(20, 100, 70, 30);
        laEmail.setBounds(20, 130, 70, 30);
        laTitle.setBounds(20, 160, 70, 30);
        laContent.setBounds(20, 190, 70, 30);

        tfName.setBounds(110, 70, 200, 28);
        tfId.setBounds(110, 100, 200, 28);
        tfEmail.setBounds(110, 130, 200, 28);
        tfTitle.setBounds(110, 160, 200, 28);
        taContent.setBounds(110, 190, 200, 110);
        taContent.setLineWrap(true);

        b_update.setBounds(60, 300, 100, 40);

        getContentPane().add(laJemok);
        getContentPane().add(laName);
        getContentPane().add(laId);
        getContentPane().add(laEmail);
        getContentPane().add(laTitle);
        getContentPane().add(laContent);

        getContentPane().add(tfName);
        getContentPane().add(tfId);
        getContentPane().add(tfEmail);
        getContentPane().add(tfTitle);
        getContentPane().add(taContent);
        getContentPane().setBackground(Color.darkGray);

        getContentPane().add(b_update);

        setVisible(false);
        setSize(400, 500);

        taContent.setBackground(Color.CYAN);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        new UpdateTest();
    }

}