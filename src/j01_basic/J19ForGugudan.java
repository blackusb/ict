package j01_basic;

import java.util.Scanner;

public class J19ForGugudan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //구구단
        System.out.print("단=");
        int dan = scan.nextInt();

        for(int i=2; i<=9; i++){
            int result = dan * i;
            //System.out.println(dan+" * "+i+" = "+result);
            System.out.printf("%d * %d = %d\n", dan, i, result);
        }
    }
}
