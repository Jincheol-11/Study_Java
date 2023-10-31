package JavaJava;

public class samhang {
        public static void main(String[] args) {
            int score =85;
            char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // 90점 초과시 A 80점 초과시 B 그 이하는 C
            System.out.println(score + "점은 " + grade + "등급입니다.");
        }
    }
