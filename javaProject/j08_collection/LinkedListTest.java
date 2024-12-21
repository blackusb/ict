package j08_collection;

import java.util.LinkedList;

public class LinkedListTest {
    public LinkedListTest(){}
    public void start(){
        //LinkedList는 List, Queue, Deque 인터페이스를 상속받는다.
        //List : 저장순서를 유지, 중복 데이터 허용
        //Queue : 한쪽에서 입력하고 다른쪽에서 출력할 수 있다.
        //Deque : 양쪽에서 입력과 출력을 할 수 있다.
        //Queue와 Deque는 출력하면(꺼내면) 컬렉션에서 객체를 지운다.

        LinkedList<String> ll = new LinkedList<String>();

        ll.offer("홍길동"); //ll.offerLast() 마지막에 추가
        ll.offerLast("김연아");
        ll.add("손흥민");
        ll.push("김민재"); //push는 first로 들어감.
        ll.offerFirst("박지성");
        ll.add(1, "안정환");
        //  5      4      3     2      1      0
        //손흥민, 김연아, 홍길동, 김민재, 안정환, 박지성

        //컬렉션에 객체 꺼내기
        System.out.println("size()=>"+ll.size());
        System.out.println("pop()=>"+ll.pop()); //제일 앞에 있는 객체를 꺼내기
        System.out.println("size()=>"+ll.size());

        while(!ll.isEmpty()){    //isEmpty() : 객체가 있으면 false, 객체가 없으면 true   //앞에부터 꺼내기 때문에 index 필요없음.
            System.out.println(ll.pop());
        }
    }

    public static void main(String[] args){
        new LinkedListTest().start();
    }
}
//대기열의 경우 Queue 사용 -> 은행 손님 등

