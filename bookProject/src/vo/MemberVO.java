package vo;

public class MemberVO {
    private int num;
    private String name;
    private String memberId;
    private String memberPw;
    private String phone;
    private String email;

    public MemberVO(){}
    public MemberVO(int num, String name, String memberId, String memberPw, String phone, String email){
        this.num = num;
        this.name = name;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return num+"\t"+name+"\t"+ memberId +"\t"+ memberPw +"\t"+phone+"\t"+email;
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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
