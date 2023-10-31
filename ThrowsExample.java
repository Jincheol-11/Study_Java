package JavaJava;

    public class ThrowsExample {
        public static void main(String[] args) {
            try{
                // main 메서드에서 try-catch를 사용하여 findClass 메서드 호출
                findClass();
            } catch(ClassNotFoundException e) { // 예외가 발생하면 catch 블록이 실행
                System.out.println("예외처리: " + e.toString());
            }
        }
        // ClassNotFoundException 예외가 발생한다면 , e 캐치 후 예외 메시지 출력
        public static void findClass() throws ClassNotFoundException {
            Class.forName("java.lang.String2");
        }
    }