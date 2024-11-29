package j01_basic;

import java.util.Scanner;

public class J08IfEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //메뉴를 입력받아 메뉴가 1이면 사각형의 넓이, 2이면 원의 넓이를 구하는 프로그램을 작성하라

        //메뉴선택
        System.out.print("원하는 메뉴를 선택하시오(1.사각형의 넓이, 2.원의 넓이)=>");
        int menu = sc.nextInt();

        if(menu==1){    //사각형의 넓이
            System.out.print("가로(밑변)=");
            int w = sc.nextInt();
            System.out.print("세로(높이)=");
            int h = sc.nextInt();

            int rect = w * h;
            System.out.println("사각형의 넓이="+rect);
        }
        if(menu==2){    //원의 넓이
            System.out.print("반지름=");
            int radius = sc.nextInt();
            if(radius>0){
                //double circle = radius * radius * 3.141592;
                //                                Math클래스의 멤버(전역)변수
                double circle = radius * radius * Math.PI;
                System.out.println("원의 넓이="+circle);
            }
        }
    }
}
