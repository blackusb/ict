package j02_array;

public class ArrayCopySystem {
    public static void main(String[] args){
        int src[] = {43,65,7,88,3,876,45};
        int tar[] = new int[20];

        //src배열의 값을 tar배열에 복사하기
        //1.원본배열
        //2.원본배열의 복사 시작위치(인덱스값 넣어주기)
        //3.타켓배열
        //4.타겟배열의 복사 시작위치(인덱스값 넣어주기)
        //5.복사할 데이터의 갯수
        System.arraycopy(src,2, tar, 1, 3);

        //tar에 있는 데이터를 하나씩 꺼내, 변수 value에 담는다
        for(int value : tar){
            System.out.print(value+", ");
        }
    }
}
