package com.mystudy.run.etc;

import java.util.Scanner;

public class samdan {
    public static void main(String[] args) {

        while (true) {
            System.out.print("구구셈 - 원하는 단을 입력(값이 0 또는 1이면 종료) : ");
            Scanner scanner = new Scanner(System.in);

            String strX = scanner.nextLine();
            int dan = Integer.parseInt(strX);

            if (dan == 0 || dan == 1) break;

            for (int i = 1; i <= 9; i++) {
                System.out.printf("%2d * %2d = %2d", dan, i, dan * i);
                System.out.println();
            }
        }
    }
}
