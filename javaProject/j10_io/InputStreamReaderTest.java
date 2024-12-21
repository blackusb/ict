package j10_io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public InputStreamReaderTest(){}
    public void start(){
        InputStreamReader isr = new InputStreamReader(System.in);
        try{
            while(true){
//              int c = isr.read();
//              if(c==10) break;
//              System.out.println(c+"->"+(char)c+", "+String.valueOf(c));

                //read(char[] cbuf, int offset, int length)
                //상위클래스에 read(char[] cbuf)가 있어서 매개변수 하나만 쓰는 것도 가능함.
                char[] cArr = new char[10];
                int cnt = isr.read(cArr, 2, 5); //index 2부터 5개를 저장.
                System.out.println(cnt + "-->" + new String(cArr));
            }
        }catch(IOException ie){
            System.out.println(ie.getMessage());
        }
    }

    public static void main(String[] args){
        new InputStreamReaderTest().start();
    }
}
