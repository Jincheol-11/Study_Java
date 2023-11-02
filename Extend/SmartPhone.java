package JavaJava;

//
public class SmartPhone extends Phone{ //클래스 확장하기
    public boolean wifi; // 논리코드 (wifi의 연결상태를 나타냄)
    public SmartPhone(String model, String color) {
        // 생성자를 호출할 때 모델과 색상을 전달하면 해당 값들이 새로운 SmartPhone 객체의 속성으로 설정
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) { // 와이파이 상태 확인 메소드
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() { // 인터넷 연결 메소드
        System.out.println("인터넷에 연결합니다.");
    }
}
