package javaTestProject;

import java.util.Arrays;
import java.util.Random;

public class Question1 {
    public Question1(){}
    public void start(){
        Random ran = new Random();

        int nansu[] = new int[10];  //난수 10개가 들어갈 배열 준비

        for(int i=0; i<nansu.length; i++){
            nansu[i] = ran.nextInt(100)+1;  //1~100사이의 난수 생성해서 배열에 담기
            //System.out.print(nansu[i]+"\t");
        }
        System.out.println("=================정렬전==================");
        System.out.println(Arrays.toString(nansu));

        System.out.println("=================정렬후==================");
        Arrays.sort(nansu);
        System.out.println(Arrays.toString(nansu));
    }

    public static void main(String[] args) {
        new Question1().start();
    }
}
//1차원 배열을 이용하여 1~100사이의 난수를 10개 만들어 오름차순으로 정렬하여 출력.