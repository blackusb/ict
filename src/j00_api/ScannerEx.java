package j00_api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        /*
            콘솔에서 임의의 정수를 입력받아 홀수, 작수를 구별하여 출력하라.

            실행
            정수=5
            5는(은) 홀수입니다.

            정수=8
            8는(은) 짝수입니다.

         */

        Scanner sc = new Scanner(System.in);    //import 할 때 : 컨트롤+스페이스

        //데이터 입력
        System.out.print("정수를 입력하세요=>");
        int num = sc.nextInt();
        //계산(if문 말고 삼항연산 사용함)
        //String result = (num%2==0)?"짝수":"홀수";
        String result = (num/2 == num/2.0)?"짝수":"홀수";
        //출력
        //System.out.println(num+"는(은) "+result+"입니다.");
        System.out.printf("%d는(은) %s입니다.",num,result);


    }
}
