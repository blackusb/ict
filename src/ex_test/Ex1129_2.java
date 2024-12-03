package ex_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1129_2 {
    public static void main(String[] args) {
        /*
            게임수를 입력받아 게임수만큼 로또 번호를 생성하여 아래와 같이 출력하라

            [요구조건]
            -중복번호 제거
            -로또 번호는 오름차순으로 정렬
            -보너스는 마지막에 생성된 번호이여야 함
        */
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        int[] lotto = new int[7];   //1~45사이 난수 생성
        System.out.print("게임 수 입력=");   //게임 수 입력 받기
        int game = sc.nextInt();

        for(int j=0; j<game; j++){
            for(int i=0; i<lotto.length; i++){
                lotto[i] = random.nextInt(45)+1;
                System.out.print(lotto[i]+",");
            }
            System.out.println();
        }
    }
}
