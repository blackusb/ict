package ex_test;

import java.util.Scanner;

public class Ex1202_2 {
    public static void main(String[] args) {
        //이메일 유효성 검사 후 아이디와 도메인 출력하기
        Scanner sc = new Scanner(System.in);

        do{
            //이메일 입력받기
            System.out.print("이메일 입력=");
            String email = sc.next();

            //입력한 이메일과 이메일 양식 비교
            if(email.matches(".*@.*")){ //???????? @뒤에 .도 있는지 확인해야함
                //@의 인덱스값 구하기
                int ind = email.indexOf("@");
                //System.out.println(ind);  //@ 인덱스값 출력

                //@기준으로 아이디와 도메인 구해서 변수에 담기
                String id = email.substring(0,ind); //@ 앞까지 변수에 담기
                String domain = email.substring(ind+1);

                //출력
                System.out.println("아이디="+id);
                System.out.println("도메인="+domain);
            }else{
                System.out.println(email+"는 잘못입력된 메일입니다....");
            }
        }while(true);
    }
}
