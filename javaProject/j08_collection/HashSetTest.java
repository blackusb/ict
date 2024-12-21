package j08_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public HashSetTest(){}  //생성자
    public void start(){
        //Set 인터페이스 상속
        //저장순서 유지하지 않는다. 중복데이터를 허용하지 않는다.

        HashSet<Integer> hs = new HashSet<Integer>();   //객체 생성

        int[] data = {43,67,34,43,54,34,65,76,65,65};   //기본데이터타입 -> 클래스타입 : 오토박싱

        //배열의 값을 HashSet컬렉션 객체에 추가
        for(int a : data){  //향상된 for문
            hs.add(a);
        }

        ///////////////////////////////
        //HashSet 객체를 얻어오기
        Iterator<Integer> li = hs.iterator();   //데이터 일렬로 줄세우기.

        //hasNext()로 Iterator객체에 데이터가 있는지 확인하고 next()로 꺼낸다.
        //몇개가 있는지 모르니 while이 적당
        while(li.hasNext()){    //객체가 있으면 true, 없으면 false
            int nextData = li.next();  //꺼내기
            System.out.print(nextData+"\t");
        }

        System.out.println();

        ///////////////////////////////
        String name[] = {"손흥민","황희찬","김민재","이강인","박지성","안정환","황희찬","김민재","이강인"};
        HashSet<String> hs2 = new HashSet<>();  //HashSet 객체 생성

        for(String n:name){ //HashSet에 name[] 담기
            hs2.add(n);
        }

        Iterator<String> iii = hs2.iterator();
        while(iii.hasNext()){
            System.out.print(iii.next()+"\t");
        }
    }

    public static void main(String[] args){
        new HashSetTest().start();
    }
}
//로또 번호 만들때 사용하면 좋음. 단, 정렬은 안해줌.