package JavaJava;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        //Arraylist 컬렉션 생성
        List<Board> list = new ArrayList<>();

        // 5개의 보드 객체를 ArrayList에 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        //저장된 총 객체 수를 얻고 출력
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        //특정 인덱스의 객체 가져오기 3가지의 정보를 불러옴
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        //모든 객체 하나씩 가져오기
        // b라는 객체에 할당
        for(int i=0; i<list.size(); i++) {
            Board b = list.get(i);
            // 3가지의 메서드를 활용하여 board 객체의 정보를 가져와 출력
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        //객체 삭제
        list.remove(2);
        list.remove(2);

        //향상된 for 문으로 모든 객체를 하나씩 가져오기
        for(Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
