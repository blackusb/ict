package ex_test;

import java.util.Random;
import java.util.Scanner;

public class Ex1129_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
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

        //1~100사이의 난수를 생성해서 변수에 담아놓는다
        int nansu = random.nextInt(100)+1;   //(큰수-작은수+1)+작은수

        //사용자에게 데이터를 입력받는다
        System.out.println("숫자 맞추기 게임");
        System.out.print("1~100사이의 정수를 입력하세요.?=");
        int inData = sc.nextInt();

        //생성한 난수와 사용자가 입력한 데이터 비교하기
        //일치하면 게임종료하고 몇번만에 맞췄는지 알려주기, 일치하지 않으면 힌트 알려주기
        int sum = 1; //사용자가 입력한 횟수 합계

        while(nansu!=inData){
            if(nansu>inData){
                System.out.println("더 큰 값을 입력하세요.....");
                System.out.print("1~100사이의 정수를 입력하세요.?=");
                inData = sc.nextInt();
            }else if(nansu<inData){
                System.out.println("더 작은 값을 입력하세요.....");
                System.out.print("1~100사이의 정수를 입력하세요.?=");
                inData = sc.nextInt();
            }
            sum++;
        }
        System.out.println("맞추었습니다...난수="+nansu);
        System.out.println(sum+"번만에 맞추었습니다...");
    }
}
