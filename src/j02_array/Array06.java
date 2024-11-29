package j02_array;

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        //2차원 배열의 행마다 다른 칸의 수로 배열 생성하기

        //2차원을 생성하는데 행의 수는 있고, 열의 수는 없는 배열을 생성한다.
        int arr[][] = new int[3][];
        //각 행마다 열의 수를 생성한다.
        arr[0] = new int[3];    //첫 줄은 3칸
        arr[1] = new int[4];    //두번째 줄은 4칸
        arr[2] = new int[2];    //세번째 줄은 2칸

        arr[1][3] = 9;
        arr[2][0] = 3;

        for(int a[] : arr){ //2차원 배열은 한 줄씩 담긴다.
            System.out.println(Arrays.toString(a));
        }

        System.out.println("-----------------");

        ////////
        int data[][] = new int[10][10];
        for(int r=0; r<data.length; r++){   //0,1,2,3,4
            for(int c=0; c<data[r].length; c++){    //0,1,2,3,4
                if(r==c || r+c==data.length-1){
                    data[r][c] = 1;
                }
            }
        }
        for(int d[] : data){
            //System.out.println(Arrays.toString(d));
            String txt = Arrays.toString(d);
            System.out.println(txt.substring(1,txt.length()-1)); //인덱스 끝값의 앞까지 출력됨
        }
    }
}
