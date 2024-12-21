package j08_collection;

import java.util.Properties;

public class PropertiesTest {
    public PropertiesTest(){}
    public void start(){
        //key, value를 문자열로 표기해야함. String만 가능.
        Properties prop = new Properties();

        prop.setProperty("/", "index.html");    //("접속주소", "실제 실행되는 파일명") 이런식으로 많이 사용. 보통 jsp. 프레임워크에서는 자동으로 해줌.
        prop.setProperty("/board/list","notice/viewlist.html");
        prop.setProperty("/memeber/user","register/for.html");

        System.out.println(prop.getProperty("/board/list"));    //키 값을 넣으면 value값 출력됨.

    }

    public static void main(String[] args){
        new PropertiesTest().start();
    }
}
