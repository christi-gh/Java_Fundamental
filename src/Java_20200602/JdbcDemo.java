package Java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) {

		// 1. 드라이버 로드
		// Driver 객체를 메모리에 로드하여 Java Application과 mariadb-java-client-xxx.jar와 연결
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// 2. 데이터 베이스와 연결
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc?autoReconnect=true", // url
					"kpc12", // user
					"kpc1234" // pwd
			);
			
			System.out.println("데이터베이스 연결 성공");

			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			// ? : 바인딩 변수, 바인딩 변수는 반드시 컬럼값에만 사용 가능
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member1(num, NAME, addr) VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수 설정
			pstmt.setInt(1, 12);
			pstmt.setString(2, "샤넬");
			pstmt.setString(3, "프랑스");
			
			// 5. SQL문 전송
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : "+resultCount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6. 모든 자원을 반납
			try {
				if (con != null)
					con.close();
				if (pstmt != null) 
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
