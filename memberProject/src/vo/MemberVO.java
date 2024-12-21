package vo;

public class MemberVO {
    private int num;    //캡슐화.
    private String name;
    private String tel;
    private String email;

    public MemberVO(){}
    public MemberVO(int num, String name, String tel, String email){
        this.num = num;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {  //Object가 가지고 있는 메소드를 오버라이딩함.
        return num + "\t" + name + "\t" + tel + "\t" + email;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
