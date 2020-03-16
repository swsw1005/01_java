package ch16_exception;

public class Test04_exception {

    public static void main(String[] args) {
        int jum[] = { 155, 66, 77, 99 };

        try {
            double avg = Jumsu.calcAvg(jum);
            System.out.println("점수 : " + avg);

        } catch (JumsuException ex) {
            System.out.println("JumsuException : " + ex);
        }
    }
}

class Jumsu {
    public static double calcAvg(int score[]) throws JumsuException {
        if (score.length != 5) {// 예외발생조건
            // 예외발생
            System.out.println("-1-------------------");
            throw new JumsuException("배열 예외 발생"); // go to

        } // if end

        // 정상처리
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        } // for end

        double a = (double) sum / score.length;
        return a;
    }// calcAvg() end
}// class end

class JumsuException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -7487151314923647038L;

    public JumsuException(String msg) {
        super(msg);// 상위클래스 Exception의 생성자 호출
        System.out.println("-2-------------------");
        System.out.println("-3-------------------");
    }// cons end
}// class end
