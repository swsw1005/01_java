package swsw.collection.ch01_arraylist;

import java.util.ArrayList;

import swsw.ch02.Jumin;

public class Test01 {

    public static void main(String[] args) {

        String[] arrayObj = new String[2];

        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three";
        // java.lang.ArrayIndexOutOfBoundsException:
        // 2

        ArrayList<String> al = new ArrayList<String>();

        al.add("one");
        al.add("two");
        al.add("three");

        for (int i = 0; i < al.size(); i++) {
            System.out.printf(" al.get(%d) : %s", i, ((String) al.get(i)));
        }

        for (int i = 0; i < al.size(); i++) {
            String val = (String) al.get(i);
            System.out.printf(" al.get(%d) : %s", i, val);
        }

        // <클래스>도 가능하다.
        String ju_arr[] = { "880512-1234567", "901231-2345678",
                "991122-7894561", "001230-0231564", "550101-7894561" };

        ArrayList<Jumin> jumins = new ArrayList<>();
        jumins.add(new Jumin(ju_arr[0]));
        jumins.add(new Jumin(ju_arr[1]));

        for (int i = 2; i < ju_arr.length; i++) {
            jumins.add(new Jumin(ju_arr[i]));
        } // for end

    }// main end
}// class end
