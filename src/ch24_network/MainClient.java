package ch24_network;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
import java.io.*;
import java.util.*;

/* #############################
    프로토콜
    대기실입장 100
    방 만들기 200
    방 들어가기 210
    방에서 대화하기 400
    대화명 변경 420
    귓속말 450
    나가기 290
    종료    900
  #############################
*/
public class MainClient extends JFrame
        implements Runnable, ActionListener, MouseListener {

    // 변수
    Socket s = null;
    BufferedReader in;
    OutputStream out;
    String name, ip, title = "대기실";
    // 테이블 모델 - 데이터
    Object[][] data1 = new String[0][2];
    Object[][] data2 = new String[0][1];
    Object[][] data3 = new String[0][2];
    // 테이블 모델 - 컬럼
    String[] cols1 = { "방제", "인원" };
    String[] cols2 = { "닉" };
    String[] cols3 = { "닉", "위치" };

    DefaultTableModel model1 = new DefaultTableModel(data1, cols1) {
        public boolean isCellEditable(int rows, int cols) {
            return false;
        }// 테이블 모델 생성 + 편집 false
    };
    DefaultTableModel model2 = new DefaultTableModel(data2, cols2) {
        public boolean isCellEditable(int rows, int cols) {
            return false;
        }// 테이블 모델 생성 + 편집 false
    };
    DefaultTableModel model3 = new DefaultTableModel(data3, cols3) {
        public boolean isCellEditable(int rows, int cols) {
            return false;
        }// 테이블 모델 생성 + 편집 false
    };
    // 테이블 모델 > jtable 생성
    JTable table01 = new JTable(model1);
    JTable table02 = new JTable(model2);
    JTable table03 = new JTable(model3);
    // jtabla > 스크롤 패널에
    JScrollPane waitroom_ScrollPane = new JScrollPane(table01);
    JScrollPane roominfo_ScrollPane = new JScrollPane(table02);
    JScrollPane waitinfo_ScrollPane = new JScrollPane(table03);
    // 버튼 추가
    JButton creatB = new JButton("방 만들기");
    JButton roominB = new JButton("방 입장");
    JButton exitB = new JButton("종료");
    // 대화방 객체 생성
    RoomClient roomClient = new RoomClient();// 대화방

    // 생성자
    public MainClient(String ip1) {

        name = JOptionPane.showInputDialog(null, "대화명 입력", "대화명 입력받는 창");
        setTitle("MainClient 채팅 - " + name);
        this.ip = ip1;
        // 열 순서 변경 금지
        table01.getTableHeader().setReorderingAllowed(false);
        table02.getTableHeader().setReorderingAllowed(false);
        table03.getTableHeader().setReorderingAllowed(false);
        // 테이블 헤더 배경 색상 지정
        table01.getTableHeader().setBackground(Color.red);
        table02.getTableHeader().setBackground(Color.orange);
        table03.getTableHeader().setBackground(new Color(211, 211, 5));

        creatB.setBackground(new Color(85, 215, 211));
        roominB.setBackground(new Color(85, 215, 211));
        exitB.setBackground(new Color(85, 215, 211));

        creatB.setFont(new Font("Dialog", Font.BOLD, 16));
        roominB.setFont(new Font("Dialog", Font.BOLD, 16));
        exitB.setFont(new Font("Dialog", Font.BOLD, 16));

        getContentPane().setLayout(null);// 레이아웃 직접 짠다

        getContentPane().add(waitroom_ScrollPane).setBounds(10, 10, 400, 250);
        getContentPane().add(roominfo_ScrollPane).setBounds(415, 10, 168, 250);
        getContentPane().add(waitinfo_ScrollPane).setBounds(10, 270, 400, 197);

        getContentPane().add(creatB).setBounds(449, 300, 120, 30);
        getContentPane().add(roominB).setBounds(449, 340, 120, 30);
        getContentPane().add(exitB).setBounds(449, 380, 120, 30);

        if (name == null || name.length() < 1) {
            JOptionPane.showMessageDialog(this, "대화명 제대로 입력하세요 ^^");
            return;
        } // if

        setVisible(true);
        setSize(610, 550);
        setResizable(false);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        eventUp();
        connectProcess();

    } // cons end

    // 메소드 - 사용자 정의
    public void eventUp() {

        creatB.addActionListener(this);
        roominB.addActionListener(this);
        exitB.addActionListener(this);

        table01.addMouseListener(this);

        // 대화방 객체의 이벤트 처리도 여기서...
        roomClient.tf.addActionListener(this);
        roomClient.nickB.addActionListener(this);
        roomClient.sayB.addActionListener(this);
        roomClient.outB.addActionListener(this);
    } // eventUp() end

    // 사용자 정의 메소드 - 서버 접속
    public void connectProcess() {
        try {
            s = new Socket(ip, 7777);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = s.getOutputStream();
            // 서버로 보낸다.
            out.write((name + "\r\n").getBytes());// 한글 깨지지 않도록 인코딩

            new Thread(this).start();

        } catch (Exception ex) {
            System.out.println("\n서버연결 실패" + ex + "\n\n");
        }
    } // connectProcess() end

    // 사용자 정의 메소드 - 채팅방 나가기
    private void closeProcess() {

        try {
            roomClient.setVisible(false);
            roomClient.dispose();// 리소스 반환
            out.write(("900|\r\n").getBytes());// 서버요청-종료protocel

            s.close();
            in.close();
            out.close();
        } catch (Exception ex4) {
        }
    }

    // 메소드 - 오버라이드
    int protocol = 0;

    @Override
    public void run() {
        while (true) {
            try {
                String msg = in.readLine();
                if (msg == null) {
                    return;
                }
                StringTokenizer token = new StringTokenizer(msg, "|");
                // 예시 msg = "200|대화명|위치";
                protocol = Integer.parseInt(token.nextToken());

                switch (protocol) {
                case 100: { // 대기실 입장
                    String ob[] = { token.nextToken(), token.nextToken() };
                    model3.addRow(ob);
                    // 대화명, 위치
                    break;
                } // 100 end ///////////////////////////////////////

                case 200: { // 대화방 만들기
                    String ob[] = { token.nextToken(), token.nextToken() };
                    // 방 제목, 인원
                    model1.addRow(ob);
                    break;
                } // 200 end ///////////////////////////////////////

                case 210: { // 대화방 입장
                    String n = token.nextToken(); // 대화명 (서버가 보내준)
                    String t = token.nextToken(); // 방제목 (서버가 보내준)

                    // 방제목변경(model3)
                    for (int i = 0; i < model3.getRowCount(); i++) {
                        String temp = (String) model3.getValueAt(i, 0);
                        // (대화명 추출)
                        if (temp.equals(n)) {// model3 대화명 == 서버가 보내준 대화명
                            model3.setValueAt(t, i, 1); // i행 1열 위치 방제목(from서버)
                            break; // 작업완료했으니 for문 그만!
                        } // if end
                    } // for end

                    // 대화방 입장했으니, 인원수 증가
                    for (int i = 0; i < model1.getRowCount(); i++) {
                        String temp = (String) model1.getValueAt(i, 0); // (방제목_추출)
                        if (temp.equals(t)) { // model1 방제목 == 서버가 보내준 방제목
                            int inwon = Integer
                                    .parseInt(model1.getValueAt(i, 1) + "");
                            model1.setValueAt(++inwon, i, 1); // 증가된 값을 다시
                                                              // 설정해준다.
                            break;// 목표이뤘으면 for문 나가자
                        } // if end
                    } // for end

                    if (n.equals(name)) {// 자신이 방에 들어갈때
                        roomProcess(); // 내용길어서 따로 메소드
                    } else if (t.equals(title)) {// 다른 사람이 들어올 때

                        Object ob[] = { n };
                        roomClient.model1.addRow(ob);
                        roomClient.inwon
                                .setText(roomClient.model1.getRowCount() + "");
                        roomClient.ta.append("*****[" + n + "]님 입장*****\n\n");
                    } // else if end
                    break;
                } // 210 end ///////////////////////////////////////

                case 400: { // 대화하기
                    roomClient.ta.append(" " + token.nextToken() + "\n");
                    break;
                } // 400 end ///////////////////////////////////////

                case 420: { // 대화명 변경

                    String oldN = token.nextToken();
                    String newN = token.nextToken();
                    String t = token.nextToken();
                    // model3에서 대화명 변경
                    if (t.equals(title)) {
                        for (int i = 0; i < model3.getRowCount(); i++) {
                            String nN = (String) model3.getValueAt(i, 0);
                            if (oldN.equals(nN)) {// 대화명 같은.존재하면 새 대화명 바꾸기
                                model3.setValueAt(newN, i, 0);
                                setTitle("MainClient 채팅 - " + name);
                            }
                        }
                    }
                    // 대화방에서 대화명 변경
                    if (t.equals(title)) { // 방제목 일치하면
                        for (int i = 0; i < roomClient.model1
                                .getRowCount(); i++) {
                            String nN = (String) roomClient.model1.getValueAt(i,
                                    0);
                            if (oldN.equals(nN)) {
                                roomClient.model1.setValueAt(newN, i, 0);
                                break;
                            } // if end
                        } // for end
                        roomClient.ta.append("\n*** ***[" + oldN + "] 닉변경 to ["
                                + newN + "]*** ***\n");
                    } // if end

                    // 이름이 올드N이면, 새이름으로 바꿔준다.
                    if (oldN.equals(name)) {
                        name = newN;
                    }

                    break;
                } // 420 end ///////////////////////////////////////

                case 450: { // 귓속말

                    String n = token.nextToken();
                    String t = token.nextToken();
                    String sayto = ">>>from [" + n + "] : " + t + "\n";
                    roomClient.ta.append(sayto);

                    break;
                } // 450 end ///////////////////////////////////////

                case 290: { // 대화방 나가기
                    String n = token.nextToken(); // 서버가 보내준 대화명
                    String t = token.nextToken(); // 서버가 보내준 방제목

                    // model1인원정리
                    for (int i = 0; i < model1.getRowCount(); i++) {
                        String temp = (String) model1.getValueAt(i, 0);
                        if (t.equals(temp)) {
                            int inwon = Integer
                                    .parseInt(model1.getValueAt(i, 1) + "");
                            if (inwon == 1) {
                                model1.removeRow(i); // 혼자있다가 나갔을때 행 삭제
                            } else {
                                model1.setValueAt(--inwon, i, 1); // 인원정리
                            }
                        }
                    } // for end

                    // model3.위치 갱신(대기실로)
                    for (int i = 0; i < model3.getRowCount(); i++) {
                        String temp = (String) model3.getValueAt(i, 0);// 대화명
                                                                       // 꺼낸다.
                        if (n.equals(temp)) { // 대화명이 일치하면
                            model3.setValueAt("대기실", i, 1);
                            break; // 대기실로 옯겼으면 for 그만!
                        }
                    } // for end

                    // 대화명이 일치하면, 내가 대화방에서 나갈때
                    if (n.equals(name)) {
                        roomOutProcess();
                    } // if end

                    // 대화방에서 다른 사람이 나갈때
                    if (t.equals(title)) { // 방이름이 일치하면
                        for (int i = 0; i < roomClient.model1
                                .getRowCount(); i++) {
                            String temp = (String) roomClient.model1
                                    .getValueAt(i, 0);// 대화명 추출

                            if (n.equals(temp)) {
                                roomClient.model1.removeRow(i);// 나간사람 지우기
                                break; // 할일했으면 for 그만!!
                            }
                        } // for end
                        roomClient.inwon
                                .setText(roomClient.model1.getRowCount() + "");
                        roomClient.ta.append("\n###[" + n + "] 퇴장### \n");
                    }
                    break;
                } // 290 end ///////////////////////////////////////

                case 900: { // 프로그램 종료
                    String n = token.nextToken(); // 대화명(from server)
                    String t = token.nextToken(); // 방제목(from server)

                    // model3에서 제거 작업
                    for (int i = 0; i < model3.getRowCount(); i++) {
                        // 모델3 대화명 추출
                        String temp = (String) model3.getValueAt(i, 0);
                        if (temp.equals(n)) { // 대화명 같은 행 찾으면
                            model3.removeRow(i); // 해당 열 지우고
                            break; // for문 그만!!
                        }
                    } // for end

                    // 대화중 나갈때, model1 인원정리
                    if (!t.equals("대기실")) { // not if 대기실 == if 대화중
                        for (int i = 0; i < model1.getRowCount(); i++) {
                            String temp = (String) model1.getValueAt(i, 0);

                            if (temp.equals(t)) { // 방제목이 같으면
                                String b = model1.getValueAt(i, 1).toString();
                                int a = Integer.parseInt(b);

                                if (--a == 0) { // 혼자있다가 나간경우
                                    model1.removeRow(i); // 제거
                                } else { // 혼자가 아니었던경우
                                    model1.setValueAt(a + "", i, 1); // 인원정리
                                }
                                break; // for문 그만
                            } // if end

                        } // for end
                    } // if end

                    // 대화방 나가면 나간사람 정리(대화방.model1)
                    if (t.equals(title)) {
                        for (int i = 0; i < roomClient.model1
                                .getRowCount(); i++) {
                            String temp = (String) roomClient.model1
                                    .getValueAt(i, 0);
                            if (temp.equals(n)) { // 대화명 일치하면
                                roomClient.model1.removeRow(i);
                                break;
                            } // if end

                        } // for end
                        roomClient.inwon
                                .setText(roomClient.model1.getRowCount() + "");
                        roomClient.ta.append("\n*****[" + n + "]퇴장*****\n");
                    } // if end

                    break;
                } // 900 end ///////////////////////////////////////
                }

            } catch (Exception ex1) {
                System.out.println("서버 연결 실패" + ex1);
                return;
            }
        }
    } // run() end

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object ob = ae.getSource();
        // 방 만들기 버튼
        if (ob == creatB) {
            title = JOptionPane.showInputDialog(this, "제목을 입력하세요", "방 만들기");
            if (title == null || title.length() < 1) {
                JOptionPane.showMessageDialog(this, "방제목 빈칸 노노");
                return;
            }
            try {
                out.write(("200|" + title + "\r\n").getBytes());// 서버로 방 제작 요청
            } catch (Exception ex1) {
            }
        }
        // 방 입장 버튼
        if (ob == roominB) {
            int row = table01.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "방을 선택하세요");
                return;
            }
            title = (model1.getValueAt(row, 0).toString());
            try {
                out.write(("210|" + title + "\r\n").getBytes());
            } catch (Exception ex2) {
            }
        } // 방 입장 end

        if (ob == roomClient.tf) { // 채팅입력
            String msg = roomClient.tf.getText().trim();
            if (msg.length() < 1) {
                JOptionPane.showMessageDialog(this, "대화내용 입력");
                return;
            }
            try {
                out.write(("400|" + msg + "\r\n").getBytes());
                out.write(("400|" + msg + "\r\n").getBytes());
                roomClient.tf.setText("");
            } catch (Exception ex3) {
            }
        } // 채팅입력 end

        // 방 나가기
        if (ob == roomClient.outB) {
            try {
                out.write(("290|\r\n").getBytes()); // 서버로 요청
            } catch (Exception ex4) {
            }
            title = "대기실";
        }

        // 대화명 변경
        if (ob == roomClient.nickB) {
            String newName = JOptionPane.showInputDialog("새로운 대화명을 입력하세요");

            if (newName == null || newName.length() < 1) {
                return;
            }
            for (int i = 0; i < roomClient.model1.getRowCount(); i++) {
                String oldName = (String) roomClient.model1.getValueAt(i, 0);
                if (newName.equals(oldName)) {
                    JOptionPane.showMessageDialog(this, "사용중인 대화명이다.");
                    return;
                }
            } // for end

            try {
                out.write(("420|" + newName + "\r\n").getBytes());
            } catch (Exception e) {
            }
        }

        // 귓속말
        if (ob == roomClient.sayB) {
            int row = roomClient.table1.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "귓말상대 선택요망");
                return;
            } // if end

            // 귓속말 상대 이름 얻어서
            String sayN = (roomClient.model1.getValueAt(row, 0).toString());
            // 귓속말 메세지 얻기
            String say = JOptionPane.showInputDialog(roomClient, "귓말 입력하세요");
            // 귓말 입력 없으면 그냥 취소(리턴)
            if (say == null || say.length() < 1)
                return;

            try {
                // 서버로 보내고
                out.write(("450|" + sayN + "|" + say + "\r\n").getBytes());
                // 내 창에도 출력
                String sayto = ">>>to [" + sayN + "] : " + say + "\n";
                roomClient.ta.append(sayto);

            } catch (Exception ex6) {
            }

        } // if end

        // 종료
        if (ob == exitB) {
            closeProcess();// 메서드 호출
            System.exit(0);
        }

    } // actionPerformed() end

    @Override
    public void mousePressed(MouseEvent me) {
        model2.setRowCount(0);// 테이블 내용 모두 제거

        int r = table01.getSelectedRow(); // 선택한 방 index
        String temp = (String) model1.getValueAt(r, 0); // 선택한 방 제목 얻기

        for (int i = 0; i < model3.getRowCount(); i++) {
            String roomT = (String) model3.getValueAt(i, 1);
            if (temp.equals(roomT)) {
                Object ob[] = { model3.getValueAt(i, 0) }; // 대화명
                model2.addRow(ob); // 대화명 추가
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    // 사용자 정의 메소드 - 내가 방에 들어올때...
    private void roomProcess() {
        roomClient.setVisible(true); // 대화창 보이게
        roomClient.ta.append(" \n *******[" + title + "] 입장*******\n\n");

        for (int i = 0; i < model3.getRowCount(); i++) {
            String temp = (String) model3.getValueAt(i, 1);

            if (temp.equals(title)) {
                Object ob[] = { model3.getValueAt(i, 0) };
                roomClient.model1.addRow(ob);
            }
        } // for end

        roomClient.inwon.setText(roomClient.model1.getRowCount() + "");// 인원수_set
        // 방 입장후에
        roominB.setEnabled(false);// 입장버튼 비활성화
        creatB.setEnabled(false);// 생성버튼 비활성화

    } // roomProcess() end

    // 사용자 정의 메소드 - 내가 방에서 나갈때....
    public void roomOutProcess() {

        roomClient.ta.setText(""); // 대화목록 싹 지운다
        roomClient.model1.setRowCount(0); //

        for (int i = 0; i < roomClient.model1.getRowCount(); i++) {
            roomClient.model1.removeRow(0); // 대화명을 모두 제거
        }
        // 인원수 정리
        int a = roomClient.model1.getRowCount();
        roomClient.inwon.setText(a + "");

        // 대화창 닫고 + 방생성, 방입장 버튼 활성화
        roomClient.setVisible(false);
        roominB.setEnabled(true);
        creatB.setEnabled(true);

    }

    // test main **********************************************************
    public static void main(String[] args) {
        new MainClient("192.168.137.54"); // 학원 - 메인컴
        // new MainClient("192.168.137.24"); // 학원 - 성우컴
        // new MainClient("192.168.101.241"); // 집 - 데탑
    }
}