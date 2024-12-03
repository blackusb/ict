package ex_test;

import java.util.Arrays;
import java.util.Random;

public class Ex1203_1 {
    public static void main(String[] args){
        /*
            1~100 사이의 난수를 1000개 만들어 최빈수를 구하라.
            갯수가 같을 때는 큰 값을 구한다.

            실행
            78
        */
        Random random = new Random();

        int[] nansu = new int[1000];    //생성된 난수를 담을 변수 준비

        //난수를 만들어서 배열에 넣기
        for(int i=0; i<nansu.length; i++){
            nansu[i] = random.nextInt(100)+1;
            System.out.print(nansu[i]+",");
        }

        //최빈값 구하기
        //특정 문자열을 찾아서, 찾을 때마다 나오는 갯수 더하기. 합계가 제일 높은 숫자 출력
        //난수가 1일때, 배열중에서 1이랑 같은 수를 찾아서 나오면 합계 변수에 ++해주기?
        int sum[] = new int[100];   //난수 1~100이 나오는 횟수를 저장할 배열
        for(int i=1; i<=100; i++){ //난수 i=1 //비교할 난수 1~100
            for(int j=1; j<=nansu.length; j++){ //j=1,2,3,...1000 -> nansu배열 1~1000까지 확인
                if(i == nansu[j-1]){  //난수 i와 배열에 담긴 1000개의 난수값이 동일할 때
                    sum[i-1]++;   //난수가 나오는 횟수를 배열에 저장함
                }
            }
        }
        System.out.println();
        //System.out.println(Arrays.toString(sum));   //1~100까지의 난수가 나온 횟수가 순서대로 배열에 담겨있음

        //sum배열 안에 있는 값 중 제일 큰 값 구하기 -> 지금 sum배열에는 1~100까지의 난수가 나온 횟수가 순서대로 배열에 담겨있음
        int max = sum[0];   //sum배열 중 최대값 담을 변수
        int index = 0;  //sum배열의 index값
        for(int i = 0; i<sum.length; i++){
            //배열에서 최대값 구하기. 최대값의 index가 필요함!!
            //최대값이 같으면 sum배열의 index값이 큰 숫자 구하기
            if(sum[i]>=max){ //sum배열에서 최대값을 구해 변수 max에 담기, 만약 sum[index]==max 이면, index 값이 큰 sum[index]의 값을 max에 담는다.
                max = sum[i];   //제일 많이 나온 숫자의 횟수가 max에 담아져있음
                index = i;  //sum배열의 인덱스 값을 변수 index에 담음
                System.out.println("인덱스??"+i);
            }
        }

        //sum배열의 max값의 index+1을 출력해야함. 나는 index를 확인해야함.
        System.out.println("제일 많이 나온 숫자 횟수="+max);
        System.out.println("최빈값="+(index+1));
    }
}
