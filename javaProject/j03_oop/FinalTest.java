package j03_oop;

public class FinalTest {
    //final은 멤버변수, 메소드, 클래스에 표기할 수 있다.
    //멤버변수는 데이터형 왼쪽에 표시, 한 번 값이 대입되면 다른 값으로 변경할 수 없다.
    //메소드는 반환형 왼쪽에 표시, 오버라이딩 불가
    //클래스는 class 키워드 왼쪽에 표시, 상속 불가

    final int MAX = 100;    //final 상수, 변수명을 모두 대문자로 표기한다.
    final int MIN = 50;
    int middle = 5;

    public FinalTest(){
        //MAX = 200;    //상수화된 변수는 바꿀 수 없다.
        middle = 15;

        int a =521;
        //오토박싱(autoBoxing) : int형 데이터를 Integer클래스로 변환하여 대입해준다. 자바버전 1.5이상 가능
        //Integer a2 = new Integer(a);  //사용불가. 자바버전 1.5미만에서 가능
        Integer a2 = a; //이렇게 써야함. 자바가상머신이 자동으로 변환.

        //오토언박싱 : Integer형 데이터를 int형으로 변환하여 대입해준다.
        int b = a2;

        System.out.println(Integer.MAX_VALUE);  //API에서 static 붙어있으므로, 객체 안만들고 바로 사용가능.
        System.out.println(a2.MAX_VALUE);       //a2는 객체이므로, 기본데이터형인 b와는 다르다.
        //System.out.println(b.MAX_VALUE);  //b는 객체가 아니므로, 이렇게 사용할 수 없다.


        String c = "1234";  //->정수, 실수로 바꾸려면
        String d = a+"";    //숫자+문자->문자

        //int e = Integer.parseInt(c); 사용가능 //integer로 반환
        int e = Integer.valueOf(c); //c="1234"를 정수,실수로 바꾼다. //int로 반환
        System.out.println(e+1000);
        System.out.println(Integer.reverse(e+1000));

    }
    public static void main(String[] args) {
        new FinalTest();
    }
}
