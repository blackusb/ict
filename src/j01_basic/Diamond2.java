package j01_basic;

import java.util.Scanner;

public class Diamond2 {
    //1. 멤버변수
    Scanner scan = new Scanner(System.in);

    //2. 생성자 메소드 : 객체가 생성될때 한번 실행됨
    public Diamond2(){   //클래스이름과 동일함

    }

    //3. 메소드
    void startDiamond(){
        int size = getMaxSize();    //홀수 입력
        System.out.println("size="+size);

        if(size%2==0) size--;   //입력값이 짝수이면 홀수로 바꾸기

        diamondPaint(size); //메소드 호출
    }
    //다이아몬드 만들기 //한번에 다이아몬드 만들기
    void diamondPaint(int size){
        char alpha = 'A';
        //삼각형
        for(int i=1; i<=size; i+=2){    //i=1,3,5,7,9,11...
            //공백출력
            for(int s=1; s<=(size-i)/2; s++){
                System.out.print(" ");
            }
            //문자출력
            for(int j=1; j<=i; j++){
                System.out.print(alpha++);  //++가 뒤에 있어야 A를 먼저 찍고 ++함.
                if(alpha>'Z') alpha = 'A';
            }
            System.out.println();
        }
        //역삼각형
        for(int i=size-2; i>=1; i-=2){  //i=....9,7,5,3,1
            //공백출력
            for(int s=1; s<=(size-i)/2; s++){
                System.out.print(" ");
            }
            //문자출력
            for(int j=1; j<=i; j++){
                System.out.print(alpha++);
                if(alpha>'Z') alpha = 'A';
            }
            System.out.println();
        }
    }
    //다이아몬드 최대 글자수 입력받기
    int getMaxSize(){
        System.out.print("임의의 홀수 입력(1~49)=");
        int maxSize = scan.nextInt();
        return maxSize;
    }

    public static void main(String[] args) {    //컴파일 하려면 메인메소드가 있어야함
        Diamond2 diamond = new Diamond2();    //내가 원하는 기능이 있는 클래스를 객체로 만들기.
        diamond.startDiamond(); //내가 필요한 메소드를 호출.
    }
}
//멤버변수 안에 적힌건 main메소드에서 바로 못씀. 2,3번 메소드에서는 사용가능
