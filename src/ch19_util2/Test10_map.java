package ch19_util2;

import java.util.*;

public class Test10_map {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        // key value

        map1.put("id", "kim");
        map1.put("pwd", "1234");
        map1.put("addr", "서울 구로구");
        map1.put("tel", "01012345678");

        System.out.println(map1.get("id"));

        map1.put("date", new Date().toString());

        System.out.println(map1.get("date"));

    }
}