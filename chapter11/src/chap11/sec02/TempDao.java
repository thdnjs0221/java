package chap11.sec02;
//db connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TempDao {
	private final String  URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER="pc14";
	private final String PASSWD="java";
	
	private Connection conn=null; //Ŭ���� �ȿ����� �����
	private Statement stmt=null;
	private ResultSet rs=null;
	

	private static TempDao instance=null;      //�̱���
	private TempDao() {}
	
	public static TempDao getInstance() {
		if(instance==null)instance=new TempDao();
		return instance;
	}
	
	List<TempVO> list=new ArrayList<TempVO>();// ������ upcast / list�������̽��� ��ü ����ٴ°��� �ڽ�Ŭ���� ���� ������ �����

	public List<TempVO> selectList(String sql){ //���� ���� ��ȯŸ��   List
		try {
			conn=DriverManager.getConnection(URL,USER,PASSWD);   //���� ��ü ����, �Ӽ� ����  db ����
			stmt=conn.createStatement(); //��ɰ�ü
			rs=stmt.executeQuery(sql); //�̹� �˷��� ���� �����Ҷ� (stmt)/����ڰ� ������ ���� �����Ҷ� (prestatement) /����  sql �Ű������� �޾Ƽ� ��������� executeQuery ->select �϶� 
			
			while(rs.next()) {		 //next() �ϳ��� �������� ��� 
				TempVO tempVO=new TempVO();  //��ü ���� 
				tempVO.setEmpNo(rs.getNString("EMPNO")); //EMPNO�� ���ڸ� getNString������ tempVO.setEmpNo �־���
				tempVO.setEname(rs.getNString("ENAME"));
				tempVO.setJob(rs.getNString("JOB"));
				tempVO.setDeptNo(rs.getNString("DEPTNO"));
				
				list.add(tempVO);	//.toStirng�޼ҵ� ���Ŷ� �Ȱ���
			
			}
	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) try {rs.close();}catch(Exception e) {}
			if(stmt !=null) try {stmt.close();}catch(Exception e) {}
			if(conn !=null) try {conn.close();}catch(Exception e) {}
		
		}
		return list;
	}
	

}
