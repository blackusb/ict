package j09_thread;

public class Bank implements Runnable{
    private int money = 10000; //잔고

    public Bank(){}

    @Override
    //synchronized는 스레드를 동기화 하는 것이고
    //현재 실행중인 run()의 실행문이 완료되어야 다음 스레드가 시작된다.
    //public synchronized void run() {
    public void run(){
        synchronized (this) {
            //한번에 1000씩 10번 출금하기
            for (int i = 1; i <= 10; i++) {
                getCash(1000); //출금
                //잔액이 2000의 배수이면 스레드를 일시정지하기
                if(money%2000==0){
                    try{
                        this.wait();//thread 일시정지 : 동기화 해제
                    }catch(InterruptedException ie){
                        System.out.println(ie.getMessage());
                    }
                }else{
                    this.notify();//thread 동기화 하기
                }
                //일정한 시간동안 일시정지.
                try{
                    Thread.sleep(2000); //2초동안.
                }catch(InterruptedException ii){}
            }
        }
    }

    //출금메소드              출금액
    public void getCash(int cash){
        if(money>=cash){ //잔고확인
            money = money - cash;
            System.out.println(Thread.currentThread().getName()+", 잔액="+money+"원");
        }else{
            System.out.println(Thread.currentThread().getName()+"잔액이 부족합니다.");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        //                                      스레드명
        Thread mother = new Thread(bank, "엄마");
        Thread son = new Thread(bank, "아들");

        mother.start();
        son.start();
    }
}
