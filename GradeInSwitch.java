package com.mystudy.run.scanner.Study_Java.ObjectOriented;

import java.util.Scanner;

public class GradeInSwitch {
    public static void main(String[] args) {
        System.out.println("점수를 입력: ");

        Scanner scanner = new Scanner(System.in);

        String sungjuk = scanner.nextLine();
        int jumsu = Integer.parseInt(sungjuk)/10;
        char grade;

        switch (jumsu) {
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';

                System.out.println("입력한 학생의 학점은 " + grade + "입니다.");
        }
    }
}
