package ch16_exception;

public class Test05_exception {

    public static void main(String[] args) {
        System.out.println("");

        try {

            System.out.println("aa() 호출");
            aa();
            System.out.println("main 복귀");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("main() finally");
        }

    }

    public static void aa() {
        System.out.println("aa() start");
        try {

            System.out.println("bb() 호출");
            bb();
            System.out.println("aa() 복귀");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("aa() finally");
        }
    } // aa() end

    public static void bb() {
        System.out.println("bb() start");
        try {

            System.out.println("cc() 호출");
            cc();
            System.out.println("bb() 복귀");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("bb() finally");
        }
    } // bb() end)

    public static void cc() {
        System.out.println("cc() start");
        try {

            System.out.println("dd() 호출");
            dd();
            System.out.println("cc() 복귀");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("cc() finally");
        }
    } // cc() end

    public static void dd() {
        System.out.println("dd() start");

        System.out.println("나누기 전");

        try {

            int x = 3, y = 0;
            // 에러 발생
            System.out.println("에러발생");

            System.out.println(x / y);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("dd() finally");
        }

    } // dd() end
}
