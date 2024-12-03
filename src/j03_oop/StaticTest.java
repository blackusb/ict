package j03_oop;

public class StaticTest {
    //static은 멤버변수, 메소드에 기술한다.
    static int num = 10;    //멤버변수
    int age = 20;

    //멤버영역에 실행문을 기술하기 위해서는 static{} 블럭 안에 기술하면된다.
    //객체 조립시 제일 먼저 실행됨
    static{
        for(int i=1; i<=5; i++){
            System.out.println("i="+i);
        }
    }

    public StaticTest(){    //생성자 메소드
        System.out.println("StaticTest()");
    }
    static void plus(int a, int b){    //일반 메소드
        //static으로 호출된 메소드는 객체 생성이 안된 멤버변수를 접근할 수 없다. static 멤버변수는 접근 가능.
        //System.out.println(num+", "+age);
        System.out.printf("%d + %d = %d\n",a,b,a+b);
    }
    void minus(int a, int b){
        System.out.printf("%d - %d = %d\n",a,b,a-b);
    }
}
