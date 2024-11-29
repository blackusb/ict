package ex_test;

import java.util.Scanner;

public class Ex241122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

/*
        //키보드로 입력 받은 하나의 정수가 양수이면 "양수", 양수가 아니면 "음수", 0이면 "0"을 출력하세요.

        System.out.print("정수를 입력해 주세요=>");
        int num = sc.nextInt();
        String result = (num>0)?"양수":(num==0)?"0":"음수";
        System.out.println("결과=>"+result);
*/

/*
        //키보드로 입력 받은 하나의 정수가 짝수이면 "짝수", 홀수면 "홀수"를 출력하세요.

        System.out.print("정수를 입력해주세요=>");
        int num = sc.nextInt();
        //짝수 홀수 계산
        String result = (num%2==0)?"짝수":"홀수";
        System.out.println(result);
 */

/*
        //모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
        //1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

        //1. 인원 수, 사탕 갯수 입력 받기
        System.out.print("인원 수 입력=>");
        int people = sc.nextInt();
        System.out.print("사탕 갯수 입력=>");
        int candy = sc.nextInt();
        //2. 1인당 동일하게 나눠가진 사탕 갯수 구하기
        //  사탕 갯수/인원 수
        int result = candy/people;
        //3. 나눠주고 남은 사탕 갯수 구하기
        int result2 = candy%people;
        //4. 결과 출력
        System.out.println("동일하게 나눠가진 사탕 갯수="+result+", 남은 사탕 갯수="+result2);
*/

/*
        //키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
        //이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요. 다른값 입력시 "잘못 입력하였습니다" 출력
        System.out.print("성별을 M, F 중 하나 입력하세요=>");
        String people = sc.nextLine();
        String result = (people.equals("M"))?"남학생":(people.equals("F"))?"여학생":"잘못 입력하였습니다.";
        System.out.println(result);
*/

/*
        //나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
        System.out.print("나이를 입력해주세요=>");
        int age = sc.nextInt();
        String result = (age<=13)? "어린이":(age>19)?"성인":"청소년";
        System.out.println(result);
*/

        //국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
        //세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3)을 구하세요.
        //세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
        //세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요

        //점수 입력 받기
        System.out.print("국어 점수 입력=>");
        int kor = sc.nextInt();
        System.out.print("영어 점수 입력=>");
        int eng = sc.nextInt();
        System.out.print("수학 점수 입력=>");
        int math = sc.nextInt();
        //합계와 평균 구하기
        int sum = kor+eng+math;
        int avg = sum/3;
        //합격여부 판단
        String result = ((kor>=40 && eng>=40 && math>=40) && avg>=60)?"합격":"불합격";
        //출력
        System.out.println(result);











    }
}
