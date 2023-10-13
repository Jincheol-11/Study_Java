package com.mystudy.run.expt;

public class ExceptionHandlingExample {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJAVA");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
