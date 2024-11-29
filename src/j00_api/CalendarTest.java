package j00_api;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args){
        //날짜+시간
        Date date = new Date(); //Tue Nov 26 13:18:39 KST 2024
        Scanner scan = new Scanner(System.in);
        //              getInstance()메소드는 Calendar객체를 만들어준다.
        Calendar now = Calendar.getInstance(); //new Calendar(); 사용불가   //날짜에 관한 모든 정보 가져옴
        System.out.println(now);

        //set() : now의 현재날짜, 시간을 원하는 날짜와 시간으로 변경하기
        now.set(2025, 2, 10); //년월일 변경하기   //month는 0월부터 시작하므로 2=>3월임
        now.set(2023, 4, 12, 10, 5);  //년월일시분
        now.set(2025, 6, 2, 11, 35, 13 );  //년월일시분초
        //년월일시분초중 1개만 변경할 때
        now.set(Calendar.YEAR, 2026);  //년도만 변경
        now.set(Calendar.MONTH, 11);    //월을 12월로 변경

        //년도 얻어오기
        int y = now.get(Calendar.YEAR);         //년도
        int m = now.get(Calendar.MONTH) + 1;    // 월 //월은 0월부터 시작하므로 +1 해준다.
        int d = now.get(Calendar.DAY_OF_MONTH); //일
        int h = now.get(Calendar.HOUR_OF_DAY);  //24시 기준 시간
        int mi = now.get(Calendar.MINUTE);      //분
        //요일 : 일->1, 월->2, 화->3, 수->4, 목->5, 금->6, 토->7
        int w = now.get(Calendar.DAY_OF_WEEK);  //요일
        //switch, if
        //값이 범위가 있는 것이 아니므로 switch가 적당함
        String week = "";
        switch(w){
            case 1: week="일"; break;
            case 2: week="월"; break;
            case 3: week="화"; break;
            case 4: week="수"; break;
            case 5: week="목"; break;
            case 6: week="금"; break;
            case 7: week="토";
        }

        //2024년 11월 26일 14시 45분 (화)
        System.out.printf("%d년 %d월 %d일 %d시 %d분 (%s)", y, m, d, h, mi, week);
    }
}
