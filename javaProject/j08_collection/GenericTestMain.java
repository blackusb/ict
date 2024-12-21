package j08_collection;

import j07_exception.CalendarOOP;

public class GenericTestMain {
    public GenericTestMain(){}

    public static void main(String[] args){
        GenericTest gt = new GenericTest();

        //"홍길동"을 gt객체에 셋팅
        //gt.setData("홍길동");
        MemberVO v = new MemberVO(1111, "이순신", "010-1111-2222");
        //gt.setData(v);

        CalendarOOP oop = new CalendarOOP();
        gt.setData(oop);

        CalendarOOP oop2 = (CalendarOOP)gt.getData();   //Object -> CalendarOOP로 casting
        oop2.start();

        System.out.println(gt.getData());

        //==================================================
        GenericTest<MemberVO> gt2 = new GenericTest<>();    //<>안에 있는 MemberVO를 E가 들어감. 자동으로.
        gt2.setData(v);
        //gt2.setData(oop); //MemberVO객체가 아니므로 셋팅 불가.

        GenericTest<CalendarOOP> gt3 = new GenericTest<>();
        gt3.setData(oop);
        //gt3.setData(a);   //CalendarOOP객체가 아니므로 셋팅 불가.
        CalendarOOP oop3 = gt3.getData();
        oop3.start();
    }
}
