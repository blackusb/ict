package j01_basic;

public class J01Variable {
    public static void main(String args[]) {
        //변수 : 변수는 값을 보관하는 이름
        int age = 10; //Age AgeMax ageMin AGE
        int carBodyColor;
        int staticNum;

        int score;
        score = 20;
        int score2 = 90;

        int a = 30, b = 40, c = 50;

        int result = score * 2;
        int result2 = score2 * 2;

        System.out.println(result); //sout : System.out.println() 자동완성기능
        System.out.println(result2);

        int eng = 50;   // int
        double kor = 60.2;  //double
        boolean test = true;

        //강제형변환(Type Casting)
        //  1byte   4byte
        byte num = (byte) 130;
        //  4byte < 8byte(더블)
        int mat = (int) kor; //kor=60.2, double을 int로 바꿈

        System.out.println(num);
        System.out.println("mat=" + mat +"입니다.");

        //  1byte   4byte
        byte x = 40;

        //자동형변환
        //  4byte   1byte
        int y = x;
        //  8byte   4byte
        double z = eng;

        long data = 12345678912L;
        float data2 = 5678.44f; //double을 float으로 바꿈

        char c1 = 'A';  //1개의 문자만 저장 가능
        char c2 = '홍';

        //문자열
        //String은 특수 클래스이고 기본변수처럼 사용가능
        String name = "홍길동";    //대문자로 시작되는 것은 클래스.

        //        2byte 4byte
        //char c3 = (char)(c1 + 1);   //66
        int c3 = c1 + 1;
        System.out.println(c3);

        //문자열은 +만 가능하고 문자열을 연결
        String name2 = name + 100;
        System.out.println(name2);
    }
}
