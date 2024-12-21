package j02_array;

public class Array05 {
    public static void main(String[] args) {
        //2차원 행,열이 있는 배열

        //2차원 배열 생성하기    행,열
        int[][] arr = new int[5][4];

        //2차원 배열 값 대입하기
        arr[2][1] = 50;
        arr[1][3] = 100;

        //1차원 배열 : arr.length = 칸의 수
        //2차원 배열 : arr.length = 행의 수
        //2차원 배열 : arr[r].length = 행의 컬럼수
        for(int r=0; r<arr.length; r++){    //0,1,2,3,4
            for(int c=0; c<arr[r].length; c++){
                System.out.print(arr[r][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------");

        //초기값이 있는 2차원 배열
        int arr2[][] = {{5,6,7,8},
                        {10,11,12,13},
                        {100,200,300,400}};
        String color[][] = {{"Red","Blue","Green"},
                            {"빨강","파랑","초록"}};

        for(int r=0; r<arr2.length; r++){
            for(int c=0; c<arr[r].length; c++){
                System.out.print(arr2[r][c]+"\t");
            }
            System.out.println();
        }

        System.out.println("----------------");

        for(int r=0; r<color.length; r++){
            for(int c=0; c<color[r].length; c++){
                System.out.print(color[r][c]+" ");
            }
            System.out.println();
        }

    }
}
