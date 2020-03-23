package ch19_util2;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

//Iterator는 Enumeration + Colleciton 통합해서받아내는 기능...??

// Collection 읽어오는 표준화 방법중 하나

// public interface Iterator {
//     boolean hasNext();
//     Object next();
//     void remove();
//     }

// boolean hasNext()
//   읽어 올 요소가 남아있는지 확인하는 메소드이다. 있으면 true, 없으면 false를 반환한다.
// Object next() 
//   읽어 올 요소가 남아있는지 확인하는 메소드이다. 있으면 true, 없으면 false를 반환한다.
// void remove() 
//   next()로 읽어 온 요소를 삭제한다. next() 를 호출한 다음에 remove() 를 호출해야 한다. 
//  (선택적 기능이라 사용해도 그만 사용하지 않아도 그만이다)

//잘못된 예제

public class Test01_Generic {

    // 사용자 정의 메소드
    private void testCollection() {

        List list_1 = new ArrayList<>();

        list_1.add(new String("hello"));
        list_1.add(new String("안녕"));
        list_1.add(new Integer(1000)); // <<<< 에러발생. BUT 컴파일시 에러 발생하지 않음
        outPrint(list_1);
    }

    private void outPrint(Collection c) {
        Iterator iter = c.iterator();

        while (iter.hasNext()) {
            String item = (String) iter.next();
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Test01_Generic t = new Test01_Generic();

        t.testCollection();
    }
}