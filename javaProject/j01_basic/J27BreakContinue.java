package j01_basic;

public class J27BreakContinue {
    public static void main(String[] args) {
        //break : 반복문 중지
        for(int i=1; i<=100; i++){
            System.out.println(i);

            //i가 10의 배수면 반복문 중단
            if(i%10==0){
                break;
            }
        }

        System.out.println("--------------------");

        //continue : 한 번 건너띄기
        for(int i=1; i<=100; i++){
            //i의 값이 3의 배수일 때만 출력
            if(!(i%3==0))
                continue;   //continue 다음에 문장이 있어야 의미가 있음.
            System.out.println(i);
        }

    }
}
