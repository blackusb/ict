package j11_mysql_jdbc;

import java.sql.*;

public class MySqlDBConnection {
    static{ //멤버변수, 생성자보다 먼저 만들어짐. 로딩.
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ce){
            System.out.println("드라이브 로딩 예외 발생="+ce.getMessage());
        }
    }
    //멤버변수. protected로 상속 받아야만 사용가능하게 만듦.
    protected Connection conn = null;
    protected PreparedStatement pstmt = null;
    protected ResultSet rs = null;

    String url = "jdbc:mysql://localhost:3306/studydb";
    String username = "root";
    String password = "tiger1234";

    public MySqlDBConnection(){}

    //DB연결 메소드
    public void getConnection(){
        try{
            conn = DriverManager.getConnection(url, username, password);
        }catch(SQLException se){
            System.out.println("Mysql DB연결 예외 발생 ->"+se.getMessage());
        }
    }

    //DB닫기 메소드
    public void setMysqlClose(){
        try{
            if(rs!=null) rs.close();
            if(pstmt!=null) pstmt.close();
            if(conn!=null) conn.close();
        }catch(Exception e){}
    }
}