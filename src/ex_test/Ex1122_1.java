package ex_test;

import java.util.Scanner;

public class Ex1122_1 {
    public static void main(String[] args){
        /*
            백의 자리 이하를 버리는 프로그램을 작성하라

            실행
            정수=456
            결과=400
        */

        //int num = 456;

        //숫자 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 숫자를 입력해 주세요=>");
        int num = sc.nextInt();


        //계산
        //num에서 num을 100으로 나눈 나머지를 뺀다
        int result = num - num%100;

        //출력
        System.out.println(result);
    }
}
