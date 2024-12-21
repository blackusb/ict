package j08_collection;

import j07_exception.CalendarOOP;
import java.util.Random;
import java.util.Vector;

public class VectorTest {
    public VectorTest(){}
    public int[] getArray(){
        int num[] = {5,6,7,8,9};
        String name = "홍길동";

        return num;
    }
    public Vector getVectorData(){  //데이터형이 Vector
        //Vector컬랙션 : List인터페이스 상속받아서 오버라이딩 한 클래스.
        //              저장 순서 유지. 중복객체 허용.
        int num = 120;
        String name = "세종대왕";
        CalendarOOP calendar = new CalendarOOP();
        Random random = new Random();
        MemberVO member1 = new MemberVO();
        MemberVO member2 = new MemberVO("이순신", "010-1234-5678");

        Vector v = new Vector();    //벡터 객체를 만든다.
        v.add(num);    //마지막에 객체 추가. 객체가 아니어도 들어감(ex: int 등). 오토박싱. index 0에 들어감
        v.add(name);    //index 1에 들어감
        v.add(calendar);    //index 2에 들어감 -> index 3
        v.add(random);      //index 3에 들어감 -> index 4
        v.add(2, member1);    //index 2번째에 member1을 추가. -> index 2
        v.add(member2); //index 5

        return v;
    }
}
