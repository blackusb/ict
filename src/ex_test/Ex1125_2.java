package ex_test;

import java.util.Scanner;

public class Ex1125_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //년도 입력받기
        System.out.print("년도를 입력하세요=>");
        int year = sc.nextInt();

        //윤년 계산 및 출력
        if(year%4==0 && !(year%100==0)){
            System.out.println("윤년");
        }else if(year%400==0){
            System.out.println("윤년");
        }else{
            System.out.println("평년");
        }
    }
}
/*
    [문제1]
    년도를 입력받아 윤년구하기

    윤년기준 : 1. 4의 배수의 해이면서 100의 배수가 아닌 해
              2. 400의 배수인 해

    실행
    년도 = 2024
    윤년년
*/