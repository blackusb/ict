package j02_array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //콘솔에서 3과목의 점수를 입력받아 총점, 평균, 학점을 구하라
        //3과목의 점수, 총점, 평균은 배열에 저장한다.
        //제목이 담긴 배열
        String title[] = {"국어","영어","수학","과학"};
        //각 과목의 점수, 총점, 평균을 담을 변수
        //int jumsu[] = new int[5];   //5개의 방이 만들어짐
        int jumsu[] = new int[title.length+2];

        //점수 입력
        for(int i=0; i<title.length; i++){  //0,1,2
            System.out.print(title[i]+"=");
            jumsu[i] = scan.nextInt();
        }
        //총점 구하기
        for(int i=0; i<title.length; i++){  //0,1,2
            //jumsu[3] += jumsu[i];
            jumsu[title.length] += jumsu[i];
        }
        System.out.println("총점="+jumsu[title.length]);
        //평균 구하기
        jumsu[title.length+1] = jumsu[title.length] / title.length;
        System.out.println("평균="+jumsu[title.length+1]);
    }
}
/*
    실행
    국어=65
    영어=33
    수학=77
    총점=__
    평균=__
    학점=_    //학점 기준은 100점만점
*/