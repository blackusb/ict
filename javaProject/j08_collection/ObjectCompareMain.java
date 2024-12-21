package j08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain {
    public ObjectCompareMain(){}

    public void start(){
        //회원이 MemberVO에 셋팅됨. 번호순, 이름순으로 정렬.
        //데이터 준비
        List<MemberVO> lst = new ArrayList<MemberVO>(); //List가 ArrayList의 상위클래스여서 이렇게 쓰기 가능.
        lst.add(new MemberVO(333, "홍길동", "010-4444-5555"));
        lst.add(new MemberVO(222, "이순신", "010-6666-7777"));
        lst.add(new MemberVO(444, "강감찬", "010-1111-2222"));
        lst.add(new MemberVO(111, "안중근", "010-8888-9999"));
        lst.add(new MemberVO(555, "세종대왕", "010-0000-1111"));

        //숫자 정렬, 문자열 정렬
        System.out.println("=========정렬 전=========");
        for(MemberVO vo:lst){  //for(데이터 타입과 변수:객체){}   //ArrayList는 배열처럼 만들어져있음. 꺼내도 안지워짐.
            System.out.println(vo.toString());
        }

        //번호 : 숫자 정렬(오름차순)
        //              정렬대상이 되는 컬렉션
        Collections.sort(lst, new CompareNumAsc());
        System.out.println("===번호를 오름차순으로 정렬===");
        for(MemberVO vo : lst){
            System.out.println(vo.toString());
        }
        //번호 : 숫자 정렬(내림차순)
        Collections.sort(lst, new CompareNumDesc());
        System.out.println("===번호를 내림차순으로 정렬===");
        for(MemberVO vo : lst){
            System.out.println(vo.toString());
        }

        //이름 : 문자 정렬(오름차순)
        Collections.sort(lst, new CompareUsernameAsc());
        System.out.println("===이름을 오름차순으로 정렬===");
        for(MemberVO vo : lst){
            System.out.println(vo.toString());
        }
        //이름 : 문자 정렬(내림차순)
        Collections.sort(lst, new CompareUsernameDesc());
        System.out.println("===이름을 내림차순으로 정렬===");
        for(MemberVO vo : lst){
            System.out.println(vo.toString());
        }
    }

    //sort(List<T> list, Comparator<? super T> c)
    //MemberVO객체내에 있는 num의 값을 이용하여 오름차순으로 정렬하는 내부클래스 만든다.
    //Comparator인터페이스를 상속받아 compare()메소드를 오버라이딩.
    //숫자 오름차순
    class CompareNumAsc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다.
        @Override
        public int compare(MemberVO o1, MemberVO o2){   //숫자 비교해서 정렬해서 담음. 언제 바꿀지만 셋팅해줌. 오름차순 기준.
            //return값이 양수일 때 왼쪽값이 더 크므로 교환o.
            //return값이 0일때 같다.
            //return값이 음수일 때는 왼쪽값이 작으므로 교환x.
            return (o1.getNum() > o2.getNum())? 1 : (o1.getNum()==o2.getNum())? 0 : -1;
        }
    }
    //숫자 내림차순
    class CompareNumDesc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다.
        @Override
        public int compare(MemberVO o1, MemberVO o2){   //숫자 비교해서 정렬해서 담음. 언제 바꿀지만 셋팅해줌. 오름차순 기준.
            //return값이 양수일 때 왼쪽값이 더 크므로 교환x.
            //return값이 0일때 같다.
            //return값이 음수일 때는 왼쪽값이 작으므로 교환o.
            return (o1.getNum() > o2.getNum())? -1 : (o1.getNum()==o2.getNum())? 0 : 1;
        }
    }

    //이름 오름차순
    class CompareUsernameAsc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다.
        @Override
        public int compare(MemberVO o1, MemberVO o2){
            //return값이 양수일 때 왼쪽값이 더 크므로 교환0.
            //return값이 0일때 같다.
            //return값이 음수일 때는 왼쪽값이 작으므로 교환x.
            //       o1            o2
            //      "A".compareTo("B") -> 아스키코드. 65-66=-1
            //      "B".compareTo("A") -> 66-65=+1 -> 이렇게 나오면 교환o. 알아서 바꿔줌.
            //      "A".compareTo("A") -> 65-65=0
            return o1.getUsername().compareTo(o2.getUsername());
        }
    }
    //이름 내림차순
    class CompareUsernameDesc implements Comparator<MemberVO>{
        //리턴값에 따라 값을 교환한다.
        @Override
        public int compare(MemberVO o1, MemberVO o2){
            //return값이 양수일 때 왼쪽값이 더 크므로 교환x.
            //return값이 0일때 같다.
            //return값이 음수일 때는 왼쪽값이 작으므로 교환o.
            return o2.getUsername().compareTo(o1.getUsername());
        }
    }

    public static void main(String[] args) {
        new ObjectCompareMain().start();
    }
}
//객체안의 데이터를 정렬하는 것은 클래스를 만들어서 해줘야함.
//교환 기능은 있는데, 기준에 맞게 고쳐줘야함.