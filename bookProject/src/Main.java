import data.MemeberDataSet;
import process.BookList;
import process.Login;
import process.MemberList;
import vo.MemberVO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main(){}
    public void mainStart(){
        Scanner sc = new Scanner(System.in);

        Login li = new Login();
        do{
            do{
                System.out.print("로그인 선택 [1.도서목록조회 2.회원정보확인 3.관리자]=");    //처음 로그인시 회원, 관리자 중 선택
                String selectUser = sc.nextLine();
                if(selectUser.equals("1")){
                    BookList bl = new BookList();
                    bl.bookPrint();
                    break;
                }else if(selectUser.equals("2")){
                    System.out.println("회원을 선택하였습니다.");

                    //회원 아이디, 비밀번호 로그인.
                    //로그인 성공시 -> 다른 항목 조회 가능, 로그인 실패시 -> 다시 로그인 시도.
                    String memberId = li.memberId();
                    MemeberDataSet.setMember();
                    for(int i=0; i<MemeberDataSet.memberList.size(); i++){
                        MemberVO mvo = MemeberDataSet.memberList.get(i);
                        if(mvo.getMemberId().equals(memberId)){ //회원 아이디 일치여부 확인
                            do{
                                String memberPw = li.memberPw();
                                //System.out.println("가져온 비번="+MemeberDataSet.memberList.get(i).getMemberPw());
                                //System.out.println("입력한 비번="+memberPw);
                                if(MemeberDataSet.memberList.get(i).getMemberPw().equals(memberPw)){   //회원 비밀번호 일치여부 확인
                                    System.out.println("회원 비밀번호 일치. 로그인 성공");
                                    break;
                                }else{
                                    System.out.println("회원 비밀번호 불일치.");
                                }
                            }while(true);

                            //회원 로그인 성공시 나올 부분.
                            System.out.print("메뉴 [1.회원정보 2.도서조회 3.종료]=");
                            String selectMenu = sc.nextLine();
                            switch(selectMenu){
                                case "1":
                                    MemberList ml = new MemberList();
                                    ml.memberStart();
                                    break;
                                case "2":
                                    BookList bl = new BookList();
                                    bl.bookStart();
                                    break;
                                case "3":
                                    System.out.println("프로그램 정상 종료");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택하세요.");
                            }
                            System.out.println("끝");

                            break;
                        }else{
                            System.out.println("로그인 실패");
                            break;
                        }
                    }

                }else if(selectUser.equals("3")){
                    System.out.println("관리자를 선택하였습니다.");

                    //관리자 아이디, 비밀번호로 로그인.
                    //로그인 성공시 -> 다른 항목 조회 가능, 로그인 실패시 -> 다시 로그인 시도.
                    String adminId = li.adminId();  //관리자 아이디 입력받는 메소드
                    if(adminId.equals("admin")){    //관리자 아이디 일치여부 확인
                        System.out.println("관리자 아이디 일치.");
                        do{
                            String adminPw = li.adminPw();  //관리자 비밀번호 입력받는 메소드
                            if(adminPw.equals("1234")){     //관리지 비밀번호 일치여부 확인
                                System.out.println("관리자 비밀번호 일치. 관리자 로그인 성공");

                                //관리자로 로그인 성공시 나올 부분.
                                System.out.print("메뉴 [1.회원관리 2.도서관리 3.종료]=");
                                String selectMenu = sc.nextLine();

                                switch(selectMenu){
                                    case "1":
                                        MemberList ml = new MemberList();
                                        ml.memberStart();
                                        break;
                                    case "2":
                                        BookList bl = new BookList();
                                        bl.bookStart();
                                        break;
                                    case "3":
                                        System.out.println("프로그램 정상 종료");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택하세요.");
                                }
                                System.out.println("끝");
                            }else{
                                System.out.println("관리자 비밀번호가 일치하지 않습니다.");
                            }
                        }while(true);
                    }else{
                        System.out.println("관리자 아이디가 일치하지 않습니다.");
                    }

                }else{
                    System.out.println("로그인 선택을 잘못하였습니다. 다시 선택해 주세요.");
                }
            }while(true);
        }while(true);
    }
    public static void main(String[] args) {
        Main mi = new Main();
        mi.mainStart();
    }
}