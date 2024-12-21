package j05_interface;
//interface 클래스는 상속받아 추상메소드를 오버라이딩 해서 사용.
//상속은 클래스명 오른쪽에 implements 키워드로 상속받는다.
//여러개 상속받을 수 있다.(,로 구분)

public class InterfaceMain implements InterfaceTest, InterfaceB {
    int sum;
    public InterfaceMain(){ //생성자

    }
    //상속받은 interface의 모든 추상클래스를 오버라이딩 해야한다.
    @Override
    public void plus(int n1, int n2) {
        sum = n1 + n2;
    }
    @Override
    public void minus(int n1, int n2) {
        sum = n1 - n2;
    }
    @Override
    public int divide(int a, int b) {
        return a/b;
    }
    @Override
    public int multiple(int a, int b) {
        return a*b;
    }
    public static void main(String[] args){
        InterfaceMain im = new InterfaceMain();
        im.plus(12,56);
        System.out.println(InterfaceTest.TITLE+im.sum); //static은 클래스명.변수 이렇게 쓰는 것을 권장함.
        System.out.println(im.TITLE+im.multiple(4,3));

        InterfaceTest it = new InterfaceMain();
        it.plus(10,20);
        it.minus(50,20);

        InterfaceA ia = new InterfaceMain();
        ia.multiple(34,2);

        InterfaceB ib = new InterfaceMain();    //ib.plus, ib.minus는 안됨
        ib.divide(34,32);
        ib.multiple(54,23);

        InterfaceMain im2 = (InterfaceMain)ib;
        im2.plus(32,43);
        im2.minus(43,23);
    }
}