package data;

import vo.MemberVO;

import java.util.ArrayList; //ArrayList는 데이터가 늘어나면 자리도 자동으로 늘어남. 중간에 데이터 삭제되면 뒤에서 앞으로 땡겨짐.
import java.util.List;

public class DataSet {
    //한 명의 회원정보는 MemberVO에 셋팅
    //MemberVO 객체는 List에 담는다. memberList에 회원정보가 담겨져있다.
    public static List<MemberVO> memberList = new ArrayList<>();    //static은 객체 안만들고 사용 가능. static 붙은 것은 오로지 한개. ex)static이 붙은 변수가 있을 때, 객체를 여러개 만들어도 그 안에 있는 static 붙은 변수는 같은 변수이다.

    //회원정보 초기데이터 셋팅하기
    public static void setMember(){ //static이 붙어있어서 객체 안만들고 호출 가능.
        memberList.add(new MemberVO(100, "손흥민","010-1111-2222","son@naver.com"));
        memberList.add(new MemberVO(200, "김민재","010-3333-4444","kim@naver.com"));
        memberList.add(new MemberVO(300, "이강인","010-5555-6666","kang@naver.com"));
        memberList.add(new MemberVO(400, "황희찬","010-7777-8888","hwang@naver.com"));
    }
}