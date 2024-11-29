package ex_test;

public class ExArray2 {
    public static void main(String[] args) {
        //1차원 배열을 이용하여 총합과 평균 구하기
        //배열에 1~100사이의 값을 22개 만들어 난수를 저장하고
        //생성된 난수의 합과 평균을 구하라.

        int data[] = new int[22];

        //난수 배열에 대입
        for(int i=0; i<data.length; i++){
            data[i] = (int)(Math.random()*(100-1+1))+1;
        }

        //난수의 합, 평균
        int sum = 0;    //난수의 합 담을 곳
        int avg = 0;    //난수의 평균 담을 곳

        for(int i=0; i<data.length; i++){
            sum += data[i];
        }
        avg = sum/data.length;

        //출력
        System.out.println("난수의 합="+sum);
        System.out.println("난수의 평균="+avg);
    }
}
