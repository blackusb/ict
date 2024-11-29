package ex_test;

import java.util.Scanner;

public class Ex1125_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //금액 입력받기
        System.out.print("금액을 입력하세요=>");
        int money = sc.nextInt();


        //money를 5만원권으로 나눈 몫 : 장수, 나머지 금액으로는 다시 계산
        int m50000 = money / 50000; //50000원으로 나눈 몫
        int s50000 = money % 50000; //50000원으로 나눈 나머지
        System.out.println("50000원="+m50000+"장");

        int m10000 = s50000 / 10000;    //10000원으로 나눈 몫
        int s10000 = s50000 % 10000;    //10000원으로 나눈 나머지
        System.out.println("10000원="+m10000+"장");

        int m5000 = s10000 / 5000;    //5000원으로 나눈 몫
        int s5000 = s10000 % 5000;
        System.out.println("5000원="+m5000+"장");

        int m1000 = s5000 / 1000;    //1000원으로 나눈 몫
        int s1000 = s5000 % 1000;
        System.out.println("1000원="+m1000+"장");

        int m500 = s1000 / 500;    //500원으로 나눈 몫
        int s500 = s1000 % 500;
        System.out.println("500원="+m500+"개");

        int m100 = s500 / 100;    //100원으로 나눈 몫
        int s100 = s500 % 100;
        System.out.println("100원="+m100+"개");

        int m50 = s100 / 50;    //50원으로 나눈 몫
        int s50 = s100 % 50;
        System.out.println("50원="+m50+"개");

        int m10 = s50 / 10;    //10원으로 나눈 몫
        int s10 = s50 % 10;
        System.out.println("10원="+m10+"개");

        System.out.println("1원="+s10+"개");

    }
}
/*
    [문제2]
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