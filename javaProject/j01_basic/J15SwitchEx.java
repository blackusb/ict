package j01_basic;

import java.util.Scanner;

public class J15SwitchEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //점수 입력받기
        System.out.print("국어점수=");
        int kor = sc.nextInt();
        System.out.print("영어점수=");
        int eng = sc.nextInt();
        System.out.print("수학점수=");
        int mat = sc.nextInt();

        //총점, 평균 구하기
        int total = kor + eng + mat;
        double avg = total / 3.0;
        char grade = ' ';

        //switch문
        //범위를 지정할 수 없으므로, 범위를 간소화한다.
        //avg를 10으로 나눠서 int로 형변환을 한다.
        switch((int)avg/10){    //10,9,8,7,6,5,4,3,2,1,0 나올 수 있음
            case 10:
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            default: grade = 'F';
        }
        System.out.println("총점="+total);
        System.out.println("평균="+avg);
        System.out.println("학점="+grade);
    }
}
/*
    [문제] 3과목의 점수를 입력받아 총점, 평균, 학점을 구하라.
          학점을 구할때는 switch문으로 구하라(if문 사용불가)

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