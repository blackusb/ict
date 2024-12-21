package j04_oop2;

import j03_oop.ModeNum;

public class ModifierTest {

    public static void main(String[] args) {
        ModeNum mn = new ModeNum(); //생성자 앞에 public 붙어있어서 객체 만들수있음.
        mn.start();
        //mn.createRandom();
        System.out.println(mn.data);

        PrivateTest pt = new PrivateTest(); //객체 만들고

        pt.add(50, 100);              //메소드 호출
        //System.out.println(pt.sum);         //실행
        //sum의 값을 2000으로 변경하기
        pt.setSum(2000);
        System.out.println(pt.getSum());
    }
}
//접근제한자를 안쓰면 default임.
//필드=멤버변수
