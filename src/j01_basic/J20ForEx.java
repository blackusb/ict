package j01_basic;

public class J20ForEx {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
        }
    }
}
/*
    1~100까지 아래의 수 출력
    1
    2
    4
    7
    8
    11
    13
    14
    16
    17
    19
    22
    .
    .
    91
    92
    94
    97
    98
*/
//1~100까지 출력하는데, 3,5의 배수 출력 제외
