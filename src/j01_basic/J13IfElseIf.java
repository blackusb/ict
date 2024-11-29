package j01_basic;

import java.util.Scanner;

public class J13IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 데이터 준비
        System.out.print("국어점수=");
        int kor = sc.nextInt();
        System.out.print("영어점수=");
        int eng = sc.nextInt();
        System.out.print("수학점수=");
        int mat = sc.nextInt();

        //2. 계산 및 출력
        int total = kor + eng + mat;    //총점
        double avg = total / 3.0;       //평균

        //                                      null               ""
        String grade="";    //학점 구하기    String grade;   String grade="";

        //if문으로 학점구하기
/*
        if(avg>=90 && avg<=100){
            grade = "A";
        }
        if(avg>=80 && avg<=89){
            grade = "B";
        }
        if(avg>=70 && avg<=79){
            grade = "C";
        }
        if(avg>=60 && avg<=69){
            grade = "D";
        }
        if(avg>=0 && avg<=59){
            grade = "F";
        }
*/

        if(avg >= 90){
            grade = "A";
        }else if(avg >= 80){
            grade = "B";
        }else if(avg >= 70){
            grade = "C";
        }else if(avg >= 60){
            grade = "D";
        }else{
            grade = "F";
        }

        //3. 결과출력
        System.out.printf("총점=%d\n평균=%.2f\n학점=%s\n", total, avg, grade);
    }
}
/*
    [문제] 3과목의 점수를 입력받아 총점, 평균, 학점을 구하라.

    학점기준
    90~100  A
    80~89   B
    70~79   C
    60~69   D
    0~59    F

    실행
    국어점수=90
    영어점수=80
    수학점수=70
    총점=240
    평균=80
    학점=B
*/