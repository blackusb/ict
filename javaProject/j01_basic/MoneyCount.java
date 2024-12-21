package j01_basic;

import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //금액을 입력받아 화폐의 갯수를 구하라
        System.out.print("금액을 입력하세요?=");
        int money = scan.nextInt();

        //50000, 10000, 5000, 1000, 500, 100, 50, 10
        //화폐단위가 큰 순서로 갯수를 계산
        int cnt = money / 50000;
        //50000
        if(cnt>0){
            System.out.println("50000원="+cnt+"장");
            //50000원 화폐수에 해당하는 금액을 뺀다.
            money = money - cnt * 50000;
        }
        //10000
        cnt = money / 10000;
        if(cnt>0){
            System.out.println("10000원="+cnt+"장");
            money = money - cnt * 10000;
        }
        //5000
        cnt = money / 5000;
        if(cnt>0){
            System.out.println("5000원="+cnt+"장");
            money = money - cnt * 5000;
        }
        //1000
        cnt =  money / 1000;
        if(cnt>0){
            System.out.println("1000원="+cnt+"장");
            money = money - cnt * 1000;
        }
        //500
        cnt = money / 500;
        if(cnt>0){
            System.out.println("500원="+cnt+"개");
            money = money - cnt * 500;
        }
        //100
        cnt = money / 100;
        if(cnt>0){
            System.out.println("100원="+cnt+"개");
            money = money - cnt * 100;
        }
        //50
        cnt = money / 50;
        if(cnt>0){
            System.out.println("50원="+cnt+"개");
            money = money - cnt * 50;
        }
        //10
        cnt = money / 10;
        if(cnt>0){
            System.out.println("10원="+cnt+"개");
            money = money - cnt * 10;
        }
        //5
        cnt = money / 5;
        if(cnt>0){
            System.out.println("5원="+cnt+"개");
            money = money - cnt * 5;
        }
        //1
        System.out.println("1원="+money+"개");

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