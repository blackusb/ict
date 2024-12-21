package j11_mysql_jdbc;

import java.sql.*;

public class EmpSelect {
    public EmpSelect(){}
    public void empListStart(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        //localhost DBServer의 emp에 있는 사원목록 선택하여 출력하라.
        //localhost, 127.0.0.1, port:3306, 계정:root, 비번:tiger1234

        try{
            //1. jdbc Driver를 로딩(jvm에 등록)
            //경로와 클래스명을 문자열로 대입하면 jvm을 등록해준다.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. DB연결(DreiverManager)
            String url = "jdbc:mysql://localhost:3306/studydb"; //jdbc:mysql://ip:port/db명
            String username = "root";
            String password = "tiger1234";
            conn = DriverManager.getConnection(url, username, password); //DB에 연결을 하면 Connection을 리턴해줌. 변수에 담아야 사용 가능.

            //3. PreparedStatement객체
            //쿼리문을 이용해 객체 생성
            String sql = "select empno, ename, job, hiredate, sal, comm, deptno " +
                    "from emp where deptno in (20, 30) order by ename asc"; //""안에 ; 있으면 안됨.
            pstmt = conn.prepareStatement(sql);

            //4. 쿼리문 실행
            rs = pstmt.executeQuery();
            while(rs.next()){   //레코드가 있으면 계속 실행.
                //rs.getInt("empno"); //사원번호
                int empno = rs.getInt(1);   //인덱스 넣어줌. 1부터 시작.
                String ename = rs.getString(2);
                String job = rs.getString(3);
                String hiredate = rs.getString(4);
                double sal = rs.getDouble(5);
                double comm = rs.getDouble(6);
                int deptno = rs.getInt(7);

                System.out.printf("%8d %10s %13s %20s %6.2f %6.2f %5d\n", empno, ename, job, hiredate, sal, comm, deptno);
            }
        }catch(ClassNotFoundException cnfe){
            System.out.println("드라이브로딩 예외 발생...");
        }catch(SQLException se){
            System.out.println("DB연결 예외 발생...");
        }finally{
            try{
                if(rs!=null) rs.close(); //사용했으면 닫아주기. 사용 역순으로. null이면 닫을 수 없어서 if문 써줌.
                if(pstmt!=null) pstmt.close();
                if(conn!=null) conn.close();
            }catch(Exception ex){}
        }
    }
//    public static void main(String[] args){
//        EmpSelect select = new EmpSelect();
//        select.empListStart();
//    }
}
