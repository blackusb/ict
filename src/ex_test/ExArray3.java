package ex_test;

import java.util.Scanner;

public class ExArray3 {
    public static void main(String[] args) {
        //콘솔에서 3과목의 점수를 입력받아 총점, 평균, 학점을 구하라
        //3과목의 점수, 총점, 평균은 배열에 저장한다.
        Scanner sc = new Scanner(System.in);

        //데이터준비
        int[] arr = new int[5];

        System.out.print("국어=");
        arr[0] = sc.nextInt();
        System.out.print("영어=");
        arr[1] = sc.nextInt();
        System.out.print("수학=");
        arr[2] = sc.nextInt();

        //////처리
        //총점 arr[3]
        for(int i=0; i<=2; i++){
            arr[3] += arr[i];
        }
        //평균 arr[4]
        arr[4] = arr[3]/3;
        //학점
        double grade = arr[4];

        //출력
        System.out.println("총점="+arr[3]);
        System.out.println("평균="+arr[4]);
        System.out.println("학점="+grade);
    }
}
/*
    실행
    국어=65
    영어=33
    수학=77
    총점=__
    평균=__
    학점=_    //학점 기준은 100점만점
*/