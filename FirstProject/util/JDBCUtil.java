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

//build path �����ϱ�
//JDBC�� ����Ͽ� ȿ�������� ����� �� �ִ� �޼��带 ������ class
public class JDBCUtil {
//�̱������� ����
	private static JDBCUtil instance = null; // �ϱ�

	private JDBCUtil() {
	} // ������ �޼��� ��Ŭ���� �ۿ��� ������

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

	// �ϳ� �˻�
	public Map<String, Object> selectOne(String sql) {
		// �������� ����� ���
		// sql= "select *from tbl_member where mem_id='a001' and
		// mem_pass='1234'"
		Map<String, Object> row = null;
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// a001�� ���� ���� �ҷ���
			ResultSetMetaData rsmd = rs.getMetaData(); // �÷��� �� , �÷����� ���ϱ� ���� ��ü ����
			int columnCount = rsmd.getColumnCount();
			while (rs.next()) { // ���� ������ �� �ڷᰡ �ִ��� Ȯ��
				row = new HashMap<>();
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i); // ColumnLabel-as�ڿ� �÷���Ī. ������ ���� �÷�����
					// or String key=rsmd.getColumnName(i); //�÷���
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
		//?�����ϴ� �Ű������� ���� �𸣴ϱ� �� ��밡���� object���
		// sql="select *from tbl_member where mem_id =? and
		// mem_pass=?"
		Map<String, Object> row=null;
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			// sql�� �����ϴ� ?�� �����Ǵ� ������ mapping=>pstmt.setŸ�Ը�(?����,������)
			for (int i=0; i<param.size(); i++){
				pstmt.setObject(i+1,param.get(i) );//����Ŭ�̶� 1���� ī��Ʈ 
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
