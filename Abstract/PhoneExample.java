package JavaJava;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동"); // smartPhone을 생성하고 생성자에 "홍길동"을 전달하여 폰 소유자를 초기화

        smartPhone.turnOn(); // 폰 켜는 메서드 출력
        smartPhone.internetsearch(); // 인터넷 서치 메서드 출력
        smartPhone.turnOff(); // 폰 끄는 메서드 출력
    }
}
