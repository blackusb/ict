package ex_test;

import java.util.Scanner;

public class ExJ13IfElseIf {
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
        int total = kor + eng + mat;
        System.out.println("총점="+ total);
        double avg = total / 3.0;
        System.out.println("평균="+avg);

        if(avg >= 90){
            System.out.println("A");
        }else if(avg >= 80){
            System.out.println("B");
        }else if(avg >= 70){
            System.out.println("C");
        }else if(avg >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

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
