package ex_test;

public class Ex1127_1 {
    public static void main(String[] args){
        /*
            * * * * *
              * * * *
                * * *
                  * *
                    *
        */
        for(int i=1; i<=5; i++){
            //i=1->공백0,별5/i=2->공백1,별4/i=3->공백2,별3/i=4->공백3,별2/...공백+별=5
            for(int s=1; s<=i; s++){  //공백:0개,1개,2개,3개,4개
                System.out.print("  ");
            }
            for(int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
