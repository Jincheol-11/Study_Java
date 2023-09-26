package com.mystudy.run.etc;

public class JHOper {
    public static void main(String[] args) {
        int a = 5;
        int sum = 0;

        System.out.println("a="+a+" sum="+sum);

        sum = a++ + ++a;

        System.out.println("a="+a+" sum="+sum);

        sum = 0;
        sum += a++;
        sum += ++a;
        System.out.println("a="+a+" sum="+sum);

    }

}
