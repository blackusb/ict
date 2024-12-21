package j01_basic;

import java.util.Scanner;

public class GuGuDan3 {
    public GuGuDan3(){  //생성자

    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        //1~9단까지 있다.
        //단을 입력받아 3개의 단을 출력하라.
        do{
            System.out.print("단=");
            int dan = scan.nextInt();

            if(dan>=1 && dan<=9){   //1~9단 사이일 때 실행
                int startDan = dan - 1;
                int endDan = dan + 1;
                if(startDan<1) startDan++;
                if(endDan>9) endDan--;
                for(int i=2; i<=9; i++){
                    for(int d=startDan; d<=endDan; d++){  //단
                        int result = d * i;
                        System.out.print(d+"*"+i+"="+result+"\t");
                    }
                    System.out.println();
                }
            }else{
                System.out.println("단을 잘못 입력하였습니다.");
            }
        }while(true);
    }

    public static void main(String[] args) {
        GuGuDan3 ggd = new GuGuDan3();
        ggd.start();
    }
}
