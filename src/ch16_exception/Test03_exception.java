package ch16_exception;

//고칠수 없는 에러

public class Test03_exception {

    public static void main(String[] args) {
        try {

            Runtime r = Runtime.getRuntime();
            // 실행파일 정보를 얻어서
            // r.exec("C:\\Windows\\system32\\notepad.exe");
            // r.exec("C:\\Program Files\\Microsoft
            // Office\\root\\Office16\\excel.exe");
            r.exec("C:\\Windows\\system32\\calc.exe");
            r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe namu.wiki/w/");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}