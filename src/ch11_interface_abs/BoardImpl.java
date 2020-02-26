package ch11_interface_abs;

public class BoardImpl implements Board {
    // board 인터페이스에서 이미 메소드 이름 지정했다.
    // 이상한 이름 만들지말고 메소드 이름 가져다 쓸것!!

    @override
    public void boardInsert() {
        System.out.println("게시판 글 저장");
    }

    @override
    public void boardList() {
        System.out.println("게시판 글 목록");
    }

    @override
    public void boardEdit() {
        System.out.println("게시판 글 수정");
    }

    @override
    public void boardContent() {
        System.out.println("게시판 글 내용");
    }

    @override
    public void boardDelete() {
        System.out.println("게시판 글 삭제");
    }

    public static void main(String[] args) {

        Board b = new BoardImpl();
        b.boardInsert();
        b.boardList();
        b.boardEdit();
        b.boardContent();
        b.boardDelete();

    }// main end

}// class end