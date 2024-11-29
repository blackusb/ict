package j01_basic;

import java.util.Scanner;

public class J09IfEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //대학을 졸업하기 위해서는 최소 140학점을 이수하여야 한다. 이수한 학점 중 전공은 70학점 이상이
        //어야 하며, 교양과 일반은 각각 30학점 이상이거나 총점이 80학점 이상이어야 한다. 이수한 학점을
        //각각 입력 받아 졸업여부를 출력하는 프로그램을 작성하라.

        //기본 점수 입력
        System.out.print("전공 이수 학점=");
        int major = sc.nextInt();
        System.out.print("교양 이수 학점=");
        int liberal = sc.nextInt();
        System.out.print("일반 이수 학점=");
        int general = sc.nextInt();

        int total = major + liberal + general;
        if(total>=140 && major>=70 && (liberal>=30 && general>=30 || liberal+general>=80)){
            System.out.println("졸업가능");
        }

    }
}
