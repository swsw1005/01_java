package ch18_util;

import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Scanner;

public class Test02_Hashtable {

    public static void main(String[] args) {

        Hashtable<String, Object> ht = new Hashtable<String, Object>();

        ht.put("id", "kim");
        ht.put("pw", 1234.567);
        ht.put("date", new java.util.Date());
        ht.put("email", "swsw@gmail.com");
        ht.put("addr", "서울시 구로구 구로5동 영진빌딩");

        System.out.println("ht.size()");
        System.out.println(ht.size()); // 5

        System.out.println(ht.get("id")); // kim
        System.out.println(ht.get("pw")); // 1234.567
        System.out.println(ht.get("date")); // Thu Mar 19 09:41:00 KST 2020
        System.out.println(ht.get("email")); // swsw@gmail.com
        System.out.println(ht.get("addr")); // 서울시 구로구 구로5동 영진빌딩

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss z");

        System.out.println(df.format(ht.get("date")));

        ht.put("id", "lee"); // 덮어씌우기
        System.out.println(ht.get("id")); // lee

        ///////////////////////////////////////

        Hashtable<Integer, String> hb2 = new Hashtable<Integer, String>();

        String ll[] = new String[1000];

        for (int i = 0; i < 1000; i++) {
            String temp = "동전으로 " + i + "원 결제하세요";
            ll[i] = temp;
            // System.out.println(i);
        }

        for (int i = 0; i < 1000; i++) {
            // hb2.put((i + ""), ll[i]);
            hb2.put(i, ll[i]);
        }

        Scanner sc = new Scanner(System.in);

        String ss = sc.nextLine();
        long l1 = Long.parseLong(ss);
        int k = (int) l1 % 1000;

        System.out.println(k);
        System.out.println("-----");

        System.out.println(hb2.get(k - 1));
        System.out.println(hb2.get(k));
        System.out.println(hb2.get(k + 1));

        sc.close();

    }
}
