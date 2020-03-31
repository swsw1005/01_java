import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        String dt = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss")
                .format(new Date().getTime());
        System.out.println(dt);

    }// main end
}
// class end
