package j01_basic;

public class J22For {
    public static void main(String[] args){
        //중첩 for문
        //반복문내의 반복문 처리하기
        for(int i=1; i<=5; i++){    //한 줄 처리
            for(int j=1; j<=5; j++){    //한 칸 처리
                //System.out.printf("i=%d, j=%d\n", i, j);
                //System.out.print(i+" ");
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        /*
            *
            * *
            * * *
            * * * *
            * * * * *
       */
        for(int i=1; i<=5; i++){    //i=1,2,3,4,5
            for(int j=1; j<=i; j++){
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        /*
            * * * * *
            * * * *
            * * *
            * *
            *
        */
        for(int i=1; i<=5; i++){ //i=1,2,3,4,5
            for(int j=5; j>=i; j--){ //5,4,3,2,1
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for(int i=5; i>=1; i--){    //i=5,4,3,2,1
            for(int j=1; j<=i; j++){
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        /*
                    *
                  * *
                * * *
              * * * *
            * * * * *
        */
        for(int i=1; i<=5; i++){    //i=1,2,3,4,5
            //i=1->공백4, 별1 / i=2->공백3, 별2 / i=3->공백2, 별3 / i=4->공백1, 별4 / i=5->공백0, 별5 / 공백+별=항상 5
            for(int s=1; s<=5-i; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        /*
                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
        */
        //5행 9열, 별의 갯수:1,3,5,7,9, 공백의 갯수:8,6,4,2,0, 별의 갯수+공백의 갯수=항상 9, 별 뒤의 공백은 출력x->줄바꿈 처리
        for(int i=1; i<=9; i+=2){   //i=1,3,5,7,9
            //공백 출력
            for(int s=1; s<=(9-i)/2; s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("% ");
            }
            System.out.println();
        }

        System.out.println("----------------");

        /*
             * * * * *  별5 공백0
               * * * *  별4 공백1
                 * * *  별3 공백2
                   * *  별2 공백3
                     *  별1 공백4
         */
        for(int i=5; i>=1; i--){  //5~1
            //공백, 5-i
            for(int s=1; s<=5-i; s++){
                System.out.print("  ");
            }
            //*출력
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
*/