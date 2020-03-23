package ch18_util;

import java.util.StringTokenizer;

public class Test10_StringTokenizer {

    // 파싱 문자열 일정하게 분할한다

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("김떡순|짬짜면|삼선짬뽕|울면", "|");
        // 반드시 | 써야하는건 아니지만, 가장 안쓰는 문자를 써야한다.
        // 공백 콤마 등은 많이 쓴다 >> 구분자로 쓸수 없다.
        System.out.println(st.countTokens());

        while (st.hasMoreElements()) {
            System.out.print(st.nextToken() + "\t");
            System.out.print(st.hasMoreTokens() + "\n");
        }

        System.out.println("--------------------");

        StringTokenizer st2 = new StringTokenizer("안녕1헬로1ㅋㅋㅋ1김철수1짜장면", "1");
        System.out.println(st2.countTokens());

        while (st2.hasMoreElements()) {
            System.out.print(st2.nextToken() + "\t");
            System.out.print(st2.hasMoreTokens() + "\n");
        }

        System.out.println("--------------------");

        StringTokenizer st3 = new StringTokenizer("안녕1헬로1ㅋㅋㅋ1김철수1짜장면", "1");
        System.out.println(st3.countTokens());
        int cnt = st3.countTokens();

        for (int i = 0; i < cnt; i++) {
            System.out.print(st3.nextToken() + "\t");
            System.out.print(st3.hasMoreTokens() + "\n");
        }

        System.out.println("--------------------");

        String str = "a,b,c,d,dfd,asadf,sdf,s,ssd,s,s,ss,dfd,dft,ht,et,edtg,sfag";
        String s[] = str.split(",");

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "  ");
        }

    } // main end
} // class end