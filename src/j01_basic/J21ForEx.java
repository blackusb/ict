package j01_basic;


import java.util.Scanner;

public class J21ForEx {
    public static void main(String[] args){
        //2개의 정수를 입력받아 큰 수만 출력하라.
        Scanner sc = new Scanner(System.in);

        for(;;){ //()안에 아무것도 안써도 됨=> 무한반복.
            System.out.print("첫번째 수=");
            int num1 = sc.nextInt();
            System.out.print("두번째 수=");
            int num2 = sc.nextInt();

            if(num1 > num2){
                System.out.println("큰 수는 "+num1);
            }else if(num1 < num2){
                System.out.println("큰 수는 "+num2);
            }else{
                System.out.println("두 수는 같습니다.");
            }
        }
    }
}
/*
    실행
    첫번째 수=5
    두번째 수=8
    큰 수는 8
    첫번째 수=54
    두번째 수=21
    큰 수는 54
    첫번째 수=
    두번째 수=
    .
    .
    .

*/