package ex_test;

import java.util.Scanner;

public class Ex1125_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //1. 나이, 성별, 키, 체중 입력받기
        System.out.print("나이=");
        int age = sc.nextInt();
        System.out.print("성별(1:남, 2:여)=");
        int gender = sc.nextInt();
        System.out.print("키=");
        int height = sc.nextInt();
        System.out.print("현재체중=");
        int weight = sc.nextInt();

        //2. 표준체중기준, 표준체중지수 계산 및 출력
        //표준체중기준 sWeight = (height - 100) * num;
        double num = 0;
        double sWeight = 0;
        if(age<=35){    //35세 이하
            if(gender==1){   //남성
                num = 0.90;
            }else{  //여성
                num = 0.85;
            }
        }else{  //36세 이상
            if(gender==1){  //남성
                num = 0.95;
            }else{  //여성
                num = 0.90;
            }
        }
        sWeight = (height - 100) * num;
        System.out.println("표준체중="+sWeight);

        //표준체중지수 (현재체중/표준체중)*100
        double sWeightNum = weight/sWeight*100;
        //표준체중지수 평가 및 출력
        String result = "";
        if(sWeightNum<=85){
            result = "마른형";
        }else if(sWeightNum<=95){
            result = "조금마른형";
        }else if(sWeightNum<=115){
            result = "표준형";
        }else if(sWeightNum<=125){
            result = "조금 비만형";
        }else{
            result = "비만형";
        }
        System.out.printf("당신의 표준체중지수는 %.2f로 %s입니다.", sWeightNum, result);
    }
}
/*
    다음기준에 맞는 프로그램을 작성하라.
    클래스명 : StandardWeight
    표준체중기준
         35세 이하
            • 남성 : (키- 100)*0.90
            • 여성 : (키- 100)*0.85
         36세 이상
            • 남성 : (키- 100)*0.95
            • 여성 : (키- 100)*0.90

    표준체중 지수 = (현재체중/표준체중) * 100
    표준체중지수 평가기준
     마른형 : 85이하
     조금마른형 : 86~95
     표준형 : 96~115
     조금 비만형 : 116~125
     비만형 : 126이상
    표준체중지수는 소수이하 2자리까지만 출력

    //실행결과
    나이=36
    성별(1:남, 2:여)=1
    키=180
    현재체중=70
    표준체중=76.0
    당신의 표준체중지수는 92.11으로 조금마른형입니다.
*/