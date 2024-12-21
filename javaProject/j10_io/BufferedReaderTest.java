package j10_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    public BufferedReaderTest(){}
    public void start(){
        //BufferedReader는 입력한 값을 버퍼에 보관 후 읽기를 하면
        //enter를 구분기호로 한 줄 읽어 리턴해준다.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            String inData = br.readLine();  //버퍼에서 한 줄 읽어서 String으로 리턴해줌.
            System.out.println(inData);
        }catch(IOException ie){
            System.out.println(ie.getMessage());
        }
    }

    public static void main(String[] args) {
        new BufferedReaderTest().start();
    }
}