package j03_oop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoOOP {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    public LottoOOP(){

    }
    void startLotto(){
        do{
            int gameCnt = getInput("게임수=");
            for(int i=1; i<=gameCnt; i++){
                createLotto(i);
            }
            int que = getInput("계속하시겠습니까(1:예 2:아니오)?");
            if(que!=1) break;
        }while(true);
    }
    //한 게임수 만큼 로또 번호 만드는 메소드
    void createLotto(int c){
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
        lottoSort(lotto, c);
    }
    //정렬하는 메소드
    void lottoSort(int lotto[], int c){    //매개변수명은 달라도됨
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
        lottoPrint(lotto, c);
    }
    //출력하는 메소드
    void lottoPrint(int[] lotto, int cnt){
        System.out.print(cnt+"게임="+ Arrays.toString(Arrays.copyOfRange(lotto,0,lotto.length-1)));  //인덱스 0부터 6앞까지 출력
        System.out.println(", bonus="+lotto[6]);
    }
    //정수 입력받는 메소드
    int getInput(String msg){
        System.out.print(msg+"=");
        return scan.nextInt();
    }

//    public static void main(String[] args) {
//        new LottoOOP().startLotto();
//    }
}
