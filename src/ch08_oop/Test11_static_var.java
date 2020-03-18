package ch08_oop;

class People {

    String name;
    int age;
    static int adultage = 20;

    // 사용자 정의 메소드
    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    } // setDate end

    // 사용자 정의 메소드
    public void disp() {
        String im = ""; // 메소드 내부 선언 변수 = 지역변수
        if (age < adultage) {
            im = "미성년자";
        } else {
            im = "성인";
        } // if else end

        System.out.println(name + " is " + im + "\t나이는 " + age + " 살");
    } // disp end

} // class end

public class Test11_static_var {

    public static void main(String[] args) {

        People kim = new People();
        People lee = new People();
        People park = new People();

        kim.setData("김연아", 18);
        lee.setData("이동국", 43);
        park.setData("박지성", 37);

        kim.disp();
        lee.disp();
        park.disp();

    } // maine end
} // class end