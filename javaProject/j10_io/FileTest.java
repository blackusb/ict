package j10_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {
    public FileTest(){}
    public void start(){
        //File : 드라이브명, 경로, 파일명 등으로 객체를 생성하면
        //       파일크기(byte), 마지막 저장 날짜, 파일의 경로, 파일명등
        //       파일에 대한 정보를 얻을 수 있다.

        File f1 = new File("d:/");
        File f2 = new File("d://test");
        File f3 = new File("d://test/Bank.java");
        File f4 = new File(f2, "mysql_02_select.sql");
        File f5 = new File("d://test", "Bank.java");

        long bytes = f3.length();
        System.out.println("length()="+bytes);

        File f6 = new File("d://test/a1/b1");   //mkdirs() 사용.
        boolean result = f6.mkdirs();
        System.out.println("result="+result);

        //파일 존재 유무
        System.out.println("exists()->"+f5.exists());   //없는 파일을 객체 생성하면 오류x, 사용할 때 오류o

        //마지막 수정일
        long lastModified = f5.lastModified();   //밀리초로 반환.
        System.out.println("마지막 수정일 : "+lastModified);

        Calendar date = Calendar.getInstance(); //현재 2024-12-16 14:57:33
        date.setTimeInMillis(lastModified);  //2024-12-12 15:29

        SimpleDateFormat frm = new SimpleDateFormat("MM월 dd일 HH시 mm분 a");
        String dateResult = frm.format(date.getTime());
        System.out.println("마지막 수정일 : "+dateResult);

        File f7 = new File("C://");

        File[] list = f7.listFiles();
        for(File l:list){
            String name = l.getName();  //경로, 파일명
            String path = l.getPath();  //드라이브 + 경로 + 파일명
            //getParent() : 경로
            //getAbsoultePath() : 경로 + 파일명
            //System.out.println(path);
            if(l.isFile()){ //파일명
                System.out.print(path+"[파일]");
            }else{  //폴더일때
                System.out.print(path+"[폴더]");
            }
            if(l.isHidden()) System.out.println("[숨김파일]");
            else System.out.println();
        }

        //현재 컴퓨터의 드라이브 목록을 구한다.
        File[] drive = File.listRoots();
        for(File d:drive){
            System.out.println(d.getPath());
        }

        //파일 삭제
        f4.delete();
    }

    public static void main(String[] args) {
        new FileTest().start();
    }
}
