package j02_array;

public class Array04 {
    public static void main(String[] args){
        //배열의 값을 이용하여 계산
        int jumsu[] = {76,78,37,54,98,76,67,87};

        //합계
        int tot = 0;
        //확장된 for문 : index없이 반복처리
        //              배열, 컬렉션 등에서 사용
        for(int data : jumsu){  //for(타입과 변수명:배열명){}/data에는 for문 실행시 76,78,37,54,98...이 순서대로 담긴다.
            tot += data;
        }
        int ave = tot / jumsu.length;
        System.out.println("합계="+tot);
        System.out.println("평균="+ave);
    }
}
