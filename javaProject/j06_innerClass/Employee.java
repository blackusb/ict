package j06_innerClass;

public class Employee {
    private String name = "세종대왕";
    public Employee(){} //생성자
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void output(){
        System.out.println("이름="+name);
    }
}
