package j09_thread;
//Runnable 인터페이스를 상속받아 run()메소드를 오버라이딩한다.
//현재 클래스를 객체 생성하고, 현재 클래스 객체를 매개변수로 하는 Thread객체를 생성한다.
//Thread객체 안에 있는 start()메소드를 호출
public class ThreastTest2 implements Runnable{
    String title;
    public ThreastTest2() {
    }
    public ThreastTest2(String title){
        this.title = title;
    }
    @Override
    public void run(){
        for(int i=1;;i++){  //무한루프
            System.out.println(title+"--->"+i);
        }
    }

    public static void main(String[] args) {
        ThreastTest2 tt1 = new ThreastTest2("first");
        ThreastTest2 tt2 = new ThreastTest2("second");

        Thread t1 = new Thread(tt1);    //Thread(Runnable target) -> Runnable 타입 변수를 담음
        Thread t2 = new Thread(tt2);

        t1.start();
        t2.start();
    }
}
//하나의 프로그램안에서 여러개가 동작하게 하는 것.
