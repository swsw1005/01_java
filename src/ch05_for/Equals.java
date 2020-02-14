package ch05_for;

public class Equals {

    public static void main(String[] args) {
        String name1 = new String("java");
        String name2 = new String("java");

        System.out.println("기초변수, 참조변수 구분합니다.");

        System.out.println("name1, name2 둘다 java 이지만,");
        System.out.println("실제값은 HIP영역에 있고,");
        System.out.println("둘다 참조변수입니다.");
        System.out.println("주소(레퍼런스)가 다릅니다.");

        if (name1.equals(name2)) {
            System.out.println("if (name1.equals(name2))");
            System.out.println("\t값이 같습니다.111");
        } // if end

        if (name1 == name2) {
            System.out.println("값이 같은가.");
        } else {
            System.out.println("값은 같지만 주소가 다릅니다.");
            System.out.println("equals 통해서 값을 비교해야합니다.");
            System.out.println("레퍼런스가 다릅니다.");
        } // if else end
    }// main end
}// class end