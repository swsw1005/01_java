package swsw.ch01;

import java.util.Scanner;

public class Geo {
    public double latitude;
    public double longitude;

    public Geo(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public Geo() {
    }

    public void scan() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nlatitude를 입력하세요");
        latitude = sc.nextDouble();

        System.out.println("\nlongitude를 입력하세요");
        longitude = sc.nextDouble();

        sc.close();
    }

    public void disp() {

        latitude = latitude * 10e4;
        longitude = longitude * 10e4;

        latitude = Math.round(latitude);
        longitude = Math.round(longitude);

        latitude = latitude / 10e4;
        longitude = longitude / 10e4;

        System.out.println("------------좌표-------------");
        System.out.println("latitude\t" + latitude);
        System.out.println("longitude\t" + longitude);
        System.out.println("----------------------------");
    }
}