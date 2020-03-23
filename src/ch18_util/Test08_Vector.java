package ch18_util;

import java.util.Vector;

// Vector
// add()    벡터에 object 넣기
// get()    i번째 객체 얻기
// size()   요소 갯수 리턴
// remove() 요소 제거

public class Test08_Vector {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<String>();

        String[] s_arr = new String[10];
        for (int i = 0; i < s_arr.length; i++) {
            s_arr[i] = "hello" + i;
        }

        for (int i = 0; i < s_arr.length; i++) {
            vec.add(s_arr[i]);
        }

        for (int i = 0; i < vec.size(); i++) {
            System.out.printf("vec.get(%d)    ", i);
            System.out.println(vec.get(i));
        }

    }
}