package ch17_io;

import java.io.*;

public class Test12_Handphone implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 355821770627279706L;

    // 변수
    String phName;
    int price;

    public String getPhName() {
        return this.phName;
    }

    public void setPhName(String phName) {
        this.phName = phName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // getter setter

    // 생성자
    public Test12_Handphone(String phName, int price) {
        this.phName = phName;
        this.price = price;
    }

    //

}