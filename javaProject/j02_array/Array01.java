package j02_array;

public class Array01 {
    public static void main(String[] args){
        int a = 100;
        //배열형 변수 선언하기
        //1차원 배열, 2차원 배열, 3차원 배열
        //정수 10개를 저장할 수 있는 배열 선언
        //같은 데이터형의 변수가 여러개 필요할 때 선언
        //배열은 생성된 후 배열의 크기를 변경할 수 없다.
        //초기값은 이렇게 들어가있음 : 정수=0, 실수=0.0, 문자=null, 논리=false
        int[] arr = new int[5];
        arr[3] = 89;

        System.out.println(a);
        System.out.println(arr);    //스택에 저장된 주소값이 출력됨

        //배열의 크기 : 배열명.length = 5  -> 값이 들어갈 자리의 갯수가 구해짐.
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        String name[] = new String[5];
        name[2] = "홍길동";
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
}
