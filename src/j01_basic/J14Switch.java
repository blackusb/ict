package j01_basic;

public class J14Switch {
    public static void main(String[] args){
        int colorNum = 3;
        String colorName;
        switch(colorNum){
            case 1:
                colorName = "빨강";
                break;
            case 2:
                colorName = "파랑";
                break;
            case 3:
                colorName = "노랑";
            case 4:
                colorName = "초록";
                break;
            default:
                colorName = "잘못된 컬러입니다.";
        }
        System.out.println(colorName);
    }
}
/*
    조건문 : switch

        byte, short, int, char, String
        switch(변수, 수식, 상수){
            case 상수:
                실행문;
                break;
            case 상수:
                실행문;
                break;
            default:
        }
*/
