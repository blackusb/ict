package j04_oop2;

//final : 클래스, 멤버변수, 메소드에 정의할 수 있다.
//클래스 : final클래스는 상속되지 않는다.
//메소드 : final메소드는 오버라이딩 할 수 없다.

//public final class Student {
public class Student {
    String name = "홍길동";
    int ban = 3;

    public Student(){   //생성자

    }
    //public final String getName(){
    public String getName(){
        return name;
    }
    public int getBan(){
        return ban;
    }
}
