package ch19_util2;

import java.util.*;

public class Collection {

       public static void main(String[] args) {

              // Collection

              // ____Set....................한줄(value), 중복 X
              // ________HashSet
              // ________SortedSet ,,,,,,,,,동기화(new TreeSet<>())생성자 사용시...

              // ____List...................한줄(value), 중복 O
              // ________ArrayList
              // ________Vector............동기화

              // ____Map....................두줄(key, value)
              // ________HashMap
              // ________Hashtable..........동기화
              //
              // ____________Properties.....설정값 외부에 저장하는. 일종의 HashTable
              // ex) #"DB.properties"

              // user=root
              // url=jdbc:mysql://localhost:3306/mydb

              // ------------------------------------------------------------------------------------------
              //
              // ____Set....................한줄(value), 중복 X

              Set<Integer> set1 = new HashSet<>();
              // 순서 보장 X
              SortedSet<Integer> set2 = new TreeSet<>();
              // 순서 오름차순O
              Set<Integer> set3 = new TreeSet<>();
              // 순서 오름차순O

              Iterator<Integer> it1 = set1.iterator(); // Iterator(반복자) 생성

              while (it1.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
                     System.out.println(it1.next()); // next() : 다음 데이터 리턴
              }

              // ------------------------------------------------------------------------------------------
              //
              // ____List...................한줄(value), 중복 O

              Vector<String> vec = new Vector<String>();
              vec.add("hello");
              // 쓰레드 안전

              List<String> list1 = new ArrayList<>();
              list1.add(new String("hello"));
              // 쓰레드 안전 X = 동기화 X
              // 약간 더 빠름

              // ------------------------------------------------------------------------------------------
              //
              // ____Map....................두줄(key, value)

              Map<String, String> map1 = new HashMap<>();
              // 동기화 X = 쓰레드 안전X
              map1.put("id", "kim");
              map1.put("pwd", "1234");

              Hashtable<Integer, String> table1 = new Hashtable<>();
              // 동기화 O = 쓰레드 안전 O
              table1.put(4, "kim");
              table1.put(5, "1234");

              Map<String, Integer> hh = new Hashtable<>();
              hh.put("1", 1);

       }

}
