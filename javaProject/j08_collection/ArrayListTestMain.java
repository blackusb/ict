package j08_collection;

import java.util.ArrayList;

public class ArrayListTestMain {
    public ArrayListTestMain(){}
    public void start(){
        ArrayListTest at = new ArrayListTest();
        ArrayList<MemberVO> list= at.getMemberAll();

        list.remove(2); //index 2 데이터 삭제되고, 뒤의 데이터는 땡겨옴.

        for(int i=0; i<list.size(); i++){   //.size() 갯수세기. 배열이 아니므로 .length 사용불가.
            MemberVO m = list.get(i); //꺼내면 Object가 아닌 Member가 나옴
            System.out.println(m.getUsername()+"\t"+m.getTel());
        }
        System.out.println("=============향상된 for문============");
        for(MemberVO m : list){
            System.out.println(m.getUsername()+"\t"+m.getTel());
        }
    }

    public static void main(String[] args) {
        new ArrayListTestMain().start();
    }
}
