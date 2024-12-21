package j05_interface;

//일반메소드, 멤버변수 표기할 수 없다.
public interface InterfaceTest {
    //static final 멤버변수
    public static final int MAX = 100;
    public static final String TITLE = "제목";

    //추상메소드 : 실행부가 없다.
    public void plus(int n1, int n2);
    public void minus(int n1, int n2);
}
