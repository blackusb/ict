package javaTestProject;

import java.util.Scanner;

public class Question2 {
    public Question2(){}
    public void start(){
        Scanner sc = new Scanner(System.in);

        do{
            try{
                //정수 입력받기
                System.out.print("정수입력=");
                String num2 = sc.nextLine();
                int num = Integer.parseInt(num2);

                //처리조건 적용 : 정수가 1~1000사이일 경우만 계산됨.
                if(num>=1 && num<=1000){
                    /////////계산
                    //홀수의 합
                    int hol = 0; //홀수의 합을 담을 변수
                    for(int i=1; i<=num; i+=2){
                        hol += i;
                    }
                    System.out.println("1~"+num+"까지의 홀수의 합은 "+hol);

                    //짝수의 합
                    int jjak = 0; //홀수의 합을 담을 변수
                    for(int i=2; i<=num; i+=2){
                        jjak += i;
                    }
                    System.out.println("1~"+num+"까지의 짝수의 합은 "+jjak);

                    //전체합
                    int sum = 0; //전체합을 담을 변수
                    for(int i=1; i<=num; i++){
                        sum +=i;
                    }
                    System.out.println("1~"+num+"까지의 합은 "+sum+"\n");
                }else{
                    System.out.println("잘못된 값입니다.\n");
                }
            }catch(NumberFormatException nfe){
                System.out.println("잘못된 값입니다.\n");
            }
        }while(true);
    }

    public static void main(String[] args) {
        new Question2().start();
    }
}
//정수 입력받아 그 수까지의 전체합, 짝수의 합, 홀수의 합 구하고 출력.