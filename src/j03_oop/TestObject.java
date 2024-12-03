package j03_oop;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

//소스코드는 한 파일에 여러개의 클래스를 정의할 수 있다.
//클래스의 접근제한자의 public을 저장한 클래스명을 반드시 표기하여야 한다.
class ObjectClass {

}
public class TestObject{
    //class영역 = 멤버영역 = 전역
    //1. 멤버변수
    int intData = 5678; //멤버변수, 전역변수
    String name = "홍길동";

    //객체생성 = reference변수, 인스턴스
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    Calendar date = Calendar.getInstance();

    //실행문은 멤버영역에 표기할 수 없다. 반드시 메소드내에 사용해야 한다.
    //System.out.println("테스트");  //실행문
    int num = intData + 100;


    //2. 생성자 메소드
    //생성자 메소드명은 클래스명과 같아야한다. 반환형이 없다.
    //매개변수가 없는 생성자 : 기술 안하면 컴파일러(javac.exe)가 추가해줌.
    //객체생성시 한번 실행된다.
    public TestObject(){
        num = num + 5;
    }
    public TestObject(int num){ //클래스 영역에서 선언한 변수는, 메서드에서 똑같은 변수 사용가능
        //this : 현재 클래스
        this.num = num; //this.num(현재 클래스 영역내의 num)=num(지역변수)
    }
    public TestObject(int num, String name){
        this.num = num;
        this.name= name;
        int addr = 5;
    }
    //3. 메소드
    //메소드명은 소문자로 시작한다.
    //()가 있다.
    //반환형이 있어야한다. 반환값이 없을수도 있다.(void)
    //     int a = r.nextInt(100);
    //     int nextInt(int a){실행문}
    void speedUp(){
        //변수선언, 수식, 실행문(if, for, while, switch...)
        num += 10000;
    }
    int speedUp(int step){
        num += step;
        return 9999; //여러개를 리턴하려면 배열에 담아야한다.
    }
    //4. 내부 클래스
    class AAAA{

    }
}
class TestObject2{
    int age = 32;
}
//컴파일이 되면 클래스 갯수만큼 클래스파일 생성됨.
//public이 붙어있는 클래스명으로 파일 생성해야됨. public은 하나만 존재 가능함.
