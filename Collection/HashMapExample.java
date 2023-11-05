package JavaJava;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성 키/값
        Map<String,Integer> map = new HashMap<>();

        //객체 저장
        //hash map은 중복된 값 허용 안함 즉 홍길동은 마지막 값만 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: "+ map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ":" + value);
        System.out.println();

        //map.keySet()을 사용하여 HashMap에 저장된 모든 키들로 이루어진 Set을 얻음
        Set<String> keySet = map.keySet();
        // Set을 순회하기 위해 Iterator를 생성하고, keySet.iterator()를 사용하여 Iterator를 초기화
        Iterator<String> keyIterator = keySet.iterator();
        //while을 사용하여 Iterator의 hasNext() 메서드를 호출하여 다음 키가 있는지 확인
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entre 수: " + map.size());
        System.out.println();
    }
}
