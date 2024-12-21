package j01_basic;

import java.util.Scanner;

public class J05OperatorEx2 {
    public static void main(String[] args){
        //                          InputStream객체
        Scanner scan = new Scanner(System.in);

        System.out.print("정수=");
        int inData = scan.nextInt();

        //백의 자리 이하를 버리는 프로그램 작성
        int result = inData / 100 * 100;
        System.out.println("결과="+result);

        //일의 자리의 값을 1로 바꾸는 프로그램 작성
        int result2 = inData / 10 * 10 + 1;
        System.out.println("결과2="+result2);
        
        scan.nextLine();    //enter버리기

        //대문자를 소문자로 바꾸는 프로그램 작성
        System.out.print("대문자(A~Z)입력=");
        String str = scan.nextLine();   //"A" "Apple" "Best"

        char c = str.charAt(0); //'A'
        char d = (char)(c + 32);  //char+int=>int형이므로 형변환 필요
        System.out.println("소문자="+d);

    }
}
