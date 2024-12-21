package j01_basic;

import java.util.Scanner;

public class J24WhileEx {
    public static void main(String[] args) {
        /*
            임의의 정수를 입력받아 그 수까지 홀수의 합과 짝수의 합을 구하는 프로그램을 작성하라.

            실행
            정수=100
            홀수의 합=2500
            짝수의 합=2550
            정수=50
            홀수의 합=625
            짝수의 합=650
            정수=
        */
        //for문 사용X
        Scanner scan = new Scanner(System.in);

        while(true){
            //정수 입력받기
            System.out.print("정수=");
            int inData = scan.nextInt();

            //계산
            int oddSum = 0, evenSum = 0;    //홀수, 짝수 합 넣을 변수
            //1,2,3,4,5 ... inData
            int i = 0;
            while(i<inData){
                //i++;
                if(++i%2==0){   //짝수일 때
                    evenSum += i;
                }else{  //홀수일 때
                    oddSum += i;
                }
            }
            //출력
            System.out.println("홀수의 합="+oddSum);
            System.out.println("짝수의 합="+evenSum);
        }
    }
}
