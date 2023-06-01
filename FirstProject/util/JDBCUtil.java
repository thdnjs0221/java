package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//build path 설정하기
//JDBC를 사용하여 효율적으로 사용할 수 있는 메서드를 포함한 class
public class JDBCUtil {
//싱글톤패턴 적용
	private static JDBCUtil instance = null; // 암기

	private JDBCUtil() {
	} // 생성자 메서드 이클립스 밖에서 사용못함

	public static JDBCUtil getInstance() {
		if (instance == null)
			instance = new JDBCUtil();
		return instance;
	}

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "pc14";
	private String passwd = "java";

	private Connection conn;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	//private List<Map<String, Object>> row;

	// 하나 검색
	public Map<String, Object> selectOne(String sql) {
		// 정적쿼리 사용한 경우
		// sql= "select *from tbl_member where mem_id='a001' and
		// mem_pass='1234'"
		Map<String, Object> row = null;
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// a001의 대한 정보 불러옴
			ResultSetMetaData rsmd = rs.getMetaData(); // 컬럼의 수 , 컬럼명을 구하기 위해 객체 생성
			int columnCount = rsmd.getColumnCount();
			while (rs.next()) { // 다음 가지고 올 자료가 있는지 확인
				row = new HashMap<>();
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i); // ColumnLabel-as뒤에 컬럼별칭. 없으면 원본 컬럼네임
					// or String key=rsmd.getColumnName(i); //컬럼명
					Object value = rs.getObject(i);
					row.put(key, value);

				}
			}

		} catch (SQLException e) {
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
		return row;

	}
	//selectOne
	public Map<String, Object> selectOne(String sql, List<Object> param) {
		//?대응하는 매개변수가 뭔지 모르니까 다 사용가능한 object사용
		// sql="select *from tbl_member where mem_id =? and
		// mem_pass=?"
		Map<String, Object> row=null;
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			// sql에 존재하는 ?에 대응되는 데이터 mapping=>pstmt.set타입명(?순번,데이터)
			for (int i=0; i<param.size(); i++){
				pstmt.setObject(i+1,param.get(i) );//오라클이라 1부터 카운트 
			}
			 rs=pstmt.executeQuery();
			 ResultSetMetaData rsmd=rs.getMetaData();
			 int columnCount=rsmd.getColumnCount();
			 while(rs.next()) {
				 row=new HashMap<>();
				 for(int i=0; i<columnCount; i++ ) {
				 String key=rsmd.getColumnLabel(i);
				 Object value=rs.getObject(i);
				 row.put(key, value);
			  }
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {rs.close();} catch (Exception e) {}
			if (pstmt != null)
				try {pstmt.close();} catch (Exception e) {}
			if (conn != null)try {conn.close();} catch (Exception e) {}
		}
			return row;

		}
	}
