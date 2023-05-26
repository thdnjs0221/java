package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbExample01 {

	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 외우기 @다음에 ip
	String user = "pc14";
	String passwd = "java";

	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public static void main(String[] args) {
	//	new DbExample01().dbConnection(); // 자기 생성하고 쓰면 static없이도 쓸수있음
		int res = new DbExample01().dbInsert();
		if (res > 0) {
			System.out.println("자료입력 성공");
		}
	}

	public void dbConnection() {
		try {
			conn = DriverManager.getConnection(url, user, passwd); // DriverManager 클래스 이름 getConnection메소드 이름
			System.out.println("DB 연결 성공");
			stmt = conn.createStatement();
			String sql = "select EMPNO,ENAME,JOB FROM TEMP "; // 오라클 코드임.컬럼명 대소문자 상관없음
			rs = stmt.executeQuery(sql); // executeQuery- 셀렉트문실행 , executeupdate -INSERT / DELETE / UPDATE 관련 구문에서는 반영된
											// 레코드의 건수를 반환합니

			while (rs.next()) {// next()- 결과 집합에서 데이터가 없으면 false, 데이터가 존재하면 맨첫번째 데이터 가져오면 true
				String eid = rs.getString("EMPNO"); // 오라클 컬럼명를 문자열로 가져와라(db데이터 타입 잘 알아두기)
				String eName = rs.getNString("ENAME");// 오라클 컬럼명
				String job = rs.getString(3);// 오라클 인덱스 1부터시작

				System.out.printf("%5s %7s %10s\n", eid, eName, job);
				// 다시 while문으로 가서 2번째 데이터 있으면 가져오기

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {if(rs!=null)
			try {
				rs.close();
			} catch (Exception e) {
			}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}

	public int dbInsert() {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		System.out.println("[사원정보 입력]");
		System.out.println("사원번호: ");
		String eid = sc.nextLine();

		System.out.println("사원이름: ");
		String name = sc.nextLine();

		System.out.println("직무코드: ");
		String jid = sc.nextLine();

		System.out.println("부서번호: ");
		String deptid = sc.nextLine();
		// int res=0;

		try {
			conn = DriverManager.getConnection(url, user, passwd); // DriverManager 클래스 이름 getConnection메소드 이름
			String sql = "insert into TEMP values(?,?,?,?) "; // 오라클 코드임.컬럼명 대소문자 상관없음 /values모든값 다 나옴

			pstmt = conn.prepareStatement(sql); // sql객체로 만들어라
			pstmt.setNString(1, eid);
			pstmt.setNString(2, name);
			pstmt.setNString(3, jid);
			pstmt.setNString(4, deptid);

			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
		return res;
	}
}