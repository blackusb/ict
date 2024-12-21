package j07_exception;

import java.util.Scanner;

public class ExceptionTest2 {
    public ExceptionTest2(){    //생성자

    }
    public void start(){
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("정수1=");
            int a = scan.nextInt(); //InputMismatchException
            System.out.print("정수2=");
            int b = scan.nextInt(); //InputMismatchException
            int result = divide(a, b);  //ArithmeticException   //b=0일때 예외 발생
            System.out.println("result=" + result);
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println("arr=>" + arr[arr.length]);    //ArrayIndexOutOfBoundsException    //arr[5]가 되면 예외 발생
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("배열의 첨자 값이 잘못되었습니다.");
        }catch(Exception e){
            System.out.println("0보다 큰 값을 입력해야 합니다.");
        }
    }
    public int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        new ExceptionTest2().start();   //객체 생성하고 start()메소드 실행.
    }
}
