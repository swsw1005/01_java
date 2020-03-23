import java.util.*;

public class Test {

    public static void main(String[] args) {

        Collection<Double> c = new Vector<Double>();

        for (int i = 0; i < 100; i++) {
            double temp = Math.random() * 200 + 101;
            c.add(temp);
        }

        double[] arr = new double[c.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((Vector<Double>) c).get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]\t:\t%.4f\n", i, arr[i]);
        }

    }// main end
}
// class end
