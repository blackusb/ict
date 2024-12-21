package j03_oop;

public class ConstructorTest {
    int n;  //멤버변수는 초기값을 안주면 알아서 들어감. 정수=0, 실수=0.0, 논리=false, 문자형, 객체형=null
    String str;
    public ConstructorTest(){
        //1. 생성자메서드 내에서 다른 생성자 메소드를 호출할 때
        //2. this()를 이용하여 다른 생성자를 호출시 처음 실행문이여야 한다.
        this(100, "홍길동"); //현재 클래스의 생성자메서드, this는 현재 클래스를 가리킴.
        //this.n = 100;   //()안에 지역변수가 없기 때문에 this 쓰던안쓰던 상관 없음
        //this.str = "홍길동";
        System.out.println("ConstructorTest()생성자 실행됨");
    }
    public ConstructorTest(int n){
        this(n, "이순신");
        //this.n = n;
        //this.str = "이순신";
        System.out.println("ConstructorTest(int)생성자 실행됨");
    }
    public ConstructorTest(int n, String str){
        this.n = n;
        this.str = str;
        System.out.println("ConstructorTest(int, String)생성자 실행됨");
    }
    public String toString(){   //오버라이딩
        //this(); //this()는 생성자메소드내에서만 가능하다.
        return "n="+n+", str="+str;
    }

    public static void main(String[] args) {
        ConstructorTest ct1 = new ConstructorTest();
        ConstructorTest ct2 = new ConstructorTest(200);
        ConstructorTest ct3 = new ConstructorTest(300, "세종대왕");

        System.out.println(ct1.toString());
        System.out.println(ct2.toString());
        System.out.println(ct3.toString());
    }
}
