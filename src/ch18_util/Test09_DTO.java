package ch18_util;

public class Test09_DTO {

    // 오로지 데이터 교환을 위한 getter / setter만 있는 클래스.
    // 다른 로직 아무것도 없다.

    // 변수 ------------------------------------------------------
    private String id;
    private String pwd;
    private String name;
    private String email;
    private String hp;
    private String addr;

    // getter setter ------------------------------------------------------
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return this.hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // 생성자 --------------------------------------------------------
    public Test09_DTO() {
    }

}