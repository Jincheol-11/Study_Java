package JavaJava;

public class GenericExample {
    public static void main(String[] args) {

        // <>사이에 문자열을 담기에 안녕하세요 출력
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요.";
        String str = box1.content;
        System.out.println(str);

        // <>사이에 정수를 담기에 100 출력
        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;;
        System.out.println(value);
    }
}
