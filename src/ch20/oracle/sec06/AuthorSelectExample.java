package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorSelectExample {
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
				"SELECT author_id, author_name, author_desc " +
				"FROM AUTHOR";
			
			//PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//SQL문 실행 후, ResultSet을 통해 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			
			List<Author> list = new ArrayList<>();
			
			while(rs.next()) {						//1개의 데이터 행을 가져왔을 경우
				Author author = new Author();				
				author.setAuthorId(rs.getString("author_id"));
				author.setAuthorName(rs.getString("author_name"));
				author.setAuthorDesc(rs.getString("author_desc"));			
				//System.out.println(user);
				list.add(author);
			}
			rs.close();
			
			//PreparedStatement 닫기
			pstmt.close();
			
			for(Author author : list) {
				System.out.println(author);
			}
			
		} catch (Exception e) {
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
