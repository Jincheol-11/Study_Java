package JavaJava;

public class JHOper {
    public static void main(String[] args) {
        int a = 5;
        int sum = 0;

        System.out.println("a="+a+" sum="+sum);

        sum = a++ + ++a; //a++ = 5, 5출력 후 +1 , ++a = 7, 그대로 7출력

        System.out.println("a="+a+" sum="+sum);

        sum = 0;
        sum += a++; // a++ = 7, 7출력 후 +1
        sum += ++a; // ++a = 8 + 1 총 16
        System.out.println("a="+a+" sum="+sum);

    }

}

