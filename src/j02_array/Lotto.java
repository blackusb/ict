package j02_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //1~45까지 로또번호 만들기
        do{
            //게임수 입력
            System.out.print("게임수 입력=");
            int gameCnt = scan.nextInt();

            //게임수 만큼 로또번호 생성, 출력
            //반복 횟수가 명확한 경우에는 for문이 적당함.
            for(int cnt=1; cnt<=gameCnt; cnt++){
                //1게임
                int lotto[] = new int[7];
                for(int i=0; i<lotto.length; i++){
                    lotto[i] = random.nextInt(45)+1;

                    //이전에 만들어진 로또번호가 i번째(방금 만든 번호)와 같으면 다시 만든다.
                    for(int check=0; check<i; check++){ //i=0->반복안함/i=1->0/i=2->0,1
                        if(lotto[i]==lotto[check]){
                            i--;
                            break;
                        }
                    }
                }
                //정렬
                //index 0~5까지만 정렬, 마지막은 보너스번호이므로 그냥 둔다.
                //버블정렬 사용
                for(int i=0; i<lotto.length-2; i++){    //보너스번호는 제외해야하므로 -1이 아닌, -2를 해줌/i=0,1,2,3,4
                    for(int j=0; j<lotto.length-2-i; j++){  //-i는 회전수 줄이기 위해 함, j=0,1,2,3,4/0,1,2,3/0,1,2..
                        if(lotto[j]>lotto[j+1]){
                            int temp = lotto[j];
                            lotto[j] = lotto[j+1];
                            lotto[j+1] = temp;
                        }
                    }
                }
                //출력
                System.out.print(cnt+"게임="+Arrays.toString(Arrays.copyOfRange(lotto,0,lotto.length-1)));  //인덱스 0부터 6앞까지 출력
                System.out.println(", bonus="+lotto[6]);
            }
            //계속 여부
            System.out.print("계속하시겠습니까(1:예, 2:아니오)?");
            int que = scan.nextInt();
            if(que!=1){
                System.out.println("프로그램이 종료되었습니다.");
                break;  //while문 벗어남
            }
        }while(true);
    }
}
/*
    게임수를 입력받아 게임수만큼 로또 번호를 생성하여 아래와 같이 출력하라

    [요구조건]
    -중복번호 제거
    -로또 번호는 오름차순으로 정렬
    -보너스는 마지막에 생성된 번호이여야 함
*/
