package week13;
//이 파일은 다음주에도 쓰임 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCTest_01 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cd.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_b"
					+"?characterEncoding=UTF-&&severTimezone=UTC&useSSL=false"
					,"root","comso");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(conn !=null)	
				conn.close();
			
			}catch (SQLException ignored) {}
		}
		System.out.println("DB 연결 성공!!!!");
	}

}
