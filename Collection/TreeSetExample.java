package JavaJava;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        //TreeSet 컬렉션을 생성하고 정수 데이터를 저장할 수 있는 scores 객체 생성
        TreeSet<Integer> scores = new TreeSet<>();

        //Integer 객체 저장
        // 다섯 개의 정수를 scores 객체에 추가
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        //정렬된 Integer 객체를 하나씩 가져오기
        //scores에 저장된 정수를 반복문을 통해 하나씩 가져와서 출력합니다. TreeSet은 요소를 정렬된 순서로 저장하기 때문에 출력 결과는 오름차순으로 정렬됩니다.
        for (Integer s : scores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        //특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");

        //내림차순으로 정렬하기
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for(Integer s : descendingScores) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        //범위 검색(80 <=)
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for(Integer s : rangeSet) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

    }
}
