package ch08_oop;

public class Test04_method {

    public int sum(int start, int end) {

        int hap = 0;

        for (int i = start; i <= end; i++) {
            hap += i;

        } // for end
        return hap;
    } // sum(0) end

    public static void main(String[] args) {
        Test04_method tm = new Test04_method();
        int s1 = tm.sum(1, 10);
        int s2 = tm.sum(1, 100);
        int s3 = tm.sum(100, 200);

        System.out.println("s1\t" + s1);
        System.out.println("s2\t" + s2);
        System.out.println("s3\t" + s3);

    }

}