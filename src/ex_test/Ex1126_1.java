package ex_test;

import java.util.Calendar;
import java.util.Scanner;

public class Ex1126_1 {
    public static void main(String[] args) {
        //년도와 월 입력받아서 해당 월의 달력 출력
        Scanner sc = new Scanner(System.in);

        //년도, 월 입력받기
        System.out.print("년도=");
        int year = sc.nextInt();
        System.out.print("월=");
        int month = sc.nextInt();

        //Calendar 객체 가져오기
        Calendar now = Calendar.getInstance();
        //System.out.println(now);

        //입력받은 년도, 월에 해당하는 날짜와 시간으로 변경
        now.set(Calendar.YEAR, year);
        now.set(Calendar.MONTH, month);

        //년도, 월 얻기
        int y = now.get(Calendar.YEAR);     //년도
        int m = now.get(Calendar.MONTH);    //월

        //출력
        //요일
        System.out.printf("%d년 %d월\n", y, m);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        //일 수
        //입력받은 월이 28,29,30,31일중 며칠까지 있는지 계산. 윤년도 따져봐야함.
        if(!(month==2 || month==4 || month==6 || month==9 || month==11)){    //31일까지 있는 달
            //1~31일까지 출력
            for(int i=1; i<=31; i++){
                System.out.print(i+"\t");
            }
        }else{  //28,29,30일까지 있는 달
            if(month==2){   //2월 계산
                //윤년, 평년 구분
                if(year%4==0 && year%100!=0 || year%4==0){   //윤달
                    //1~29일까지 출력
                    for(int i=1; i<=29; i++){
                        System.out.print(i+"\t");
                    }
                }else{  //평달
                    //1~28일까지 출력
                    for(int i=1; i<=28; i++){
                        System.out.print(i+"\t");
                    }
                }
            }else{  //2월 외. 30일까지 있는 달
                //1~30일까지 출력
                for(int i=1; i<=30; i++){
                    System.out.print(i+"\t");
                }
            }
        }
    }
}
