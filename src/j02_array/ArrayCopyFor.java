package j02_array;

public class ArrayCopyFor {
    public static void main(String[] args) {
        //첫번째
        int[] arr1 = {45,6,85,75,14,35,23,11};
        //두번째
        int[] arr2 = new int[20];
        //arr1을 arr2배열에 같은 index위치에 복사
        for(int i=0; i<arr1.length; i++){
           arr2[i] = arr1[i];
        }
        //출력
        for(int i=0; i<arr2.length; i++){
            System.out.printf("%d,",arr2[i]);
        }

    }
}
