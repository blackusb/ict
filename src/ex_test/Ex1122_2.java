package ex_test;

import java.util.Scanner;

public class Ex1122_2 {
    public static void main(String[] args){
        /*
            일의 자리의 값을 1로 바꾸는 프로그램을 작성하라

            실행
            정수=235
            결과=231
        */

        //int num = 235;

        //숫자 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("두자릿수 이상의 숫자를 입력하세요=>");
        int num = sc.nextInt();


        //계산
        //정수에서 정수를 10으로 나눈 나머지를 빼고, +1 해줌
        int result = num - num%10 + 1;

        //출력
        System.out.println(result);
    }
}
