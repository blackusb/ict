package process;

import data.DataSet;    //패키지가 다르면 import를 해줘야함.
import vo.MemberVO;

import java.util.Scanner;

public class MemberStart {
    Scanner scan = new Scanner(System.in);
    public MemberStart(){
        //기본데이터 셋팅
        DataSet.setMember();    //setMember()는 static이 붙어있어서 객체 생성 안해도됨.
    }
    public void start(){
        do{
            //메뉴 : 1.회원목록, 2.회원등록, 3.회원수정, 4.회원삭제, 5.종료
            System.out.print("메뉴 [1.회원목록, 2.회원등록, 3.회원수정, 4.회원삭제, 5.종료]?");
            String menu = scan.nextLine();
            switch(menu){
                case "1": memberPrint();break;
                case "2": memberInsert();break;
                case "3": memberEdit();break;   //번호, 이름 수정 불가/ 연락처, 이메일 수정 가능
                case "4": memberDelete();break; //이름 기준으로 삭제.
                case "5":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);   //0 넣으면 정상종료.
            }
        }while(true);
    }
    //회원목록
    public void memberPrint(){
        //System.out.println("실행");
        System.out.println("번호\t이름\t\t연락처\t\t\t이메일");
        for(MemberVO vo:DataSet.memberList){
            //System.out.println(vo.getNum()+"\t"+vo.getName()+"\t"+vo.getTel()+"\t"+vo.getEmail());
            System.out.println(vo.toString());
        }
    }
    //회원등록
    public void memberInsert(){
        //번호, 이름, 연락처, 이메일 입력 받아서 MemberVO객체에 담기.
        MemberVO vo = new MemberVO();
        System.out.print("번호입력=");
        //int num = Integer.parseInt(scan.nextLine());    //Integer.parseInt -> 문자에서 정수로 변환하는 메소드.
        vo.setNum(Integer.parseInt(scan.nextLine()));
        System.out.print("이름입력=");
        //String name = scan.nextLine();
        vo.setName(scan.nextLine());
        System.out.print("연락처입력=");
        //String tel = scan.nextLine();
        vo.setTel(scan.nextLine());
        System.out.print("이메일입력=");
        //String email = scan.nextLine();
        vo.setEmail(scan.nextLine());

        //DataSet 클래스의 memberList객체에 추가.
        DataSet.memberList.add(vo);
        System.out.println(vo.getName()+"회원이 등록되었습니다.");
    }
    //회원정보 수정하기
    //연락처, 이메일 각각 수정하기
    public void memberEdit(){
        //수정할 회원이름
        System.out.print("수정할 회원이름 입력=");
        String name = scan.nextLine();

        //연락처, 이메일 중 수정할 항목 선택.
        System.out.print("수정할 필드(1.연락처, 2.이메일)를 선택=");
        String field = scan.nextLine();

        //수정할 데이터 입력받기.
        if(field.equals("1")) System.out.print("수정할 연락처를 입력=");
        else System.out.print("수정할 이메일을 입력=");
        String editData = scan.nextLine();

        for(int i=0; i<DataSet.memberList.size(); i++){ //한명씩 수정할 대상인지 확인.
            MemberVO vo = DataSet.memberList.get(i);
            if(vo.getName().equals(name)){  //수정할 회원과 같은지 확인.
                switch(field){
                    case "1": //연락처 수정
                        vo.setTel(editData);    //editData는 연락처수정,이메일수정 동시에 담지 않음.
                        break;  //switch에 대한 break;
                    case "2": //이메일 수정
                        vo.setEmail(editData);
                }
                break;  //for에 대한 break.
            }
        }
    }
    //회원정보 삭제
    public void memberDelete(){
        //삭제할 회원명을 입력받아 해당 vo를 지운다.
        System.out.print("삭제할 회원이름 입력=");
        String delName = scan.nextLine();

        for(int i=0; i<DataSet.memberList.size(); i++){
            if(DataSet.memberList.get(i).getName().equals(delName)){ //입력받은 이름과 같으면
                DataSet.memberList.remove(i);
                System.out.println(delName+" 회원을 삭제하였습니다.");
                break;  //ArrayList는 중간에 데이터가 삭제되면 뒤에서 앞으로 땡겨지므로, break 해줘야함.
            }
        }

    }
}