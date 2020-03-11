package swsw.hw;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {

        int i_array[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < i_array.length; i++) {
            i_array[i] = (i + 1) * 10;
        }

        for (int i = 0; i < i_array.length; i++) {
            System.out.println("i_array[" + i + "] = " + i_array[i]);
        }
    }

}