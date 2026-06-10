package week14;

import java.sql.*;

public class JDBCTest_06 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String sql = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db" 
					+ "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"
					, "root", "comso");	
	
			
			
			stmt = conn.createStatement();
			
			
			conn.setAutoCommit(false);
			for(int i=0; i<5; i++){ //테이블 생성
			      sql= "Insert Into JDBCTest_B (name, age) values('";
			      sql += "홍길동"+ i +"','"+(60+i)+"')";
			      stmt.executeUpdate(sql);
			}
			sql="Insert Into JDBCTest_B(name,age) values('hoho','50')";
			stmt.executeUpdate(sql);
			conn.commit();
			
			
			ResultSet rs=stmt.executeQuery("select name, age from JDBCTest_B");
			
			while(rs.next())

			System.out.println("name :"+ rs.getString(1)+
					"age :"+rs.getInt("age"));
		
		}catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null)
					stmt.close();
				if(conn !=null)
					conn.close();
			}catch (SQLException ignored) {
			}
			System.out.println("프로그램 종료");
		}
	}
}//인터페이스,LINKEDLIST,MAP,JDBC 성적 6/19