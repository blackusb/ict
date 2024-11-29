package ex_test;

import java.util.Scanner;

public class Ex241127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------");

        for(int i=1; i<=5; i++){            //i=1/i=2  /i=3
            for(int j=1; j<=i; j++){         //j=1/j=1,2/j=1,2,3
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------");

        for(int i=1; i<=5; i++){ //i=1,2,3,4,5
            for(int j=5; j>=i; j--){    //별 5개,4개,3개...
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------");

        for(int i=1; i<=5; i++){    //i=1,2,3,4,5
            //i=1->공백4,별1/i=2->공백3,별2/i=3->공백2,별3... 공백+별=5
            for(int s=1; s<=5-i; s++){  //1,2,3,4/1,2,3/1,2/1/0
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------");
    }
}
