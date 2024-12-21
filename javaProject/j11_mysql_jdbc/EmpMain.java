package j11_mysql_jdbc;

import java.util.Scanner;

public class EmpMain {
    Scanner scan = new Scanner(System.in);

    public EmpMain(){}
    public void empStart(){
        //1.사원목록, 2.사원등록, 3.사원정보수정, 4.사원삭제, 5.종료
        do{
            System.out.print("메뉴 [1.사원목록, 2.사원등록, 3.사원정보수정, 4.사원삭제, 5.종료]->");
            int menu = Integer.parseInt(scan.nextLine());
            switch(menu){
                case 1:
                    EmpSelect es = new EmpSelect();
                    es.empListStart();
                    break;
                case 2:
                    EmpInsert ei = new EmpInsert();
                    ei.empInsertStart();
                    break;
                case 3:
                    EmpUpdate eu = new EmpUpdate();
                    eu.empUpdateStart();
                    break;
                case 4:
                    EmpDelete ed = new EmpDelete();
                    ed.empDeleteStart();
                    break;
                case 5:
                    System.out.println("프로그램이 정상종료 되었습니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력하였습니다.");
            }
        }while(true);
    }
    public static void main(String[] args){
        new EmpMain().empStart();
    }
}
