package j00_api;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args){
        //0~100
        //Random 클래스 : 난수 전용 클래스, 정수, 실수, 논리형
        //       객체 생성하여 사용한다.
        Random random = new Random();   //Scanner 객체처럼 만들고 import 해준다.

        for(int i=1; i<=1000; i++){
            //int r = random.nextInt();   //Math.random()*int형 크기의 값 //21억--21억+1
            //int r = random.nextInt(22)+31;    //31~52 //52-31+1=22 /22넣으면 0~21까지 나옴
            //double r = random.nextDouble(); //Math.random()과 똑같음
            boolean r= random.nextBoolean();
            System.out.print(r + "\t");
            if(i%7==0) System.out.println();
        }
    }
}
