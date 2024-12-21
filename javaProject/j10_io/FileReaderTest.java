package j10_io;

import java.io.*;

public class FileReaderTest {
    public FileReaderTest(){}
    public void start(){
        try{
            //파일의 내용을 문자단위로 읽어오기.
            //          드라이브명, 폴더, 파일명
            //FileReader(String fileName)
            FileReader fr = new FileReader("d://test/Bank.java");   //d:\\test\Bank.java    \ -> 이거는 \n \t 등 기능이 있어서 / 이거로 사용.
            while(true){
                int charCode = fr.read();   //한글자씩 읽는 메소드.
                if(charCode==-1) break; //read할 데이터가 없으면 -1이 읽힘.
                System.out.print((char)charCode);
            }
            System.out.println("\n==========================================================");

            //-----파일의 내용을 버퍼에 담아 1줄씩 읽어오기-------------------------------------------------------
            fr = new FileReader("d://test/Bank.java");
            BufferedReader br = new BufferedReader(fr);

            while(true){
                String inData = br.readLine();  //한 줄 읽어서 String으로 리턴. enter가 읽을 범위를 말한다. enter는 내용에 포함되지 않는다.
                if(inData==null) break;
                System.out.println(inData);
            }

            System.out.println("=======================한번에 읽어오기==========================");
            File f = new File("d://sql/mysql_08_DML.sql");
            char[] readData = new char[(int)f.length()];
            FileReader fr2 = new FileReader(f);
            int size = fr2.read(readData);
            System.out.println(String.valueOf(readData, 0, size));

        }catch(FileNotFoundException fnfe){
            System.out.println("파일이 없어요.");
        }catch(IOException ie){
            System.out.println("입력예외 발생함.");
        }

    }
    public static void main(String[] args){
        new FileReaderTest().start();
    }
}

//객체 생성해서 변수에 담고, 읽어오는 메소드 사용.