package j04_oop2;

import j03_oop.ProtectedTest;   //패키지가 다르므로 import해줘야 함.

public class ProtectedMain extends ProtectedTest {
    ProtectedMain(){    //생성자

    }
    public static void main(String[] args){
        ProtectedMain pm = new ProtectedMain();
        //ProtectedTest()->생성자메소드 앞에는 default이므로 다른 패키지에서 불가
        //생성자가 다른 패키지일 경우 public 이상의 제한자여야한다.
        //protected는 같은 패키지에서는 접근이 허용된다.
        //            다른 패키지에서는 상속받아 사용해야한다.
        //ProtectedTest pt = new ProtectedTest();
        System.out.println(pm.type);

        pm.setType(5);
        System.out.println(pm.type);
    }
}
//인스턴스 : 객체형 변수