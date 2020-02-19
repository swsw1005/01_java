package swsw.ch01;

import java.util.Scanner;

public class sw8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Geo geo1 = new Geo();// sw7.Geo. 가져온다
        geo1.latitude = scan.nextDouble();
        geo1.longitude = scan.nextDouble();

        geo1.latitude = geo1.latitude * 10e6;
        geo1.longitude = geo1.longitude * 10e6;

        geo1.latitude = Math.round(geo1.latitude);
        geo1.longitude = Math.round(geo1.longitude);

        geo1.latitude = geo1.latitude / 10e6;
        geo1.longitude = geo1.longitude / 10e6;

        System.out.println();
        System.out.println("\t위도\t\t:\t경도\n\t" + geo1.latitude + "\t:\t" + geo1.longitude);
        System.out.println();

        scan.close();
    }
}