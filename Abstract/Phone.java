package JavaJava;

public abstract class Phone {
    String owner; // 소유자 문자열

    Phone(String owner) {
        this.owner = owner;
    } // 폰 소유자의 정보를 초기화하는 생성자
    void turnOn() {
        System.out.println("폰 전원 킨다.");
    } // 폰 켜는 메서드
    void turnOff() {
        System.out.println("폰 전원 끈다.");
    } // 폰 끄는 메서드
}
