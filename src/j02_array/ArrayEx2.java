package j02_array;

import java.util.Random;

public class ArrayEx2 {
    public static void main(String[] args){
        Random random = new Random();
        //1차원 배열을 이용하여 총합과 평균 구하기
        //배열에 1~100사이의 값을 22개 만들어 난수를 저장하고
        //생성된 난수의 합과 평균을 구하라.

        //데이터 준비
        int a[] = new int[22];  //index 0~21
        for(int i=0; i<a.length; i++){
            a[i] = random.nextInt(100-1+1)+1;
        }

        //처리
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        int ave = sum / a.length;

        //출력
        System.out.println("합계="+sum);
        System.out.println("평균="+ave);
    }
}
