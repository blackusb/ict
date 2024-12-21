package j01_basic;

import java.util.Scanner;

public class StandardWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //데이터준비
        System.out.print("나이=");
        int age = scan.nextInt();
        System.out.print("성별(1:남, 2:여)=");
        int gender = scan.nextInt();
        System.out.print("키(cm)=");
        int height = scan.nextInt();
        System.out.print("현재체중=");
        int weight = scan.nextInt();

        //표준체중
        double value = 0.90;
        if(gender==2 && age<=35){   //여성, 35세이하
            value = 0.85;
        }else if(gender==1 && age>=36){ //남성, 36세이상
            value = 0.95;
        }
        double standardWeight = (height - 100) * value;

        //표준체중지수
        double standardIndex = (weight / standardWeight) * 100;

        //체형
        String bodyType = "";
        if(standardIndex<=85)
            bodyType = "마른형";
        else if(standardIndex<=95)
            bodyType = "조금마른형";
        else if(standardIndex<=115)
            bodyType = "표준형";
        else if(standardIndex<=125)
            bodyType = "조금비만형";
        else
            bodyType = "비만형";

        System.out.println("표준체중="+standardWeight);
        System.out.printf("당신의 표준체중지수는 %.2f로 %s입니다.\n", standardIndex, bodyType);
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