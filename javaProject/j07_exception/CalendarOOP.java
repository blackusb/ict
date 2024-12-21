package j07_exception;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
    public CalendarOOP(){  //생성자

    }
    public void start(){
        int year = inData("년도");
        int month = inData("월");
        if(month>=1 && month<=12){  //제대로된 월
            titlePrint(year, month);    //제목출력
            int week = spaceOutput(year, month);    //1일의 요일 = 공백의 수
            int lastDay = getLastDay(year, month);
            dayPrint(week-1, lastDay); //날짜 출력
        }else{  //잘못 입력받은 월
            System.out.println("월은 1~12월까지입니다.");
        }
    }
    //년도월일 입력(숫자 입력)
    public int inData(String msg){
        Scanner s = new Scanner(System.in);
        do{
            try{
                System.out.print(msg+"=");
                int intData = Integer.parseInt(s.nextLine());   //nextLine()은 엔터까지 데이터를 입력 받음.

                return intData; //return을 만나도 반복문 빠져나감
            }catch(NumberFormatException nfe){
                System.out.println(msg+"은(는) 숫자를 입력하여야 합니다.");
            }
        }while(true);

        //return intData;
    }

    //년월을 이용하여 제목을 출력하는 메소드
    public void titlePrint(int y, int m){
        System.out.println("\t=="+y+"년 "+m+"월==");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
    }

    //요일을 구하여 날짜 출력전에 공백출력
    public int spaceOutput(int y, int m){
        Calendar now = Calendar.getInstance();  //오늘 날짜 구하기
        now.set(y, m-1, 1); //입력받은 월의 1일로 셋팅
        int w = now.get(Calendar.DAY_OF_WEEK);  //일->1, 월->2.....
        //여백출력
        for(int i=1; i<w; i++){
            System.out.print("\t");
        }
        return w;
    }

    //마지막날 구하기
    public int getLastDay(int y, int m){
        Calendar date = Calendar.getInstance();
        date.set(y, m-1, 1);  //날짜중에 제일 큰 값

        return date.getActualMaximum(Calendar.DAY_OF_MONTH);    //DAY_OF_MONTH -> 날짜를 뜻함
    }

    //날짜 출력하기
    public void dayPrint(int space, int lastDay){
        for(int i=1; i<=lastDay; i++){
            System.out.print(i+"\t");
            if((i+space)%7==0) System.out.println();
        }
    }

//    public static void main(String[] args) {
//        new CalendarOOP().start();
//    }
}
