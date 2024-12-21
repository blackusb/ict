package j08_collection;

import j07_exception.CalendarOOP;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {
    public VectorTestMain(){}
    public void start(){
        //배열을 이용한 데이터 가져오기
        VectorTest vt= new VectorTest();
        int data[] = vt.getArray();
        System.out.println(Arrays.toString(data));

        Vector vec = vt.getVectorData();
        //Vector에서는 최상위클래스 Object로 대입된다.
        //객체를 리턴 받으면 원래 데이터형인 하위클래스 타입으로
        //강제형변환을 해줘야한다.
        int num2 = (Integer)vec.get(0);   //add는 추가, set은 덮어쓰기   //int->Integer->Object => 꺼낼때는 강제형변환 필요.
        System.out.println("num2="+num2);

        String name2 = (String)vec.get(1);
        System.out.println("name2="+name2);

        CalendarOOP cal = (CalendarOOP)vec.get(3);
        cal.start();

        Random ran = (Random)vec.get(4);
        System.out.println("\nran->"+ran.nextBoolean());

        MemberVO m1 = (MemberVO)vec.get(2);
        System.out.println("m1->"+m1.getUsername()+", "+m1.getTel());

        MemberVO m2 = (MemberVO)vec.get(5);
        System.out.println("m2->"+m2.getUsername()+", "+m2.getTel());
    }

    public static void main(String[] args) {
        new VectorTestMain().start();
    }
}
//데이터 타입이 다 다르므로, for문 돌려서 가져올 수는 없음.