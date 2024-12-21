package j10_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public FileCopy(){}
    public void start(){
        //원본파일 : D://test/01.jpeg
        //타켓파일 : D://test/a1/cat.jpeg

        try{
            FileInputStream org = new FileInputStream("d://test/01.jpeg");
            FileOutputStream tar = new FileOutputStream("d://test/a1/cat.jpeg");

            while(true){
                int r = org.read();
                if(r==-1) break;
                tar.write(r);
            }
            org.close();    //파일 사용했으면 닫기.
            tar.close();
            System.out.println("파일 복사완료");
        }catch(FileNotFoundException fe){
            System.out.println("파일이 없다.");
        }catch(IOException ie){
            System.out.println("읽기/쓰기 예외 발생.."+ie.getMessage());
        }
    }

    public static void main(String[] args){
        new FileCopy().start();
    }
}
