package j10_io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {
    public InputStreamTest(){}
    public void start(){
        //InputStream : byte단위로 입력한다.
        //InputStream은 추상클래스이므로 상속받아 오버라이딩 해준다.
        //이미 객체를 생성해 놓은 System.in 사용한다. System 클래스 안에 in 변수를 사용. static이다.
        try{
            InputStream is = System.in; //InputStream 추상클래스여서 new로 객체 생성 불가.
//            do{
//                int data = is.read();   //읽을 데이터가 없으면 -1이 읽어짐.
//                System.out.println(data+", 입력한 값="+(char)data);
//            }while(true);
            byte[] a = new byte[10];
            int c = is.read(a); //입력받은 데이터의 갯수. 배열에 저장
            System.out.println(c);
            System.out.println(Arrays.toString(a));
            System.out.println(new String(a, 0, c-1));  //엔터 배줘야해서 c에서 -1해줌.

        }catch(IOException i){
            System.out.println("예외발생-->"+i.getMessage());
        }
    }

    public static void main(String[] args) {
        new InputStreamTest().start();
    }
}
