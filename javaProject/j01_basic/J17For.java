package j01_basic;

public class J17For {
    public static void main(String[] args){
        //반복문 : for
        /*
            for(초기값; 조건식; 증감연산식){
                조건식이 참일 때 실행됨.
            }
        */
        //증가
        for(int a=11; a<=15; a+=1){  //조건식이 없으면 true임, 증감식이 없으면 a의 값은 그대로.
            System.out.println("반복문 테스트 "+a);
        }
        //감소
        int b=10;
        for(b=10; b>=1; b-=2){
            System.out.println("b="+b);
        }
        System.out.println("b==>"+b);
    }
}
