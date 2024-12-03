package j03_oop;

public class StaticTestMain {
    public static void main(String[] args) {
        //static키워드를 표기한 멤버변수는
        //객체를 생성하지 않고 변수를 사용할 수 있다.
        //클래스명.변수명
        System.out.println("StaticTest.num->"+StaticTest.num);

        //static 멤버변수가 아니면 클래스를 객체로 만들어 접근해야 한다.
        //System.out.println("StaticTest.age"+StaticTest.age);
        StaticTest st = new StaticTest();
        System.out.println("st.age="+st.age);
        System.out.println("st.num="+st.num);

        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();

        //객체의 값 변경하기    Math.PI->PI는 static변수    System.in->in은 static 변수
        st.age = 30;
        st.num = 100;   //객체로 접근. //비권장 //num은 static으로 선언했기 때문에 객체를 여러개 만들어도 하나를 공유하고 있음
        StaticTest.num = 200;   //static으로 접근 //권장

        System.out.println("st.num="+st.num+", st.age="+st.age);
        System.out.println("st2.num="+st2.num+", st2.age="+st2.age);
        System.out.println("st3.num="+st3.num+", st3.age="+st3.age);

        //static이 있는 메소드는 객체 생성하지 않고 메소드를 호출할 수 있다.
        StaticTest.plus(10, 20);
        //static이 없는 메소드는 객체를 생성해야 호출 가능하다.
        //StaticTest.minus(20,5);
        st.minus(20, 5);

        String txt = new String("자바");
        String txt2 = txt.trim();    //trim()메소드는 static이 없으므로 객체명.메소드로 써야함
        //String.trim(); -> trim()메소드는 static메소드가 아니므로 클래스명.메소드로 사용할 수 없다. 사용 전 객체 조립해야됨.

        //valueOf()메소드는 static메소드이므로 클래스명.메소드로 호출 가능.
        String txt3 = String.valueOf(100);  //반환값으 String이므로 담아놓아야 함.
    }
}
//객체가 같은 값을 공유하게 할거면 static 선언해서 사용. 정적변수. static 변수
