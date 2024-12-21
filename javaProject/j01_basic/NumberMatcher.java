package j01_basic;

import java.util.Random;
import java.util.Scanner;

public class NumberMatcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();   //컨트롤+스페이스하면 임폴트 됨

        //1~100사이의 난수를 생성해 맞추는 게임
        System.out.println("==== 숫자 맞추기 게임 ====");

        //1. 난수 생성
        int ranInt = random.nextInt(100)+1;
        int cnt = 0;    //게임 횟수 저장할 변수

        //2. 난수=입력값이 같을 때까지 비교
        //반복횟수가 정해져있지 않은 경우는 while이 적당함.
        do{
            //사용자에게 값 입력 받기
            System.out.print("1~100사이의 정수 입력=");
            int inData = scan.nextInt();
            cnt++;  //입력횟수 증가
            if(ranInt==inData){
                System.out.println("맞추었습니다....난수="+ranInt);
                break;  //맞춘경우 반복문 중단
            }else if(ranInt>inData){
                System.out.println("더 큰 값을 입력하세요....");
            }else{
                System.out.println("더 작은 값을 입력하세요....");
            }
        }while(true);

        //3. 출력
        System.out.println(cnt+"번만에 맞추었습니다.");
    }
}
/*
    1~100사이의 난수를 만들어 맞추는 게임을 작성하라

    실행
    숫자 맞추기 게임
    1~100사이의 정수를 입력하세요.?=50
    더 큰 값을 입력하세요.....
    1~100사이의 정수를 입력하세요.?=80
    더 작은 값을 입력하세요.....
    1~100사이의 정수를 입력하세요.?=70
    더 작은 값을 입력하세요.....
    1~100사이의 정수를 입력하세요.?=60
    더 큰 값을 입력하세요.....
    1~100사이의 정수를 입력하세요.?=65
    맞추었습니다...난수=65
    5번만에 맞추었습니다...
*/