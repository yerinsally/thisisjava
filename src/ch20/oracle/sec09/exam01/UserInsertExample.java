package ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
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
			String sql = "" +
				"INSERT INTO users (userid, username, userpassword, userage, useremail) " +
				"VALUES (?, ?, ?, ?, ?)";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int count = 0;
			for(int i=0; i<10; i++) {
				pstmt.setString(1, "hgd"+i);
				pstmt.setString(2, "홍길동");
				pstmt.setString(3, "1234");
				pstmt.setInt(4, 25);
				pstmt.setString(5, "hgd"+i+"@mycompany.com");
				
				//SQL문 실행
				int rows = pstmt.executeUpdate();
				System.out.println("저장된 행 수: " + rows);
				count ++;
			}
			System.out.println("저장된 행 총수: " + count);
			
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
