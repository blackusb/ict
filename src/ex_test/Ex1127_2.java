package ex_test;

public class Ex1127_2 {
    public static void main(String[] args) {
        //구구단 출력
        System.out.println("\t\t구구단");

        for(int x=0; x<=6; x+=3){    //1단->4단->7단 : 3씩 커짐
            //구구단 각 제목 출력 : ==1단==, ==2단==
            for(int i=1+x; i<=3+x; i++){
                System.out.print("=="+i+"단==\t");
            }
            System.out.println();
            //계산부분 출력
            for(int k=2; k<=9; k++){
                for(int j=1+x; j<=3+x; j++){
                    System.out.print(j+"*"+k+"="+j*k+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
