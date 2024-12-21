package j08_collection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

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
                TreeSet<Integer> ts = new TreeSet<>();    //게임을 담을 컬렉션
                int lastLotto = 0;  //마지막으로 생성한 번호를 보관할 변수
                while(ts.size()<7){ //TreeSet안의 객체의 수가 7보다 작을 때. 중복 불가. 새로 만든 수가 이미 있으면, 새로 만든 수 버림.
                    lastLotto = random.nextInt(45)+1;   //번호 만들고
                    ts.add(lastLotto);   //번호를 TreeSet에 담는다.
                }
                //마지막에 만든 번호를 TreeSet에서 삭제.
                ts.remove(lastLotto);   //ts.remove(Integer.valueOf(lastLotto)) -> int를 Integer로 바꿔줌.

                System.out.print(cnt+"게임=");
                //Object[] arr = ts.toArray();
                System.out.print(Arrays.toString(ts.toArray()));   //[4, 16, 5, 7, 12, 20]  //toArray()는 TreeSet이 상속받은 클래스에 있는 메소드.
                System.out.println(", bonus="+lastLotto);
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
//TreeSet 사용해서 중복 없앰.