package j01_basic;

public class GuGuDanAll {
    public static void main(String[] args) {
        System.out.println("\t\t구구단");
        for(int startDan=1; startDan<=9; startDan+=3){  //1,4,7을 만듦
            //title출력
            for(int dan=startDan; dan<startDan+3; dan++){//startDan=1->1~3/startDan=4->4~6/startDan=7->7~9
                System.out.print("="+dan+"단=\t");
            }
            System.out.println();

            //구구단 출력
            for(int i=2; i<=9; i++){  //곱하는 값
                for(int j=startDan; j<startDan+3; j++){  //단
                    int result = j * i;
                    System.out.print(j+"*"+i+"="+result+"\t");
                }
                System.out.println();
            }
        }
    }
}
/*
    1. 구구단 출력
    2. 1,4,7을 만듦(1,2,3단/4,5,6단/7,8,9단 이렇게 덩어리로 봄)
    3. 구구단 제목 출력(==1단==,==2단==,==3단==)

*/