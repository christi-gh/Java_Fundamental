package Java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	
	public static void main(String[] args) {
		//1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. connect DB 
			// localhost : install ip of DB
			// 3306 : port number of DB
			// kpc : name of DB
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12",
					"kpc1234"
					);
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체 생성
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member1 ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 처리
			int index = 0;
			pstmt.setString(++index, "샤넬2");
			pstmt.setString(++index, "프랑스2");
			pstmt.setInt(++index, 12);
			
			//5. Sending sql
			// resultCount : 업데이트된 행의 수를 반환
			int resultCount = pstmt.executeUpdate();
			System.out.println("result : "+resultCount);
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(con!=null) con.close();
					if(pstmt!=null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
