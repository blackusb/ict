package j01_basic;

import java.util.Scanner;

public class J07IfEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //콘솔에서 두 수를 입력받아 두 수가 모두 양수이면 합차곱몫을 구하라

        //1. 데이터 준비
        System.out.print("첫번째 수 = ");
        int num1 = scan.nextInt();
        System.out.print("두번째 수 = ");
        int num2 = scan.nextInt();

        //두 수가 양수이면
        if(num1>0 && num2>0){   //조건식에는 양수만 입력되었을 때 참이되는 수식을 세운다.
            //2. 계산
            int plus = num1 + num2;
            int minus = num1 - num2;
            int multiple = num1 * num2;
            double divide = num1 / (double)num2;

            //3. 결과 출력
            System.out.printf("%d+%d=%d\n", num1, num2, plus);
            System.out.printf("%d-%d=%d\n", num1, num2, minus);
            System.out.printf("%d*%d=%d\n", num1, num2, multiple);
            System.out.printf("%d/%d=%f\n", num1, num2, divide);
        }

    }
}
