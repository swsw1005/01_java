package ch08_oop;

public class Test_enhanced_for {

    public static void main(String[] args) {

        /*
         * 배열 - 연속된 데이터 저장 - 갯수(변경가능) >> 크기가 일정하지 않다. >> 참조형 변수(주소값만) // 참조형 변수
         * - 비어있는 메모리에 데이터 올리고, 주소를 저장해서 땡겨쓴다.
         * 
         */
        String[] strs = { "java", "oracle", "bigdata" };

        // 데이터 다 출력해보기
        for (int i = 0; i < strs.length; i++)
            System.out.println(strs[i]);

        System.out.println();

        // 향상된 for 문
        for (String s : strs)
            System.out.println(s);

    } // main end
} // class end