package ex_test;

import java.util.Scanner;

public class Ex1126_2 {
    public static void main(String[] args){
        //j01_basic => MoneyCount2
        //금액 입력받아 화폐의 갯수 구하기. for문 이용
        Scanner sc = new Scanner(System.in);

        //금액 입력받기
        System.out.print("금액 입력=>");
        int money = sc.nextInt();

        //50000 10000 5000 1000 500 100 50 10 5 1
        //화폐단위의 규칙 확인. 지폐랑 동전 조건 나눠서 출력하기
        int danwi = 50000; //화폐단위
        int cnt = money / danwi; //금액/화폐단위=>화폐갯수 나옴


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