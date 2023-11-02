package JavaJava;

public class Phone {
    public String model; // 문자열 변수 선언
    public String color;

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) { // 음성메시지 보내는 메소드
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) { // 음성메시지 받는 메소드
        System.out.println("상대방: " + message);
    }

    public void hangUp() { // 전화를 끊는 메소드
        System.out.println("전화를 끊습니다.");
    }
}
