package j04_oop2;
//import java.lang.*;
//public Car();
//extends Object    //최상위 클래스이다.
public class Car extends Object{    //extends Object -> 안적어도 자바가상머신이 자동으로 생성함
    int speed;  //현재속도
    String carColor = "white";  //차 색상
    final int MAX = 200;
    //상위 클래스인 Car에서 매개변수가 있는 생성자만 있고,
    //매개변수 없는 생성자는 없다면 에러가 발생한다.
    private String power = "off";
    public Car(){
        System.out.println("Car()생성자");
        System.out.println("Car.carColor="+carColor);
    }
    public Car(int speed){
        this.speed = speed;
    }
    public void speedUp(){
        speed++;
        if(speed>MAX) speed=MAX;
    }
    private void speedDown(){
        speed--;
        if(speed<0) speed=0;
    }
}
