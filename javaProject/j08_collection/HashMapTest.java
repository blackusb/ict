package j08_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
    public HashMapTest(){}
    public void start(){
        //HashMap은 Map 인터페이스를 상속받고 있다.
        //Map은 key와 value를 가진다.
        //key는 중복될 수 없다.
        HashMap<String, MemberVO> hm = new HashMap<String, MemberVO>(); //<>안의 내용은 생략가능.

        hm.put("길동", new MemberVO(111, "홍길동", "010-4444-5555"));
        hm.put("순신", new MemberVO(222, "이순신", "010-6666-7777"));
        hm.put("감찬", new MemberVO(333, "강감찬", "010-1111-2222"));
        hm.put("중근", new MemberVO(444, "안중근", "010-8888-9999"));
        hm.put("대왕", new MemberVO(555, "세종대왕", "010-0000-1111"));

        //key값을 이용하여 value 얻어오기
        MemberVO vo = hm.get("감찬");
        System.out.println(vo.toString());  //vo만 출력해도 value값이 나오는데, MemberVO에서 오버라이딩이 되어있어서 자동실행됨. 오버라이딩 안되어있을때 vo 출력하면, 객체 주소값 나옴.

        //모든 key값을 얻어오기
        Set<String> keyList= hm.keySet();   //길동, 순신, 감찬, 중근, 대왕이 들어있음. 데이터타입은 Set임.

        //위에서 데이터타입이 Set -> api에서 Set 들어가서 데이터 뽑아내는 메소드 찾음.
        Iterator<String> ii= keyList.iterator();
        while(ii.hasNext())
            System.out.print(ii.next()+"\t");

        System.out.println();

        //모든 value 얻어오기
        Collection<MemberVO> list= hm.values(); //value값이 MemberVO 타입이어서 <>안에 넣어줌.
        Iterator<MemberVO> iii = list.iterator();   //api Collection가서 데이터 꺼내는 메소드 찾아서 적음.
        while(iii.hasNext()){
            MemberVO vo2 = iii.next();
            System.out.println(vo2.toString());
        }
    }

    public static void main(String[] args){
        new HashMapTest().start();
    }
}
