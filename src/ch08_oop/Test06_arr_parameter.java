package ch08_oop;

class Test06 {
    public void disp(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } // for end
        System.out.println("\n-----------------------");
    } // disp end
} // class end

public class Test06_arr_parameter {

    public static void main(String[] args) {
        int m[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        Test06 t06 = new Test06();
        t06.disp(m);

    } // main end
} // class end
