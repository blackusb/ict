package javaTestProject;

import java.util.Calendar;
import java.util.Scanner;

public class Question3 {
    public Question3(){}
    public void start(){
        Scanner sc = new Scanner(System.in);

        //년도, 월 입력받기
        System.out.print("년도->");
        int year = sc.nextInt();
        System.out.print("월->");
        int month = sc.nextInt();

        //제목 출력
        System.out.println("\t\t=="+year+"년 "+month+"월"+"==");
        System.out.print("일\t월\t화\t수\t목\t금\t토");

        //달력 객체 만들고, 입력된 월의 첫째날 요일 구하고, 마지막 일 구하기.
        Calendar cal = Calendar.getInstance(); //달력 객체 생성
        cal.set(year, month-1, 1); //입력받은 년,월,1일로 날짜 셋팅. 월은 0월부터 시작.
        int week = cal.get(Calendar.DAY_OF_WEEK); //해당월의 첫째날의 요일 구하기. 숫자로 반환됨.
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //해당월의 마지막 일 구하기

        System.out.println();

        //공백 출력
        for(int space=1; space<week; space++){
            System.out.print("\t");
        }
        //날짜 출력
        for(int day=1; day<=lastDay; day++){
            System.out.print(day+"\t");
            if((week-1+day)%7==0){  //공백의 수+출력된 날짜=7이면 줄 바꾸기.
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Question3().start();
    }
}
//콘솔을 이용해 년도, 월을 입력받아 달력 출력.