package ch09_cons;
// this 자신의 객체 (☆★★★★)

// this() 자신의 클래스 내의 생성자 호출한다.(☆☆☆☆★)
// 생성자 안에서 첫줄 개재 필요

// super 상위클래스 객체(☆☆☆☆★)
// 권한 받았는데 굳이 매번 요청 하는꼴
// super() 상위클래스 생성자 호출(☆★★★★)
// 생성자 안에서 첫줄 개제
// "아버지 이거 대신 해주세요"

// this() super() 동시 사용 불가

class Sung {
    String name;
    int kor;

    public Sung() {
        System.out.println("디폴드생성자 called");
    }

    public Sung(String name, int kor) {
        this.name = name;
        this.kor = kor;
        System.out.println("인자있는 생성자 called");
    }

    public void disp() {
        System.out.println("이름\t" + name + "\t국어점수\t" + kor);
    }

    public void disp(String name, int kor) {
        // Sung(name, kor);
        this.name = name;
        this.kor = kor;
        // System.out.println("이름\t" + name + "\t국어점수\t" + kor);
        disp();
    }

}

public class Test01 {

    public static void main(String[] args) {
        // new Sung();

        Sung will = new Sung("윌리엄", 99);
        will.disp();

        System.out.println();

        Sung kim = new Sung("김철수", 40); // 디폴드로 생성되었으나
        kim.disp("이효리", 50);// 덮어씌워졌다.

        System.out.println();

        Sung lee = new Sung();
        lee.disp("이효리", 50);

        System.out.println();

        Sung park = new Sung();
        park.disp("박상혁", 99);

    }
}