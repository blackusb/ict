package j08_collection;

import java.util.ArrayList;

public class ArrayListTest {
    public ArrayListTest(){

    }
    public ArrayList<MemberVO> getMemberAll(){    //ArrayList 대신 상위클래스인 List 사용가능.
        //Lost 인터페이스 상속, 저장순서 유지, 중복 데이터 허용
        //보관된 객체를 얻어오더라도 객체가 지워지지 않는다.
        MemberVO m1 = new MemberVO();
        m1.setUsername("홍길동");
        m1.setTel("010-1111-2222");

        MemberVO m2 = new MemberVO("이순신", "010-8888-9999");

        ArrayList<MemberVO> al = new ArrayList<MemberVO>(); //제네릭 : 담을 변수의 데이터타입을 <>안에 써준다. //담을 정보에 대한 통일.
        //List<Member> lst = new ArrayList<Member>(); //상속관계여서 에러 안남. 담기 가능.

        al.add(m1); //index 0
        al.add(m2); //index 1

        al.add(new MemberVO("안중근", "010-3333-4444"));
        al.add(new MemberVO("김삿갓", "010-5555-6666"));

        al.add(1, new MemberVO("gildong", "02-3333-5555"));   //추가
        al.set(1, new MemberVO("세종대왕", "010-9999-9999"));        //데이터를 바꿔버림. 덮어씌우기.

        //홍길동, 세종대왕, 김삿갓
        al.remove(m2);  //객체 지우기 가능.

        return al;
    }
}
