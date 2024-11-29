package j01_basic;

import java.util.Scanner;

public class J12IfElseEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
            두 수를 입력받아 큰 수 순서대로 출력하라.

            실행
            수1 = 30
            수2 = 50
            50
            30

            수1 = 130
            수2 = 50
            130
            50
        */

        System.out.print("수1=");
        int num1 = sc.nextInt();
        System.out.print("수2=");
        int num2 = sc.nextInt();

        if(num1 > num2){
            //System.out.println(num1);
            //System.out.println(num2);
            System.out.printf("%d\n%d", num1, num2);
        }else{
            System.out.printf("%d\n%d", num2, num1);
        }
    }
}
