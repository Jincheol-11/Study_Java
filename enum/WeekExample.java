package JavaJava;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        // Calendar을 활용하여 현재 요일 가져옴
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // switch문으로 case에 맞게 요일 호출
        switch (week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY;
        }

        if(today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합시다.");
        } else{
            System.out.println("열심히 자바를 공부합시다.");
        }
    }
}
