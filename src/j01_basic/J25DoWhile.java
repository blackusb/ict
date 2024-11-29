package j01_basic;

public class J25DoWhile {
    public static void main(String[] args) {
        //do~while을 이용하여 1~5까지 출력

        //while문은 초기값, 증감식 따로 써줘야함
        int i=0;    //못고침. 1~5출력하시오
        do{
            i++;
            System.out.println(i);
            //i++;
        }while(i<5);
    }
}
