package j07_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
    Scanner scan = new Scanner(System.in);
    public ExceptionTest1(){}   //생성자
    public void start(){
        //try : 예외 발생 가능한 코드와 예외 발생할 가능성이 없는 코드를 기술한다.
        try{
            System.out.print("정수1=");
            int a = scan.nextInt(); //InputMismatchException
            System.out.print("정수2=");
            int b = scan.nextInt(); //InputMismatchException
            int result = divide(a, b);  //ArithmeticException   //b=0일때 예외 발생
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println("arr=>" + arr[arr.length-1]);    //ArrayIndexOutOfBoundsException    //arr[5]가 되면 예외 발생
        }catch(InputMismatchException ime){
            //문자를 입력한 경우 예외 발생
            System.out.println("InputMismatchException->"+ime.getMessage());
            System.out.println("정수를 입력하지 않았습니다.");
            //ime.printStackTrace();    //예외 내용 출력되는 메소드.
        }catch(ArithmeticException ae){
            System.out.println("ArithmeticException->"+ae.getMessage());
            System.out.println("0으로 어떤 수를 나눌 수 없습니다.");
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("ArrayIndexOutOfBoundsException-->"+aiobe.getMessage());
            System.out.println("배열의 index가 잘못 지정되었습니다.");
        }finally{   //생략가능
            System.out.println("finally : 예외발생과 상관없이 무조건 실행됨");
        }
    }
    public int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        new ExceptionTest1().start();   //객체만들고 바로 호출
    }
}
