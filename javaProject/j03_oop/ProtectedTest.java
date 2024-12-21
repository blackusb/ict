package j03_oop;

public class ProtectedTest {
    //변수
    protected int type = 1;
    //생성자메소드
    protected ProtectedTest(){
        type = 2;
    }
    //메소드
    protected void setType(int type){
        this.type = type;
    }
}
