package j07_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
    //1~100사이의 값을 입력받아 그 수까지의 합을 구하라.
    public MyExceptionTest(){}  //생성자
    public void start(){
        Scanner scan = new Scanner(System.in);

        try{    //예외가 발생하면 실행되서는 안될 부분을 다 넣기
            System.out.print("정수입력(1~100사이)=");
            int num = scan.nextInt();
            //1~100사이가 아니면 예외를 강제(throw)로 발생시키기
            if(num<1 || num>100){
                //throw new MyException();  //매개변수 없는 생성자메소드 사용.
                throw new MyException("정수 중 1~100 사이의 값이 아닙니다.");   //매개변수 있는 생성자메소드 사용.
            }
            int sum = 0;
            for(int i=1; i<=num; i++){
                sum += i;
            }
            System.out.println("1~"+num+"까지의 합은 "+sum);
        }catch(InputMismatchException ie){
            System.out.println("숫자를 입력하세요");
        }catch(MyException me){
            System.out.println(me.getMessage());
        }
    }

    public static void main(String[] args) {
        new MyExceptionTest().start();
    }
}