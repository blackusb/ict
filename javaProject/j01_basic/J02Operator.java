package j01_basic;

public class J02Operator {
    public static void main(String[] args){ //psvm 자동완성기능
        int a = 10;
        int b = 3;
        //단항연산자 : +, -
        int r1 = -a;
        System.out.println("r1=> "+r1);

        //단항연산자 : ++, -- (값을 1씩 증가 또는 감소하는 연산자)
        int c = 5;
        c++;    //6
        System.out.println("c="+c);
        ++c;    //7
        System.out.println("c="+c);
        c=c+1;  //1증가
        System.out.println("c="+c);

        --c;
        System.out.println("c="+c);

        int r2 = ++c + 2;   //증가 먼저하고 계산
        int r3 = c++ +2;    //계산 먼저하고 증가, ++가 마지막에 계산되서 c=9
        System.out.println("r2->"+r2+", r3->"+r3+", c="+c);

        int r4 = c++ +(3 - --c); //r4=9+3-9=3, c=9->10->9
        System.out.println(r4);

        //산술연산자 : +,-,   <   *,/,%(나머지)
        int r5 = a % b; //a=10, b=3
        int r6 = a / b;
        double r7 = a / (double)b; // 10/.3.0
        System.out.println("r5=>"+r5+", r6=>"+r6+", r7=>"+r7);

        String str3="JDK"+10+7;
        String str4=10+7+"JDK";
        System.out.println(str3);
        System.out.println(str4);

        //비교연산자 : ==, !=, >, <, >=, <=
        //연산결과는 논리형데이터로 구해진다.
        boolean r8 = a > b;
        System.out.println("r8=>"+r8);

        boolean r9 = a < b+3;
        System.out.println("r9=>"+r9);

        //논리연산자 : &&, ||
        int num = 2;
        //num이 1~100 사이면 참이 되는 수식 세우기
        boolean r10 = num>=1 && num<=100;
        System.out.println("r10=> "+r10);

        //대입연산자 : +=,-=,*=,/=,%= ...
        int x = 52;
        x += 12;    //x=x+12    ->64
        System.out.println("x="+x);
        x *= 2;     //x=128
        System.out.println("x="+x);
        x %=3;      //x=2
        System.out.println("x="+x);

        int n1 = 23;
        int n2 = 9;
        int result = (n1*2)%3-(n2/4*n1)*12;
        System.out.println("result=>"+result);
    }
}
