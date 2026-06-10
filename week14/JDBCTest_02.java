package week14;

import java.sql.*;

public class JDBCTest_02 {

	public static void main(String[] args) {
		String sql=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db" 
					+ "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"
					, "root", "comso");	
	
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("create table JDBCTest_B(name varchar(20),age int)");
			System.out.println("JDBCTest 테이블 생성 OK!!");
			for(int i=0; i<5; i++){ //테이블 생성
			      sql= "Insert Into JDBCTest_B (name, age) values('";
			      sql += "홍길동"+ i +"','"+(20+i)+"')";
			      stmt.executeUpdate(sql);
			}
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}
}



