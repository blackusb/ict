package j08_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public TreeSetTest(){}  //생성자
    public void start(){
        //TreeSet 클래스는 Set, SortedSet 인터페이스를 상속받음
        //중복허용불가, 순서유지하지 않음, 정렬된다.
        //                               ---중복--    --
        int[] num = {43,2,65,13,22,98,34,43,43,43,44,2};

        TreeSet<Integer> ts = new TreeSet<>();  //TreeSet 객체 생성.
        for(int n:num){
            ts.add(n);  //TreeSet에 num[] 추가.
        }

        //오름차순
        Iterator<Integer> asc = ts.iterator();  //줄세워서 리턴해줌.
        while(asc.hasNext()){    //데이터가 있을 때까지.
            System.out.print(asc.next()+"\t");  //TreeSet은 기본 오름차순 정렬임.
        }
        System.out.println();

        //내림차순
        Iterator<Integer> desc = ts.descendingIterator();   //내림차순 정렬해서 담기.
        while(desc.hasNext()){
            System.out.print(desc.next()+"\t"); //desc안에 객체를 꺼내서 출력.
        }
        System.out.println();
    }

    public static void main(String[] args){
        TreeSetTest tt = new TreeSetTest();
        tt.start();

        System.out.println(tt.toString());
    }
}
//TreeSet은 데이터를 꺼내면, 안에서는 사라짐.