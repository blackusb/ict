package j10_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterTest {
    public FileWriterTest(){}
    public void writeStart(){
        //콘솔에서 문자열을 입력받아 파일로 쓰기
        //콘솔 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //버퍼드리더 -> 한줄씩 읽어오기
        //쓰기할 파일 객체
        File f = new File("D://test/FW.txt");
        FileWriter fw = null;

        try{
            fw = new FileWriter(f);

            //입력
            System.out.print("문자열 입력->");
            String inData = br.readLine();

            //파일 쓰기
            fw.write(inData);
            fw.close(); //파일은 쓰고 나면 닫기 해주기.
            System.out.println("파일로 쓰기 완료");
        }catch(Exception e){
            System.out.println("입출력예외 : "+e.getMessage());
        }
    }

    public static void main(String[] args){
        new FileWriterTest().writeStart();
    }
}
