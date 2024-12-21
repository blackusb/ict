package j01_basic;

import java.util.Scanner;

public class J11IfElseEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            임의의 수를 입력받아 입력받은 수가 양수이거나 음수이면 양수로 만들어 100을 곱하여 출력하고,
            0이면 1로 변경하여 100을 곱하여 출력하라.
        */
        System.out.print("정수=");
        int inData = sc.nextInt();

        if(inData<0)
            inData = - inData;

        if(inData == 0)
            inData = 1;

        int result = inData * 100;
        System.out.println("result="+result);
    }
}
