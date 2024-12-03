package j00_api;

public class StringBufferTest {
    public StringBufferTest(){
        start();
    }
    public void start(){
        //StringBuffer(동기화), StringBuilder(비동기화)
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(60);
        StringBuffer sb3 = new StringBuffer("StringBuffer를 이용한 문자열 처리 테스트중");

        //index 6번째 위치에 문자열 추가. 그 자리의 문자열은 뒤로 밀린다.
        sb3.insert(6, "스트링버퍼추가(insert)테스트");
        sb3.append("마지막 문자열 추가");
        //0123456 78 90
        //String스트링버퍼추가(insert)테스트Buffer를 이용한 문자열 처리 테스트중마지막 문자열 추가
        sb3.delete(6,9);    //index6번부터 9번 앞까지 삭제
        //String버퍼추가(insert)테스트Buffer를 이용한 문자열 처리 테스트중마지막 문자열 추가
        sb3.reverse();

        System.out.println(sb.capacity()+", "+sb2.capacity()+", "+sb3.capacity());  //몇바이트를 확보하고 있는지 확인
        System.out.println(sb3.toString());
    }
    public static void main(String[] args) {
        new StringBufferTest();
    }
}
//String은 값이 바뀌면 기존 값을 버리고 새로운 값이 저장됨
//StringBuffer, StringBuilder는 기존 값을 버리지 않고 새로운 값이 추가로 저장됨.
//StringBuffer, StringBuilder는 공간이 부족하면 자동으로 늘어남