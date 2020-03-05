package ch10_class;

class Sung {

    private String name;
    private int kor;
    private int eng;

    // 인자없는 기본 생성자
    public Sung() {
    }

    // 인자있는 생성자
    public Sung(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;

    }// cons end

    // 사용자가 만든 메서드
    public void disp() {
        System.out.println(name + "\t" + kor + "\t" + eng);
        System.out.printf("%10s %5d %5d\n", name, kor, eng);
    }

}// class sung end
 // --------------------------------------------------

public class Test02_objectArr {
    public static void main(String[] args) {
        Sung kim = new Sung("김연아", 77, 88);
        Sung lee = new Sung("이동욱", 44, 66);
        Sung park = new Sung("김이박지성", 46, 56);

        kim.disp();
        lee.disp();
        park.disp();

        System.out.println("------------------------");
        Sung s[] = new Sung[3];

        s[0] = new Sung("에씨", 70, 80);
        s[1] = new Sung("비씨", 77, 66);
        s[2] = new Sung("시씨", 90, 80);

        for (int i = 0; i < s.length; i++) {
            System.out.println("----");
            s[i].disp();

        }
        System.out.println("------------------------");

        Sung m[] = { new Sung("김김", 60, 50), new Sung("이이", 50, 60),
                new Sung("박박", 40, 70) };
        for (int i = 0; i < m.length; i++) {
            m[i].disp();
        }

    }
}