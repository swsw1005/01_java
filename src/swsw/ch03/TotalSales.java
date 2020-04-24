package swsw.ch03;

import java.util.ArrayList;

// 하루 총 매출
// 문제
// 홍팍이네 분식집의 오늘 하루 매출은 아래와 같다.

// 김밥(2000원) x 57개
// 돈까스(6000원) x 29개
// 냉면(5000원) x 34개
// 주어진 코드를 활용하여, 출력 예와같은 결과를 얻는 프로그램을 작성하시오.

// 출력 예
// 총 매출: 458000원

public class TotalSales {
    public static void main(String[] args) {
        /* 1. 메뉴 객체를 생성하세요. */

        Menu kimbob = new Menu("김밥", 2000, 57);
        Menu don = new Menu("돈까스", 6000, 29);
        Menu nang = new Menu("냉면", 5000, 34);

        /* 2. 스토어 객체에 메뉴를 추가하세요. */

        Store st = new Store();

        st.add(kimbob);
        st.add(don);
        st.add(nang);

        /* 3. 하루 총 매출을 계산하세요. */
        System.out.println("토탈 매출");
        System.out.println(st.totalSales());
    }
}

class Store {
    private ArrayList<Menu> list;

    public Store() {
        this.list = new ArrayList<Menu>();
    }

    public void add(Menu menu) {
        list.add(menu);
    }

    /* 4. 총 매출액 계산 메소드를 만드세요. */
    public int totalSales() {

        int totalSales = 0;

        for (int i = 0; i < list.size(); i++) {
            totalSales += list.get(i).getCount() * list.get(i).getPrice();
        }

        return totalSales;
    }
}

class Menu {
    private String name; // 메뉴명
    private int price; // 가격
    private int count; // 하루 판매량

    public Menu(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    /* 5. price의 게터를 만드세요. */

    public int getPrice() {
        return price;
    }

    /* 6. count의 게터를 만드세요. */
    public int getCount() {
        return count;
    }

}