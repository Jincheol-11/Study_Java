package JavaJava;

import java.util.Scanner;

    public class googoodan {
        public static void main(String[] args) {

            while (true) {
                System.out.print("구구셈 - 원하는 단을 입력(값이 0 또는 1이면 종료) : ");
                Scanner scanner = new Scanner(System.in); // 단수를 입력받기 위해 Scanner 객체를 생성

                String strX = scanner.nextLine(); // 사용자 입력을 문자열로 읽어들임
                int dan = Integer.parseInt(strX); // Integer.parseInt를 사용하여 정수로 변환

                if (dan == 0 || dan == 1) break; // 0 혹은 1을 누르면 정지

                for (int i = 1; i <= 9; i++) {
                    System.out.printf("%2d * %2d = %2d", dan, i, dan * i); // %2d : 최소 2자리의 숫자
                    System.out.println();
                }
            }
        }
    }
