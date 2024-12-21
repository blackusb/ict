package j04_oop2;
//private 접근제한자
//생성자 메소드, 멤버변수, 메소드
class PrivateTest {
    //멤버변수의 private 접근제한자는 객체를 통하여 변수에 접근할 수 없다.
    //캡슐화. 외부로부터 보호. 객체 외부에서 마음대로 못바꾸게 제한함.
    private int sum;
    //생성자의 private 접근제한자는 객체 생성이 불가하다.(같은 패키지 안에 있더라도)
    //private PrivateTest(){}
    PrivateTest(){  //생성자

    }
    //메소드의 private 접근제한자는 객체를 통하여 호출할 수 없다.
    //private void add(int a, int b){ //메소드
    void add(int a, int b){ //메소드
        sum = a + b;
    }
    void minus(int a, int b){
        sum = a - b;
    }
    //캡슐화된 변수 sum에 접근할 수 있는 메소드를 생성해준다.
    //setter메소드 : 값 변경이 가능한 메소드
    void setSum(int sum){
        this.sum = sum; //멤버변수 sum에 지역변수 sum을 대입.
    }

    //getter : 값 얻을 수 있는 메소드
    //멤버영역에 있는 private 변수 sum의 값을 리턴하는 메소드
    int getSum(){
        return sum;
    }
}