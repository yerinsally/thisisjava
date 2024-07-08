package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe", 
				"webdb", 
				"webdb"
			);	
			
			//매개변수화된 SQL문 작성
			String sql = ""
				+ "UPDATE USERS SET \r\n"
				+ "USERNAME = ?,\r\n"
				+ "USERPASSWORD = ?,\r\n"
				+ "USERAGE = ?,\r\n"
				+ "USEREMAIL = ?\r\n"
				+ "WHERE USERID = ?";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "홍길동2");
			pstmt.setString(2, "1234");
			pstmt.setInt(3, 99);
			pstmt.setString(4, "hgd@korea.com");
			pstmt.setString(5, "winter22");
			
			//SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수: " + rows);
			
			//PreparedStatement 닫기
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try { 
					//연결 끊기
					conn.close(); 
				} catch (SQLException e) {}
			}
		}
	}
}
