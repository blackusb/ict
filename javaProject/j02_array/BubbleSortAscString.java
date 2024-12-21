package j02_array;

import java.util.Arrays;

public class BubbleSortAscString {
    public static void main(String[] args) {
        String names[] = {"홍길동","안중근","김삿갓","이순신","류관순","강감찬","김구"};

        for(int i=0; i<names.length-1; i++){
            for(int j=0; j<names.length-1-i; j++){  //0~5
                if(names[j].compareTo(names[j+1])> 0){ //홍-안>0
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names)); //[강감찬, 김구, 김삿갓.....홍길동]
    }
}
