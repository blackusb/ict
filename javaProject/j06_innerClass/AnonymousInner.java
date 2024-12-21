package j06_innerClass;

public class AnonymousInner {
    String name = "이순신";
    public AnonymousInner(){    //생성자
        //익명(=클래스명이 없다)의 내부클래스 만들어 사용하기 //클래스명이 없다=파일명이 없다.
        new Employee(){ //객체생성하면서 오버라이딩 메소드 기술
            //오버라이딩 메소드 기술
            public void output(){
                System.out.println("name--->"+name);
            }
        }.output();
    }
    public static void main(String[] args) {
        new AnonymousInner();   //객체 생성
    }
}
//오버라이딩과 비슷
//class파일명 없이 내부클래스파일 생성됨. AnonymousInner$1.class로 생김
