package j05_interface;
//인테페이스가 인테페이스를 상속할 때는 extends 상속받고,
//1개의 인터페이스만 상속발을 수 있다.
public interface InterfaceB extends InterfaceA{
    public int divide(int a, int b);
}
