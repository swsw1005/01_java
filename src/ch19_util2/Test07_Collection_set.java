package ch19_util2;

import java.util.*;

/*
컬렉션 자료형

Iterator, Set,  HachSet, List, ArrayList
Vector, Map , HashMap, Hashtable

Collection 자료형의 주요 메소드

int Size()  요소 갯수 리턴
boolean isEmpty     컬렉션 비어있는가?
boolean add(Object ob)  요소 추가 성공하면 true 
boolean remove(Object ob)   요소 삭제,  성공하면 true 리턴
boolean contatins(Object ob)    해당 객체에 컬렉션 클래스 포함되어있다.

Set, HashSet    중복 불가
List, 




*/

public class Test07_Collection_set {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("총무과");
        set1.add("인사과");
        set1.add("회계팀");
        set1.add("영업팀");

        System.out.print("set1.size() > ");
        System.out.println(set1.size());

        System.out.println("-----------------------");

        Iterator iter = set1.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        String[] arr = new String[set1.size()];

        int j = 0;
        while (iter.hasNext()) {
            arr[j] = (String) iter.next();
            arr[j] = arr[j].trim();
            j++;
        }

        System.out.println("-----------------------");

        String booseo = set1.toString();

        System.out.println(booseo);

        booseo = booseo.replace('[', ' ');
        booseo = booseo.replace(']', ' ');

        StringTokenizer st = new StringTokenizer(booseo, ",");

        String booseo_arr[] = new String[set1.size()];

        for (int i = 0; i < booseo_arr.length; i++) {
            booseo_arr[i] = st.nextToken();
            booseo_arr[i] = booseo_arr[i].trim();
        }
        System.out.println("-----------------------");
        for (int i = 0; i < booseo_arr.length; i++) {
            System.out.println(booseo_arr[i]);
        }

        for (int i = 0; i < booseo_arr.length; i++) {
            System.out.print(booseo_arr[i] + "\t" + arr[i] + "\t");
            System.out.println(booseo_arr[i].equals(arr[i]));
        }

    }
}