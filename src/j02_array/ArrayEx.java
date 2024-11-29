package j02_array;

public class ArrayEx {
    public static void main(String[] args) {
        //1~1000 사이의 난수를 100개 만들어 배열에 저장하고
        //생성된 난수 중 최대값, 최소값을 구해서 출력하라

        int data[] = new int[100];

        //난수를 배열에 대입하기
        for(int i=0; i<data.length; i++){   //i=0,1,2,3,4,5.....
            //(큰수-작은수+1) 곱해주고 +작은수
            data[i] = (int)(Math.random()*(1000-1+1))+1;
            System.out.printf("%d,",data[i]);
        }
        System.out.println();
        //-----------------------------
        int max = data[0];  //최대값 변수
        int min = data[0];  //최소값 변수

        for(int i=1; i<data.length; i++){   //1,2,3,...,99
            if(data[i]>max) // 최대값 구하기
                max = data[i];
            if(data[i]<min){    //최소값 구하기
                min = data[i];
            }
        }
        System.out.println("최대값="+max);
        System.out.println("최소값="+min);
    }
}
