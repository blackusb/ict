package ex_test;

import java.util.Scanner;

public class ExJ11IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            임의의 수를 입력받아 입력받은 수가 양수이거나 음수이면 양수로 만들어 100을 곱하여 출력하고,
            0이면 1로 변경하여 100을 곱하여 출력하라.
        */
        System.out.print("임의의 수를 입력해주세요=>");
        int num = sc.nextInt();

        if(num>0 || num<0){
            if(num>0){
                System.out.println(num*100);
            }else{
                System.out.println(-num*100);
            }
        }else{
            num=1;
            System.out.println(num*100);
        }
    }
}
