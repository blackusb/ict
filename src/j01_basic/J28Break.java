package j01_basic;

public class J28Break {
    public static void main(String[] args){
        //라벨을 반복문 이전에 생성해준다.
        p:  //라벨 이름은 자기 마음임. :는 반드시 붙여야됨.
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.printf("i=%d, j=%d\n", i, j);
                if(j>3) break p;
            }
        }
    }
}
