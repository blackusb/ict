package j00_api;
import java.lang.System;    //lang패키지의 클래스는 컴파일러가 자동으로 import 해준다. 안써도 됨.
import java.util.Scanner;  //util패키지는 자동으로 import 안해준다.

public class ScannerTest {
    public static void main(String[] args){
        //Scanner클래스는 콘솔에서 정수, 실수, 문자를 입력 받을 수 있다.
        //콘솔의 값을 문자로 읽어와 원하는 데이터형으로 변경해준다.

        //Scanner클래스로 객체를 만든다.
        Scanner scan = new Scanner(System.in);  //생성자 메소드

        /*
        String name = scan.next();
        scan.nextLine();    //enter키 읽어오기. 변수에 안담았으니 사용 x
        System.out.println("name="+name);

        String addr = scan.nextLine();  //nextLine()은 enter까지 읽어감
        System.out.println("addr="+addr);
        */

        //숫자 입력받기
        System.out.print("양의 정수 입력=>");
        int data = scan.nextInt();
        System.out.println(data+100);

        System.out.print("실수 입력=>");
        double data2 = scan.nextDouble();
        System.out.println(data2+100);

        System.out.print("논리값(true/false)=>");
        boolean data3 = scan.nextBoolean();
        System.out.println(!data3);


    }
}
