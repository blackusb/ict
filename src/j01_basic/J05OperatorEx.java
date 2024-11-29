package j01_basic;

import java.util.Scanner;

public class J05OperatorEx {
    public static void main(String[] args){
        //사과의 개수와 바구니 크기를 입력받아 필요한 바구니의 개수를 구하는 프로그램을 작성하라
        //삼항연산자 사용

        Scanner sc = new Scanner(System.in);

        //1. 사과 개수 입력받기
        System.out.print("사과 개수를 입력하세요=>");
        int apple = sc.nextInt();

        //2. 바구니 크기 입력받기
        System.out.print("바구니 크기를 입력하세요=>");
        int basket = sc.nextInt();

        //3. 계산
        //   바구니 크기의 배수만큼 사과가 있으면 사과갯수/바구니크기
        //   바구니 크기의 배수가 아니면 사과갯수/바구니크기+1
        int result = (apple%basket > 0)?apple/basket+1:apple/basket;

        //4. 출력
        System.out.println("바구니 수="+result);


    }
}
