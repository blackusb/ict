package ex_test;

public class Ex241121 {
    public static void main(String[] args){
        int a = 12;
        a++;    //a=13
        ++a;    //a=14
        int b = a++ + 10;   //b=14+10=24, a=15;
        System.out.println("b="+b+", a=>"+a);
        int c = ++a;    //c=16, a=16
        System.out.println("c="+c+". a=>"+a);
        int d = a--;    //d=16, a=15
        System.out.println("d="+d+", a=>"+a);
        int e = a++;    //e=15, a=16
        System.out.println("e="+e+", a=>"+a);

        System.out.println("-----------");

        int n1 = 14;
        int n2 = 3;
        int r1 = n1 / n2;   //14/3=4
        System.out.println("r1="+r1);
        double r2 = (double)n1 / n2;    //14.0/3=4.~~~
        System.out.println("r2="+r2);

        System.out.println("-----------");

        String str1 = "JDK"+17; //JSK17
        String str2 = str1 + "의 특징";    //JDK17의 특징
        System.out.println(str2);

        String str3 = "JDK"+10+7;   //JDK107
        System.out.println(str3);
        String str4 = 10+7+"JDK";   //17JDK
        System.out.println(str4);

        System.out.println("-----------");

        int f = 10;
        int g = 15;
        boolean r3 = f > g; //10>15 ->false
        System.out.println("r3="+r3);
        boolean r4 = f < g + 3;  //10<18 ->true
        System.out.println("r4="+r4);

        System.out.println("-----------");

        //어떤 수가 1~100사이이면 true, 아니면 false
        int data = 52;
        boolean result = 1<=data && data<=100;  //true
        System.out.println("result=>"+result);

        System.out.println("-----------");

        int x = 5;
        x += 10 / 3 * 4;    //x=5+10/3*4=5+3*4=5+12=17
        System.out.println("x="+x);

        int y = 10;
        y *= 2 % 3 + 7 / 3;  //y=10*2%3+7/3=20%3+2=2+2=4
        System.out.println("y="+y);

        System.out.println("-----------");

        //80점 이상이면 A, 아니면 B
        int score = 65;
        String grade = (score>=80)? "A":"B";    //B
        System.out.println("grade="+grade);

        //80점이상 A
        //70점이상 B
        //60점이상 C
        String grade2 = (score>=80)?"A":(score>=70)?"B":"C";
        System.out.println("grade2="+grade2);

        //num의 값이 0보다 크면 양수, 0보다 작으면 음수, 0이면 0이 출력
        int num = 0;
        String result3 = (num>0)?"양수":(num<0)?"음수":"0";
        System.out.println("result3="+result3);

        System.out.println("-----------");




        ////////////////////////
        //연산자 문제
        int xx = 2;
        int yy = 5;
        char cc = 'A';

        System.out.println(1+xx << 33); //23<<33 -> 4byte=32bit이므로 한 칸만 옆으로 가면 됨 ->6
        System.out.println(yy >= 5 || xx < 0 && xx > 2);   // true || false && false -> true || true -> true
        System.out.println(yy += 10 - xx++); //yy=5+10-2=13, xx=3
        System.out.println(xx+=2);   //xx=xx+2=3+2=5
        System.out.println(!('A'<=cc && cc<='Z'));   //!(true && true) = false
        System.out.println('C'-cc);  //67-65=2
        System.out.println('5'-'0');    //아스키코드 53-48=5
        System.out.println(cc+1);   //66
        System.out.println(++cc);   //B
        System.out.println(cc++);   //B출력되고 현재 B의 값은 C
        System.out.println(cc); //C

        System.out.println("------------");

        /////////////
        byte aaa = 10;  //
        byte bbb = 20;
        byte ccc= (byte)(aaa + bbb);    //형변환필요

        char ch = 'A';
        ch = (char)(ch + 2);    //형변환필요

        float ff = 3 / 2;   //1.0이 들어감
        long l = 3000 * 3000 * 3000;    //

        //////
        float f2 = 0.1f;
        double dd = 0.1;
        boolean result4 = dd == f2;

        System.out.println("ccc="+ccc); //30
        System.out.println("ch="+ch);   //C
        System.out.println("ff="+ff);   //1.0
        System.out.println("l="+l);     //
        System.out.println("result4="+result4); //false

        System.out.printf("%2.10f, %2.10f", f2, dd);








    }
}
