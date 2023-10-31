package JavaJava;

import java.util.Scanner;

public class GradeInSwitch {
        public static void main(String[] args) {
            System.out.println("점수를 입력: ");

            Scanner scanner = new Scanner(System.in); //Scanner 객체 생성, System.in은 사용자 입력 읽는데 사용

            String sungjuk = scanner.nextLine();
            int jumsu = Integer.parseInt(sungjuk)/10; // 문자열을 정수로 변환: Integer.parseInt
            char grade;

            switch (jumsu) { // switch문
                case 9:
                    grade = 'A'; // char 문자열이기에 "가 아닌 '(작은따옴표)
                    break;      // 조건에 맞다면 즉시 break
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:        // 위의 조건에 모두 해당하지 않는다면 default
                    grade = 'F';

                    System.out.println("입력한 학생의 학점은 " + grade + "입니다.");
            }
        }
    }
