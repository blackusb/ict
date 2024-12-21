package j00_api;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        //String클래스 : 문자열을 가질 수 있는 클래스이며,
        //              기본데이터형처럼 사용할 수 있는 특수클래스

        String name1 = "홍길동";
        String name2 = "홍길동";
        if(name1 == name2){
            System.out.println("name1과 name2는 같다");
        }else{
            System.out.println("name1과 name2는 다르다");
        }

        //                             index: 0,1,2,3
        String username1 = new String("세종대왕 ABCD.. ");
        String username2 = new String("세종대왕");
        //if(username1 == username2){   //기본데이터 타입에서만 비교, 스택에 있는 주소를 비교하게됨->다르다고 나옴. //데이터값은 힙에 저장됨
        if(username1.equals(username2)){    //데이터를 비교.
            System.out.println("username1과 username2는 같다");
        }else{
            System.out.println("username1과 username2는 다르다");
        }

        //charAt() : 문자열에서 특정 위치(index)의 문자를 얻어오기
        char r1 = username1.charAt(1);
        System.out.println("charAt()="+r1);
        byte r2[] = username1.getBytes();   //각 문자의 코드값을 배열로 구해준다.  //통신할 때 필요
        System.out.println("getBytes()="+ Arrays.toString(r2)); //한글은 5만정도 되서 계속 돌다가 멈춤.

        //특정문자의 위치를 확인. 있으면 index, 없으면 -1 출력됨.
        int r3 = username1.indexOf("대왕5");
        System.out.println("indexOf()="+r3);

        //문자의 갯수를 구하여 int형으로 리턴한다.
        int r4 = username1.length();
        System.out.println("length()="+r4);


        ///////////////
        String text = "Java Programing TEST";

        //"Java"->"자바"로 변경
        text = text.replaceAll("Java", "자바");
        System.out.println("replaceAll()="+text);

        //문자열의 일부 문자열을 얻어오기
        //  0 123456789
        //  자바 Programing test
        String r5 = text.substring(3);  //index 3의 위치부터 끝까지의 문자열을 리턴
        String r6 = text.substring(3,8);    //index 3부터 index 8 앞까지의 문자열 리턴
        System.out.println("substring=>"+r5+", "+r6);

        System.out.println("toLowerCase()=>"+text.toLowerCase());   //대문자 소문자로
        System.out.println("toUpperCase()=>"+text.toUpperCase());   //소문자 대문자로

        String str = "    Java Class      Test    ";
        System.out.println("trim()=>"+str.trim()+"-");  //양쪽의 공백문자를 제거한다

        //scan.nextInt() -> 문자로 -> 숫자로 변환

        //"1234"->1234      4567->"4567"

        int n1 = 4567;
        String r7 = n1 + "";    //숫자+문자=연결(문자)
        String r8 = String.valueOf(n1);     //static이 붙어있으면 객체 안만들고 바로 사용 가능. ex : 객체.valueof();

        String s1 = "hong";
        String s2 = "Hong";

        //compareTo() : 대소문자 구별함
        //compareToIgnoreCase() : 대소문자 구별안함
        //if(s1.compareTo(s2) > 0){   //'홍'-'김'   가~힣 > a-z > A-Z > 0-9
        if(s1.compareToIgnoreCase(s2) > 0){
            System.out.println(s2+"가(이) 작은 글자이다.");
        }else{
            System.out.println(s1+"가(이) 작은 글자이다.");
        }


    }
}
