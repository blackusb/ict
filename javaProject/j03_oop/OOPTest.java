package j03_oop;

public class OOPTest {
    public static void main(String[] args){
        LottoOOP lotto = new LottoOOP();    //객체 만들기
        ModeNum mn = new ModeNum();         //객체 만들기

        do{
            int choice = lotto.getInput("메뉴를 선택하세요(1.최빈수 2.로또번호생성)?");

            if(choice==1) mn.start();               //1을 입력받으면 최빈수 구하기
            else if(choice==2) lotto.startLotto();  //2를 입력받으면 로또번호 생성하기
        }while(true);
    }
}
//다른 클래스에서 기능 가져와서 사용하기 -> 먼저 객체 만들고, 그 안에 있는 기능 가져와서 사용