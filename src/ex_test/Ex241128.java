package ex_test;

public class Ex241128 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("arr 배열의 길이="+arr.length);

        double[] data = {11,22,33,44,55,66,77};
        for(int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }

        String[] color = {"빨", "주", "노"};
        for(int i=0; i<color.length; i++){
            System.out.println(color[i]);
        }

        int jumsu[] = {50,60,70,80,90,100};
        int sum = 0;
        for(int num : jumsu){  //확장된 for문, index사용 x
            sum += num;
        }
        int avg = sum/jumsu.length;
        System.out.println("합계="+sum);
        System.out.println("평균="+avg);

        //난수 0.0~0.9999999999999
        for(int i=1; i<=10; i++){
            int r = (int)(Math.random()*10)+1;  //0.0~9.999->+1->1~10   /(큰수-작은수+1)+작은수->(10-1+1)+1
            //int r = (int)((Math.random()*(100-1+1))+1; //1~100
            System.out.println("난수="+r);
        }
    }
}
