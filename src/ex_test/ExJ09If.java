package ex_test;

import java.util.Scanner;

public class ExJ09If {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //대학을 졸업하기 위해서는 최소 140학점을 이수하여야 한다. 이수한 학점 중 전공은 70학점 이상이
        //어야 하며, 교양과 일반은 각각 30학점 이상이거나 총점이 80학점 이상이어야 한다. 이수한 학점을
        //각각 입력 받아 졸업여부를 출력하는 프로그램을 작성하라.

        //점수 입력받기
        System.out.print("전공 이수 학점=");
        int major = sc.nextInt();
        System.out.print("교양 이수 학점=");
        int liberal = sc.nextInt();
        System.out.print("일반 이수 학점=");
        int general = sc.nextInt();

        //계산
        //최소학점 140학점 이상일 때
        if(major + liberal + general >=140){
            //전공 70학점 이상
            if(major >= 70){
                //교양,일반 각각 30학점 이상 : 졸업가능
                if(liberal >= 30 && general >= 30){
                    System.out.println("졸업가능");
                }
                //교양, 일반 중 하나라도 30학점 미만
                if(liberal < 30 || general <30){
                    //교양+일반 80학점 이상 : 졸업가능
                    if(liberal + general >= 80){
                        System.out.println("졸업가능");
                    }
                    //교양+일반 80학점 미만 : 졸업불가
                    if(liberal + general < 80){
                        System.out.println("졸업불가");
                    }
                }
            }
            //전공 70학점 미만 : 졸업불가
            if(major < 70){
                System.out.println("졸업불가");
            }
        }
        //최소학점 140학점 미만일 때 : 졸업불가
        if(major + liberal + general < 140){
            System.out.println("졸업불가");
        }
    }
}
