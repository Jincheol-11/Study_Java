package JavaJava;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 클래스의 객체 myPhone을 생성하고 모델과 색상을 설정
        SmartPhone myPhone = new SmartPhone("갤럭시", "실버");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        // 메서드 호출을 통해 메시지 혹은 상태 출력
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 진철이인데요.");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
