package JavaJava;

public class GenericExample2 {
    public static void main(String[] args) {

        // Product 클래스의 인스턴스 생성
        // Tv라는 Generic
        Product <TV, String> produvt1 = new Product<>();

        // TV 종류와 모델 설정
        produvt1.setKind(new TV());
        produvt1.setModel("스마트TV");

        // Product1의 TV 종류와 모델을 가져옴
        TV tv = produvt1.getKind();
        String tvModel = produvt1.getModel();

        // Product 클래스의 또 다른 인스턴스 생성
        // Car이라는 Generic
        Product<Car, String> product2 = new Product<>();

        // Car의 종류와 모델 설정
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        // Product2의 Car 종류와 모델을 가져옴
        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
