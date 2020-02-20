package ch08_oop;

public class Test15 {

    public static void main(String[] args) {
        Test14_dto dto = new Test14_dto();
        // dto.id="kim";
        //
        dto.setId("kim");
        dto.setpw("123");
        dto.settel("010-1234-5678");

        System.out.println(dto.getId());
        System.out.println(dto.getPw());
        System.out.println(dto.getTel());
    }
}