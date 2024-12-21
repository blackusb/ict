package process;

import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);

    String adminId = null;
    String adminPw = null;
    String memberId = null;
    String memberPw = null;

    public Login(){}
    public void loginStart(){
//        String adminId = adminId();
//        String adminPw = adminPw();
//        String memberId = memberId();
//        String memberPw = memberPw();
    }

    //관리자 아이디 로그인
    public String adminId(){
        System.out.print("관리자 아이디 입력=");
        adminId = sc.nextLine();

        return adminId;
    }
    //관리자 비밀번호 로그인
    public String adminPw(){
        System.out.print("관리자 비밀번호 입력=");
        adminPw = sc.nextLine();

        return adminPw;
    }
    //회원 아이디 로그인
    public String memberId(){
        System.out.print("회원 아이디 입력=");
        memberId = sc.nextLine();

        return memberId;
    }
    //회원 비밀번호 로그인
    public String memberPw(){
        System.out.print("회원 비밀번호 입력=");
        memberPw = sc.nextLine();

        return memberPw;
    }
    public static void main(String[] args){
        Login li = new Login();
        li.loginStart();
    }
}
