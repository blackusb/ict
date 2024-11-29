package j01_basic;

import java.util.Scanner;

public class J26DoWhileEx {
    public static void main(String[] args) {
        /*
            임의의 수를 입력 받아 1부터 합을 구하여 입력 받은 값을 초과 할때 얼마까지 합을 구하여야 하는지를 구하는 프로그램을 작성하라

            임의의 정수=2658
            1~73까지의 합은 2701
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("임의의 정수=");
        int data = scan.nextInt();

        int sum = 0;

        //for문 사용
        /*for(int i=1; ;i++){ //1,2,3,4,5....
            sum += i;   //합계
            if(sum>=data){
                System.out.println("1~"+i+"까지의 합은 "+sum);
                break;  //출력은 한번만 하면 되니, 출력이 됐으면 break를 사용.
            }
        }*/

        //while문 사용
        /*int i = 1;  //1,2,3,4,5.....
        while(true){
            sum += i;
            if(sum>=data){
                System.out.printf("1~%d까지의 합은 %d\n", i, sum);
                break;
            }
            i++;
        }*/

        //do-while문 사용
        int i = 0;
        do{
            i++;    //++i, i=i+1; i+=1;
            sum += i;
            if(sum>=data){
                System.out.println("1~"+i+"까지의 합은 "+sum);
                break;
            }
        }while(true);
    }
}
