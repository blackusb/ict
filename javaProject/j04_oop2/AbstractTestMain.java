package j04_oop2;

public class AbstractTestMain extends AbstractTest{
    public AbstractTestMain(){}

    //추상메소드를 오버라이딩  //똑같이 쓰고 abstract를 안쓴다. {} 써야함.
    public int multiple(int a, int b){  //변수명은 달라도됨.
        return a * b;
    }
    //상위 추상메소드는 모두 오버라이딩 해줘야함(ex: 상위의 상위 추상메소드도 해당.)
    public int divide(int a, int b){
        if(b==0) b=1;
        int result = a/b;   // 0/5  5/0->예외(에러)
        return result;
    }
    public static void main(String[] args) {
        //추상클래스인 AbstractTest클래스의 메소드 호출
        //추상클래스를 상속받아 모든 추상메소드를 오버라이딩 해야한다.
        AbstractTestMain atm = new AbstractTestMain();
        System.out.println(atm.plus(30,40));
        System.out.println(atm.minus(10,20));
        System.out.println(atm.multiple(10,5));
        System.out.println(atm.divide(10,0));

        //추상클래스는 객체를 생성하여 사용할 수 없다.
        //AbstractTest at = new AbstractTest();

        //new Scanner(System.in);
        //InputStream클래스는 추상클래스이다.
        //그러므로 객체를 생성할 수 없다.
        //new InputStream();

        AbstractTest at = new AbstractTestMain();
        System.out.println(at.multiple(20,70));
    }
}
//추상메소드 : 이름은 똑같이 쓰고 안에 기능은 너가 알아서해