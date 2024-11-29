package ex_test;

public class Ex1122_3 {
    public static void main(String[] args){
        /*
            대문자를 소문자로 바꾸는 프로그램을 작성하라

            실행
            문자=A
            결과=a
        */

        //문자 A는 십진수로 65이다.
        //문자 a는 십진수로 97이다.
        //97-65=32만큼 문자 A에 더해준다.
        char result = 'A'+32;
        System.out.println(result);

    }
}
