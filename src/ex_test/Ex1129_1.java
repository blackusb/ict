package ex_test;

import java.util.Scanner;

public class Ex1129_1 {
    public static void main(String[] args) {
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
        Scanner sc = new Scanner(System.in);

        //난수를 생성해서 변수에 담아놓는다
        //사용자에게 데이터를 입력받는다
        //생성한 난수와 사용자가 입력한 데이터 비교 -> 일치하면 게임종료하고 몇번만에 맞췄는지 알려주기, 일치하지 않으면 힌트 알려주기
        System.out.println("숫자 맞추기 게임");
        System.out.print("1~100사이의 정수를 입력하세요.?=");
        int num = sc.nextInt();






    }
}
