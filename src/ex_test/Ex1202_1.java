package ex_test;

import java.util.Scanner;

public class Ex1202_1 {
    public static void main(String[] args) {
        /*
            임의의 홀수입력(1~49)=25

            A~Z가 반복되어서, 다이아몬드 모양 나오게 만들기
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("임의의 홀수입력(1~49)=");
        int num = sc.nextInt();

        for(int i=1; i<=num; i+=2){ //1/3/5/7/9...
            //i=1->공백0 알파벳1/i=3->공백1 알파벳2, 공백0 알파벳3/i=5->공백2 알파벳1,공백1 알파벳3,공백0 알파벳5
            //공백 출력
            for(int s=1; s<=(num-i)/2 ; s++){
                System.out.print(" ");
            }
            int start = 65;
            for(int j=1; j<=i; j++){    //
                System.out.print((char)(start+i-1));    //i=1->65/i=3->66/i=5->69
                start += j;       //65+1-1/65+3
            }
            System.out.println();
        }
    }
}
