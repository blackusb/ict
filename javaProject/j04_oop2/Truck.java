package j04_oop2;
//                 Car 클래스 상속받기
//                 클래스의 상속은 1개만 받을 수 있다.
public class Truck extends Car{
    int door = 4;
    //상위클래스 Car에 있는 같은 이름의 변수 하위클래서에서 선언할 수 있다.
    String carColor= "red";
    public Truck(){ //생성자
        //상위 클래스의 int a 매개변수를 가진 생성자가 실행되도록 호출하기
        super(20);
        //하위 클래스인 Truck()생성자로 객체를 만들면
        //상위 클래스인 Car클래스의 생성자가 먼저 호촐된다.
        System.out.println("speed="+speed); //0
        System.out.println("carColor="+carColor);   //white x=> red
        System.out.println("MAX="+MAX);     //200
        System.out.println("door="+door);

        //상위클래스의 변수에 접근하기
        //this, this()
        //super 상위클래스
        //super() 상위 클래스의 메소드
        System.out.println("Car.carColor===>"+super.carColor);  //white

        speedUp();  //21
        System.out.println("speedUp()->"+speed);

        //멤버변수 private접근제한자는 상속해주지 않는다.
        //power = "on";

        //메소드의 private접근제한자는 상속해주지 않는다.
        //speedDown();

        speedDown();
    }

    //override : 오버라이딩
    //상속관계에서 상위 클래스의 메소드를 하위 클래스에서 재정의 하는 것을 말한다.
    //오버라이딩시 접근제한자는 달라도 된다. 단, 상위의 메소드보다 범위가 넓은 접근제한자를 표기하여야 한다.
     public void speedUp(){
        speed+=10;
        if(speed>MAX) speed=MAX;
    }
    public void speedDown(){
        speed-=30;
        if(speed<0) speed=0;
    }

    public static void main(String[] args) {
        new Truck();
    }
}
//하위 클래스에서 선언한 변수는