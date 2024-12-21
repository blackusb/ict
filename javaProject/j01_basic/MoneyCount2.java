package j01_basic;

import java.util.Scanner;

public class MoneyCount2 {
    public static void main(String[] args){
        //금액 입력받아 화폐의 갯수 구하기. for문 이용
        Scanner scan = new Scanner(System.in);

        System.out.print("금액=");
        int cash = scan.nextInt();

        int danwi = 50000;  //화폐단위
        int value = 5;  //다음 화폐단위 계산할 값
        for(;cash>0;){
            int cnt = cash / danwi; //화폐 수
            if(cnt>0){  //cnt가 0이면 출력을 안해야됨
                //System.out.print(danwi+"원="+cnt);
                //if, switch, 삼항연산자
                /*
                //if문 사용
                if(danwi>=1000) System.out.println("장");
                else System.out.println("개");
                 */
                //삼항연산자 사용
                //String str = (danwi>=1000)?"장":"개";
                //System.out.println(str);

                //한줄에 출력
                System.out.println(danwi+"원="+cnt+((danwi>=1000)?"장":"개"));
            }
            //이미 계산한 단위의 금액만큼 빼기
            cash -= danwi * cnt;
            //다음 화폐단위 계산
            danwi = danwi / value; //1000
            value = (value==5)?2:5; //토글:두개값 왔다갔다.
        }
    }
}
/*
    [문제]
    화폐단위: 50000, 10000, 5000, 1000, 500, 100, 50, 10

    금액을 입력받아 화폐의 수를 출력하라

    실행
    금액을 입력하세요 => 254832
    50000원=5장
    1000원=4장
    500원=1개
    100원=3개
    10원=3개
    1원=2개
*/