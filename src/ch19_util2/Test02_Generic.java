package ch19_util2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test02_Generic {

    // 사용자 정의 메소드
    private void testCollection() {

        List<String> list_1 = new ArrayList<>();

        list_1.add(new String("hello"));
        list_1.add(new String("안녕"));
        // list_1.add(new Integer(1000)); // 제네릭에 의해 자료형 정의. 컴파일 에러 발생

        // 이런 에러 뜬다.
        /*
         * The method add(String) in the type List<String> is not applicable for
         * the arguments (Integer)
         */
        outPrint(list_1);
    }

    private void outPrint(Collection<String> c) {
        Iterator<String> iter = c.iterator();

        while (iter.hasNext()) {
            String item = (String) iter.next();
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        Test02_Generic t = new Test02_Generic();
        t.testCollection();

    }
}