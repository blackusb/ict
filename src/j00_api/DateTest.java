package j00_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args){
        //현재 시스템의 날짜, 시간정보를 얻어오는 클래스
        Date now = new Date();
        System.out.println(now);

        //2024년 11월 26일 10:12
        SimpleDateFormat frt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String dateStr = frt.format(now);
        System.out.println(dateStr);
    }
}
