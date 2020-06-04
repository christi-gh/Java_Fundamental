package Java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Java_20200604.EmpDto;

public class EmpDao {
	
	//1. Singleton pattern 코딩
	// 1) 생성자의 접근한정자를 private으로 설정한다.
	// 2) 해당 클래스의 객체를 생성할 수 있는 변수를 static으로 선언한다.
	// 3) 해당 클래스의 객체를 생성할 수 있는 매서드를 static으로 만든다.
	
	private static EmpDao dao;
	
	public static EmpDao getInstance() {
		if(dao == null) {
			dao = new EmpDao();
		}
		return dao;
	}
	
	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int insert(EmpDto d) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES(?, ?, ?,?,?,?,?,?) ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 0;
			pstmt.setInt(++index, d.getNo());
			pstmt.setString(++index, d.getName());
			pstmt.setString(++index, d.getJob());
			pstmt.setInt(++index, d.getMgr());
			pstmt.setString(++index, d.getHireDate());
			pstmt.setInt(++index, d.getSal());
			pstmt.setInt(++index, d.getComm());
			pstmt.setInt(++index, d.getDeptno());

			resultCount = pstmt.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close(con, pstmt);
		}

		return resultCount;
	}

	private void close(Connection con, PreparedStatement pstmt) {
		close(con, pstmt, null);
	}

	public int update(EmpDto d) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp  ");
			sql.append("SET ename = ?, job =?, mgr = ?, hiredate = CURDATE(), "
					+ "sal = ?, comm =?, deptno =?  ");
			sql.append("WHERE empno = ?  ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 0;
			pstmt.setString(++index, d.getName());
			pstmt.setString(++index, d.getJob());
			pstmt.setInt(++index, d.getMgr());
			//pstmt.setString(++index, d.getHireDate());
			pstmt.setInt(++index, d.getSal());
			pstmt.setInt(++index, d.getComm());
			pstmt.setInt(++index, d.getDeptno());
			pstmt.setInt(++index, d.getNo());

			resultCount = pstmt.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		return resultCount;
	}

	public int delete(int no) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp  ");
			sql.append("WHERE empno =?  ");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, no);

			resultCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		return resultCount;
	}

	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate,'%y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY empno DESC ");
			sql.append("LIMIT 0, 10 ");

			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int index = 0;
				int no = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptno = rs.getInt(++index);
				list.add(new EmpDto(no, name, job, mgr, hireDate, sal, comm, deptno));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	public EmpDto select(int no) {
		EmpDto empDto = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, DATE_FORMAT(hiredate,'%Y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("WHERE empno = ? ");

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				int index = 0;
				no = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptno = rs.getInt(++index);
				empDto = new EmpDto(no, name, job, mgr, hireDate, sal, comm, deptno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return empDto;
	}

	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null)rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
