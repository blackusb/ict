package j07_exception;
//사용자 정의 예외 클래스 만들기
//반드시 Exception클래스를 상속받아 생성한다.
//1~100사이의 값이 아닐 때 예외 발생시킬 클래스로 사용할 것임.
public class MyException extends Exception{ //Exceoption 상속받기
    public MyException(){   //생성자
        //상위 클래스의 생성자메소드를 호출하여 예외 메세지를 셋팅해준다.
        super("1~100 사이의 값을 입력하지 않았습니다.");  //메세지 고정
    }
    public MyException(String message){
        super(message);
    }
}
