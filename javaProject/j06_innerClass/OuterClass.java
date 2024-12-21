package j06_innerClass;
//내부클래스
//1. 클래스영역(=멤버영역)에 선언한 클래스
//2. 메소드영역에 선언한 클래스
//3. 익명의 내부클래스
public class OuterClass {
    int num = 1000;
    String name = "홍길동";
    String addr = "서울시 성동구 아차산로";
    public OuterClass(){    //생성자
        //output(); //내부클래스의 메소드는 바로 사용 불가. 내부클래스 객체 생성후 호출해야함.
        //내부클래스 객체 생성
        InnerClass ic2 = new InnerClass();
        ic2.output();
    }
    public void print(){
        System.out.println("name="+name);
        System.out.println("addr="+addr);
    }
    //내부클래스 : 클래스영역
    class InnerClass{
        int num = 2000;
        String name = "이순신";
        String tel = "010-1234-5678";
        InnerClass(){}  //생성자
        void output(){
            //내부클래스에서 외부클래스에 있는 멤버변수에 접근할 수 있다.
            System.out.println(num+", "+name+", "+tel+", "+addr);
            print();    //외부클래스에 있는 메소드 사용.
        }
    }

    public static void main(String[] args){
        //내부클래스 객체 생성하는 방법
        //외부클래스 객체 먼저 생성 -> 외부클래스 객체명.내부클래스로 내부클래스 생성.
        OuterClass oc = new OuterClass();
        InnerClass ic = oc.new InnerClass();

        InnerClass oc2 = new OuterClass().new InnerClass(); //위 두 줄과 동일함.

        ic.output();
    }
}
