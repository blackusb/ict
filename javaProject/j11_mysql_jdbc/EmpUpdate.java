package j11_mysql_jdbc;

import java.util.Scanner;

public class EmpUpdate extends MySqlDBConnection{
    Scanner scan = new Scanner(System.in);

    public EmpUpdate(){}
    public void empUpdateStart(){
        //사원명을 입력받아 입력받은 사원의 담당업무 또는 급여 수정하는 프로그램.
        try{
            System.out.print("수정할 사원명=");
            String ename = scan.nextLine();
            System.out.print("수정할 항목(필드)을 [1.담당업무, 2.급여] 입력=");
            String field = scan.nextLine();

            String data = null;
            if(field.equals("1")){  //담당업무를 수정
                System.out.print("수정할 담당업무를 입력=");
                data = scan.nextLine();
            }else{  //급여를 수정
                System.out.print("수정할 급여를 입력=");
                data = scan.nextLine();
            }

            //update emp set job=? where ename=?;
            //update emp set sal=? where ename=?;

            String sql = "update emp set ";
            if(field.equals("1")) sql += "job";
            else sql += "sal";
            sql += "=? where ename=?";

            //System.out.println("sql->"+sql);

            getConnection();    //DB연결 메소드
            pstmt = conn.prepareStatement(sql);

            if(field.equals("1")) pstmt.setString(1, data);
            else pstmt.setDouble(1, Double.parseDouble(data));

            pstmt.setString(2, ename);

            int result = pstmt.executeUpdate();  //몇개의 데이터가 수정되었는지 반환됨.
            if(result>0) System.out.println(ename+" 사원정보 수정완료");
            else System.out.println(ename+" 사원정보 수정실패");
        }catch(Exception e){
            System.out.println("수정 예외 발생..."+e.getMessage());
        }finally{
            setMysqlClose();
        }
    }

//    public static void main(String[] args){
//        new EmpUpdate().empUpdateStart();
//    }
}
