package j00_api;

public class MathTest {
    public static void main(String[] args){
        //Math클래스 : 수학관련기능을 만들어 놓은 클래스
        //              Math.PI
        System.out.println("abs()=>"+Math.abs(-20));   //절대치
        System.out.println("ceil()=>"+Math.ceil(52.1)+", "+Math.ceil(-9.2));      //올림
        System.out.println("floor()=>"+Math.floor(53.9)+", "+Math.floor(-6.5));   //내림
        System.out.println("round()=>"+Math.round(56.5));   //반올림
        System.out.println("max()=>"+Math.max(56,24)+", min()=>"+Math.min(56,24)); //큰 값, 작은 값
        System.out.println("sqrt()=>"+Math.sqrt(10));   //루트값
        System.out.println("pow()=>"+Math.pow(5, 6));   //제곱값 구하기. 5의 6제곱.

        //random() : 난수 생성하기
        //           0.0~0.9999999999999999
        for(int i=1; i<=1000; i++){
            //int ran = (int)(Math.random() * 5);    //10 곱하면 0~9 값이 나옴, 100 곱하면 0~99 값이 나옴, 5 곱하면 0~4
            //int ran = (int)(Math.random() * 10)+1;      //1을 더하면 10->1~10, 100->1~100, 5->1~5

            //(정수화)(난수*(큰수-작은수+1))+작은수 -> 내가 원하는 숫자 범위 구하는 공식
            int ran = (int)(Math.random()*(45-25+1))+25;    //25~45

            System.out.print(ran+"\t");
            if(i%10==0) System.out.println();
        }
    }
}
