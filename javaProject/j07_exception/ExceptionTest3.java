package j07_exception;

import java.util.Scanner;

public class ExceptionTest3 {
    public ExceptionTest3() {    //생성자
        plus(10, 20);
    }
    public ExceptionTest3(int a, int b) throws ArithmeticException{
        plus(a, b);
    }
    public void plus(int a, int b) throws ArithmeticException{
        System.out.println(a+"+"+b+"="+(a+b));
        minus(a, b);
    }
    public void minus(int a, int b) throws ArithmeticException{
        System.out.println(a+"-"+b+"="+(a-b));
        multiple(a, b);
    }
    public void multiple(int a, int b) throws ArithmeticException{
        System.out.println(a+"*"+b+"="+(a*b));
        divide(a, b);
    }
    public void divide(int a, int b) throws ArithmeticException{    //이렇게 쓸 때는 예외 여러개 쓰기 가능. 예외 발생하면 던져서 책임 전가 -> divide 호출한 곳으로 예외 던짐.
        System.out.println(a+"/"+b+"="+(a/b));/////
    }

    //메인은 다른 곳에 있다고 생각하기
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

            do{
                try{
                    System.out.print("수1=");
                    //int a = s.nextInt();////  //공백까지 입력데이터로 봄.
                    String t1 = s.nextLine();   //  nextLine() - > 엔터까지 입력데이터로 봄.
                    int a = Integer.parseInt(t1);   //static이므로 클래스명.메소드명으로 적어줌. NumberFormatException

                    System.out.print("수2=");
                    int b = Integer.parseInt(s.nextLine());
                    //new ExceptionTest3();
                    new ExceptionTest3(a, b);
                }catch(ArithmeticException ae){
                    System.out.println("==================================");
                    //ae.printStackTrace();
                }catch(NumberFormatException ie){
                    System.out.println("1이상의 정수를 입력하세요.");
                }
            }while(true);
    }
}
