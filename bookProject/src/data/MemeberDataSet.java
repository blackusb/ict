package data;

import vo.MemberVO;

import java.util.ArrayList;
import java.util.List;

public class MemeberDataSet {
    //한명의 회원정보를 MemberVO에 셋팅
    //MemberVO 객체는 List에 담는다. memberList에 회원정보가 담겨져있다.
    public static List<MemberVO> memberList = new ArrayList<>();

    //회원정보 초기데이터 셋팅.
    public static void setMember(){
        memberList.add(new MemberVO(1, "김뚝섬", "kimm","1111", "010-1111-1111", "kim@naver.com"));
        memberList.add(new MemberVO(2, "박자바", "park", "2222", "010-2222-2222", "park@naver.com"));
        memberList.add(new MemberVO(3, "최코딩", "choi", "3333", "010-3333-3333", "choi@naver.com"));
        memberList.add(new MemberVO(4, "이성수", "leee", "4444", "010-4444-4444", "sungsu@naver.com"));
    }
}
