package j06_innerClass;

public class MethodInnerClass {
    int num = 10;
    String email = "abc@nate.com";
    public MethodInnerClass(){  //생성자

    }
    public void memberOutput(){
        System.out.println(num+"-->"+email);
    }
    public void createMethodInner(){
        //내부클래스 생성하기
        class Member{
            int num = 20;
            String name = "안중근";
            Member(){}  //생성자
            void memberPrint(){
                System.out.println(num+"==>"+name+"==>"+email);
            }
        }
        //내부클래스 작성 이후에 내부클래스 객체 생성해야함.
        Member member = new Member();
        member.memberPrint();
    }
    public static void main(String[] args) {
        MethodInnerClass mic = new MethodInnerClass();
        mic.createMethodInner();
    }
}
