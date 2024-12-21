package j02_array;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortAsc {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = ran.nextInt(100) + 1;  //1~100사이의 난수
        }
        System.out.println("============정렬 전============");
        System.out.println(Arrays.toString(arr));   //[_, _, _] 이런 형식으로 문자열을 만들어 리턴해줌

        //정렬 -> 버블정렬
        //데이터 10개 -> 인덱스는 9까지 있음 -> 8까지 만들어야함
        for(int j=0; j<arr.length-1; j++){
            //한번 반복
            for (int i = 0; i < arr.length - 1 - j; i++) {  //0,1,2,3,4,5,6,7,8     //j를 빼주면 회전수를 줄일 수 있음
                //if (arr[i] > arr[i + 1]) {  //오름차순
                if(arr[i] < arr[i+1]){   //내림차순
                    //값 교환
                    int temp = arr[i];  //두개의 값 교환하기 위해서는 임시변수 추가로 필요함
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("============정렬 후============");
        System.out.println(Arrays.toString(arr));

        ///////////////////
        System.out.println("============Arrays클래스를 이용한 정렬============");
        int arr2[] = new int[10];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = ran.nextInt(900)+100;//100~999  //(큰수-작은수+1)+작은수
        }
        System.out.println("============정렬 전============");
        System.out.println(Arrays.toString(arr2));  //Arrays.toString(배열명) -> 배열 출력됨

        //정렬하기
        Arrays.sort(arr2);
        System.out.println("============정렬 후============");
        System.out.println(Arrays.toString(arr2));
    }
}
