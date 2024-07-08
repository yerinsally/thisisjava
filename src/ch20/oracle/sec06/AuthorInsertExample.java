package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorInsertExample {
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
			//시퀀스문으로 작성`
			String sql =
				"INSERT INTO AUTHOR VALUES (seq_author_id.nextval,?,?) ";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "예린");
			pstmt.setString(2, "얍");
				
			//SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("추가된 행 수: " + rows);
							
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
