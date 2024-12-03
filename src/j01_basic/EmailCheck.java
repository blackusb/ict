package j01_basic;

import java.util.Scanner;

public class EmailCheck {
    Scanner scan = new Scanner(System.in);
    public EmailCheck(){    //생성자 메서드. 안써주면 main메서드 실행시 자동으로 생성됨.
        //이메일 유효성검사
        do{
            System.out.print("이메일입력=");
            String email = scan.nextLine();    //next()는 엔터를 못읽고, 공백을 기준으로 단어를 읽음. 가급적이면 nextLine() 사용.-> 엔터기준으로 읽음.

            int atMark = email.indexOf("@");    //@위치(처음에 있는 @), 찾는 값이 없으면 -1
            int lastAtMark = email.lastIndexOf("@");    //@위치(마지막에 있는 @)
            int dot = email.indexOf(".");
            //.의 갯수
            int dotCnt = 0;
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i) == '.') dotCnt++;
            }

            if(atMark==-1 || atMark!=lastAtMark || dotCnt<1 || dotCnt>2 || atMark>dot ||
                    Math.abs(atMark-dot)<3){   //유효하지 않은 메일 입력시
                System.out.println(email+"은 잘못된 메일주소입니다...");
            }else{  //유효한 메일 입력시
                //문자열의 일부를 얻어오기
                String id = email.substring(0, atMark);
                String domain = email.substring(atMark+1);
                System.out.println("아이디="+id);
                System.out.println("도메인="+domain);
            }
        }while(true);
    }
    public static void main(String[] args) {
        new EmailCheck();
    }
}
