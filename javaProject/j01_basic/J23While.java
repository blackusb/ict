package j01_basic;

public class J23While {
    public static void main(String[] args){
        int i=0;    //고치면 안됨. 1~5까지 출력하기

/*
        i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
*/

/*
        while(i<=5){
            if(i>0){
                System.out.println(i);
            }
            i++;
        }
*/

        while(i<5){
            //i++;
            //System.out.println(i);
            System.out.println(++i);    //이렇게도 사용함
        }
    }
}
