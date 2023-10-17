package Generic.Generic2;

public class GenericExample {
    public static void main(String[] args) {

        Product <TV, String> produvt1 = new Product<>();

        produvt1.setKind(new TV());
        produvt1.setModel("스마트TV");

        TV tv = produvt1.getKind();
        String tvModel = produvt1.getModel();

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();

    }
}
