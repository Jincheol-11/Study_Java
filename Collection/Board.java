package JavaJava;

public class Board {
    // 3가지의 생성자
    private String subject;
    private String content;
    private String writer;

    // getter 사용하여 값을 호출
    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    // 클래스의 생성자 함순인 Constructor 사용
    //원하는 정보들을 담아놓으면 새로운 객체들을 계속 생성
    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
    // setter 사용하여 값을 설정
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
