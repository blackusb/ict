package j09_thread;
//Thread 처리가 되는 클래스 생성규칙
//1. Thread클래스를 상속받아 run()메소드를 오버라이딩한다.
//2. Thread를 상속받은 run()을 오버라이딩한 클래스를 객체로 안들어 start()메소드를 호출하면 Thread가 구현된다.

public class ThreadTest1 extends Thread{
    String msg;
    public ThreadTest1(){}
    public ThreadTest1(String msg){
        this.msg = msg;
    }
    public void run(){  //run() -> 이름 바꾸면 안됨. 정해져있음.
        int s = 0;
        int i = 0;
        while(true){
            i += 1;
            s += 1;
            System.out.println(msg+"-->1~"+i+"까지의 합은 "+s);
        }
    }

    public static void main(String[] args) {
        ThreadTest1 tt1 = new ThreadTest1("첫번째 스레드");
        ThreadTest1 tt2 = new ThreadTest1("두번째 스레드");
        ThreadTest1 tt3 = new ThreadTest1("세번째 스레드");

        tt1.start();    //현재 스레드를 스래드 스케쥴러에 등록.
        tt2.start();
        tt3.start();

    }
}
