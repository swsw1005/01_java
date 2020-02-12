package ch04_control;

public class Test06_switch {

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int days = 0;

        switch (month) {

        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            days = 31;
            break;
        case 2:
            // 4의 배수 && not 100의 배수 || 400의 배수 = 윤년
            if ((2020 / 4 == 0) && ((2020 % 100 != 0) || (2020 % 400 == 0))) {
                days = 29;
            } else {
                days = 28;
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
            break;
        } // swtich end
        System.out.println(month + "월은 " + days + "까지 있습니다.");
    }
}