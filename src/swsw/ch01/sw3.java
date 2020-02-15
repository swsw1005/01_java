package swsw.ch01;

public class sw3 {

    public static void main(String[] args) {
        String[] mynum = new String[] { "2013-12-12", "2015-05-14", "2020-01-29", "2012-06-04" };

        for (int i = 0; i < 10000; i++) {
            System.out.print("mynum[" + i + "]\t");
            try {
                System.out.println(mynum[i]);
                // mynum[] 순서대로 반복출력
            } catch (Exception e) { // 오류 발생하면
                System.out.println("invalid input");
                System.out.println("bye bye");
                break;// 끝낸다.
            }
        }

    }
}