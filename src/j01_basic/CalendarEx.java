package j01_basic;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //년월입력
        System.out.print("년도=");
        int year = scan.nextInt();
        System.out.print("월=");
        int month = scan.nextInt();

        //제목 출력
        System.out.println("\t\t"+year+"년 "+month+"월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        //입력받은 년월로 Calendar객체 생성 -> 요일 구할 수 있음
        Calendar date = Calendar.getInstance(); //현재날짜
        date.set(year, month-1, 1); //날짜 변경. 0월부터 시작한다.
        int week = date.get(Calendar.DAY_OF_WEEK); //요일 구하기

        //마지막날 구하기
        // 30 : 4월, 6월, 9월, 11월
        // 31 : 1월, 3월, 5월, 7월, 8월, 10일, 12일
        // 28, 29: 2월
        int lastDay = 31;
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11: lastDay = 30; break;
            case 2:
                if(year%4==0 && !(year%100==0) || year%400==0){
                    lastDay = 29;
                }else{
                    lastDay = 28;
                }
        }
        //1일 출력하기 전 칸 띄우기
        for(int space=1; space<week; space++){
            System.out.print("\t");
        }
        //날짜출력 : 1~laseDay까지 출력
        for(int day=1; day<=lastDay; day++){
            System.out.print(day+"\t");
            //공백의 수와 출력한 날짜의 값을 합하여 7의 배수이면 줄바꿈한다.
            if((week-1+day)%7==0){  //공백의 수:week-1
                System.out.println();
            }
        }
    }
}
