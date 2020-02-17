package ch07_array;

public class Test05_arr {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        char ch1[] = new char[s.length()];

        s.getChars(5, 11, ch1, 3);
        // 5부터 11직전까지, ch1 배열 1번째칸에 복사
        // s.getChars(srcBegin, srcEnd, dst, dstBegin);
        //

        ch1[0] = 'A';
        ch1[19] = 'Z';
        System.out.println(s);
        System.out.println(ch1.length);
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]);
        }
        System.out.println("------");
        String s2 = "가나다라마바사아자차카타파하";
        char ch2[] = new char[s2.length()];

        s2.getChars(3, 5, ch2, 5);
        ch2[0] = '귀';
        ch2[13] = '홍';
        for (int i = 0; i < ch2.length; i++) {
            System.out.print(ch2[i]);
        }
        System.out.println();
        System.out.println(s2);

    }
}