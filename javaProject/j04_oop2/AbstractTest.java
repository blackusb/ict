package j04_oop2;
//추상메소드를 1개이상 포함한 경우 추상클래스가 된다.
//추상클래스는 class 왼쪽에 abstract를 표기해야 한다.
public abstract class AbstractTest extends AbstractSuper{
    public AbstractTest(){} //생성자
    public int plus(int a, int b){
        return a + b;
    }
    public int minus(int a, int b){
        return a - b;
    }
    //곱하기
    //추상메소드는 정의를 하고 '실행부'가 없다. {}생략
    //추상메소드는 반환형 왼쪽에 abstract 표기해야함.
    public abstract int multiple(int a, int b);
}