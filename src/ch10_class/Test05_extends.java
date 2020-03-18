package ch10_class;

class GeneralSuper02 {

    protected int roomNo;
    protected int capacity;

} // class end
  // -------------------------------------

class GeneralSub02 extends GeneralSuper02 {
    String owner; // 집주인

    // 사용자 정의 메서드
    public void disp() {

        System.out.println("방번호\t" + roomNo);
        System.out.println("정원\t" + capacity);
        System.out.println("집주인\t" + owner);
    } // disp end
} // class end
  // ------------------------------------

public class Test05_extends {

    public static void main(String[] args) {
        GeneralSub02 sub02 = new GeneralSub02();

        sub02.roomNo = 3;
        sub02.capacity = 50;
        sub02.owner = "이효리";

        sub02.disp();
    } // main end
} // class end
