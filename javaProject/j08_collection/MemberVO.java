package j08_collection;

public class MemberVO {   //VO 클래스, DTO
    private int num;
    private String username;
    private String tel;

    public MemberVO(){}   //매개변수 없는 생성자
    public MemberVO(String username, String tel){ //매개변수 있는 생성자
        this.username = username;
        this.tel = tel;
    }
    public MemberVO(int num, String username, String tel){
        this.num = num;
        this.username = username;
        this.tel = tel;
    }

    //toString() : 메소드 오버라이딩    //상속받은 상위클래스의 메소드 재정의
    @Override   //어노테이션. 없어도 됨.
    public String toString() {
        return num + "\t" + username + "\t" + tel;
    }

    //getter : getUsername(), getTel()
    //setter : setUsername(), setTel()
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}
