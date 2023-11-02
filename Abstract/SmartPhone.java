package JavaJava;

public class SmartPhone extends Phone { // 확장된 클래스
    public SmartPhone(String owner) {
        super(owner);
    }

    void internetsearch() {
        System.out.println("인터넷 검색하자!");
    }
}
