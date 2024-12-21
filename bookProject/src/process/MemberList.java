package process;

import data.MemeberDataSet;
import vo.MemberVO;

import java.util.Scanner;

public class MemberList {
    Scanner sc = new Scanner(System.in);

    public MemberList(){
        MemeberDataSet.setMember();
    }
    public void memberStart(){
        do{
            memberMenu();
        }while(true);
    }

    //메뉴 선택
    public void memberMenu(){
        //메뉴 : 1.회원목록 2.회원등록 3.회원수정 4.회원삭제 5.종료
        System.out.print("메뉴 [1.회원목록 2.회원등록 3.회원수정 4.회원삭제 5.종료]=");
        String menu = sc.nextLine();

        switch(menu){
            case "1": memberPrint();break;
            case "2": memberInsert();break;
            case "3": memberEdit();break;
            case "4": memberDelete();break;
            case "5":
                System.out.println("프로그램 정상 종료.");
                System.exit(0);
                break;
            default:
                System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택하세요.");
        }
    }
    //회원목록
    public void memberPrint(){
        System.out.println("번호\t이름\t\t아이디\t비밀번호\t연락처\t\t\t이메일");
        for(MemberVO mvo : MemeberDataSet.memberList){
            System.out.println(mvo.toString());
        }
    }
    //회원등록
    public void memberInsert(){
        //회원번호, 이름, 아이디, 비밀번호, 연락처, 이메일 입력받아서 MemberVO객체에 담기
        MemberVO mvo = new MemberVO();

        System.out.print("회원번호 입력=");
        int num = Integer.parseInt(sc.nextLine());
        //System.out.println("num="+num);
        mvo.setNum(num);

        System.out.print("이름 입력=");
        String name = sc.nextLine();
        //System.out.println("name="+name);
        mvo.setName(name);

        System.out.print("아이디 입력=");
        String userId = sc.nextLine();
        //System.out.println("userId="+userId);
        mvo.setMemberId(userId);

        System.out.print("비밀번호 입력=");
        String userPw = sc.nextLine();
        //System.out.println("userPw="+userPw);
        mvo.setMemberPw(userPw);

        System.out.print("연락처 입력=");
        String phone = sc.nextLine();
        //System.out.println("phone="+phone);
        mvo.setPhone(phone);

        System.out.print("이메일 입력=");
        String email = sc.nextLine();
        //System.out.println("email="+email);
        mvo.setEmail(email);

        //set으로 담은 데이터를 MemberDataSet클래스의 memberList객체에 추가
        MemeberDataSet.memberList.add(mvo);
        System.out.println(mvo.getName()+"님 회원 등록 완료");
    }
    //회원수정(비밀번호, 연락처,이메일 수정)
    public void memberEdit(){
        //수정할 회원의 이름 입력
        System.out.print("수정할 회원의 이름 입력=");
        String name = sc.nextLine();

        //연락처, 이메일 중 수정할 항목 선택
        System.out.print("수정할 항목 선택(1.비밀번호 2.연락처 3.이메일)=");
        String field = sc.nextLine();

        //수정할 데이터 입력받기
        String editData = null; //수정할 데이터 받을 변수 준비
        if(field.equals("1")){
            System.out.print("수정할 비밀번호 입력=");
            editData = sc.nextLine();
        }else if(field.equals("2")){
            System.out.print("수정할 연락처 입력=");
            editData = sc.nextLine();
        }else{
            System.out.print("수정할 이메일 입력=");
            editData = sc.nextLine();
        }

        for(int i = 0; i<MemeberDataSet.memberList.size(); i++){  //수정할 대상인지 한명씩 확인
            MemberVO mvo = MemeberDataSet.memberList.get(i);
            if(mvo.getName().equals(name)){  //수정을 위해 입력한 이름과 같은지 확인.
                switch(field){
                    case "1":   //비밀번호 수정
                        mvo.setMemberPw(editData);
                    case "2":   //연락처 수정
                        mvo.setPhone(editData);
                        break;
                    case "3":   //이메일 수정
                        mvo.setEmail(editData);
                }
                break;  //for문에 대한 break.
            }
        }
        System.out.println(name+"님 수정 완료");
    }
    //회원삭제
    public void memberDelete(){
        //삭제할 회원이름 입력받아서 해당 mvo 객체 삭제.
        System.out.print("삭제할 회원이름 입력=");
        String delMember = sc.nextLine();

        for(int i = 0; i< MemeberDataSet.memberList.size(); i++){  //입력받은 회원 이름과 하나씩 대조.
            if(MemeberDataSet.memberList.get(i).getName().equals(delMember)){
                MemeberDataSet.memberList.remove(i);
                System.out.println(delMember +" 회원 삭제완료");
                break;  //ArrayList는 중간에 데이터가 삭제되면 뒤에서 앞으로 땡겨지므로, break 해줘야함.
            }
        }
    }
    //종료

    public static void main(String[] args) {
        MemberList ml = new MemberList();
        ml.memberStart();
    }
}
