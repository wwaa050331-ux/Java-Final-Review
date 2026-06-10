package week14;
import java.sql.*;


public class JDBCTest_03 {
	



	public static void main(String[] args) {
		
		Connection conn =null;
		Statement stmt=null;
		String sql=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db" 
					+ "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"
					, "root", "comso");	
			
			//?characterEncoding=UTF-8 문자코드는 유니코드
			//serverTimezone=UTC 국제 표준시간대 (Coordinated Universal Time)
			//useSSL=false:SSL 사용
	
			stmt = conn.createStatement();
			
			
			rs=stmt.executeQuery("select name, age from JDBCTest_B");
			while(rs.next())

			System.out.println("name :"+ rs.getString(1)+
					"age :"+rs.getInt("age"));
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null)
					conn.close();
				if(stmt !=null)
					stmt.close();
				if(rs !=null)
					rs.close();
			} catch(SQLException ignored) {
			}
		
		
			System.out.println("프로그램 종료");
		}
	}
}


	