package j01_basic;

import java.util.Scanner;

public class J04OperatorEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //급여를 입력받아 급여가 100불미만이면 보너스를 급여의 20%지급하고,
        //100불 이상이면 보너스를 급여의 10%로 지급하는 프로그램을 작성하라.
        //삼항연산자 사용

        //1. 급여 입력
        System.out.print("급여 입력=>");
        int salary = sc.nextInt();
        //2. 보너스 계산
        double result = (salary>=100)?salary*0.1:salary*0.2;    //int로 하면 에러남. double을 int에 못넣음
        //3. 보너스 출력
        System.out.println("보너스=>"+result);
    }
}
