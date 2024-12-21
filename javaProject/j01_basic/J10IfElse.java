package j01_basic;

import java.util.Scanner;

public class J10IfElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
            if(조건문){    //조건문이 참일때 실행
                실행문;
                실행문;
            }else{  //조건문이 거짓일때 실행
                실행문;
                실행문;
            }
        */
        //어떤 수를 입력받아 1~100사이면 어떤 수를 3배하여 출력하고, 그 외의 값은 "잘못된 값입니다."라고 출력하라.
        System.out.print("1~100사이의 임의의 정수=");
        int num = scan.nextInt();

        if(num>=1 && num<=100){ //1~100사이일 때 참
             int result = num * 3;
             System.out.println("num의 3배=>"+result);
        }else{  //그외의 거짓
            System.out.println("잘못된 값입니다.");
        }
    }
}
