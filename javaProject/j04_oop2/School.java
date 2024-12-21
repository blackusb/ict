package j04_oop2;

public class School extends Student{
    String name = "이순신";
    public School(){    //생성자

    }

    //오버라이딩
    public String getName(){
        return super.name+"님";
    }
    public void print(){
        System.out.println("School에 있는 메소드");
    }
    public static void main(String[] args) {
        School sch = new School();
        System.out.println(sch.getName()+", "+sch.getBan());
        sch.print();

        Student stu = new School(); //하위 클래스는 상위 클래스에 대입 가능
        System.out.println(stu.getName()+", "+sch.getBan());
        //하위클래스의 메소드이므로 상위클래스 타입 변수에서 접근할 수 없다.
        //stu.print();
        System.out.println("-------------------------");
        //자동형변환 : 하위클래스 객체를 상위클래스 객체로 대입
        //double a = 455;   -> int형이 double형으로 자동형변환.
        Object obj = new School();

        School sch2 = (School)obj;  //강제 형변환함. Object -> School.
        System.out.println(sch2.getName());
        System.out.println(sch2.getBan());
        sch2.print();



    }
}
