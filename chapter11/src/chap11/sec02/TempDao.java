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
	
	private Connection conn=null; //클래서 안에서만 사용함
	private Statement stmt=null;
	private ResultSet rs=null;
	

	private static TempDao instance=null;      //싱글톤
	private TempDao() {}
	
	public static TempDao getInstance() {
		if(instance==null)instance=new TempDao();
		return instance;
	}
	
	List<TempVO> list=new ArrayList<TempVO>();// 다형성 upcast / list인터페이스의 객체 생겼다는것은 자식클래스 전부 재정의 해줬다

	public List<TempVO> selectList(String sql){ //쿼리 실행 반환타입   List
		try {
			conn=DriverManager.getConnection(URL,USER,PASSWD);   //연결 객체 생성, 속성 들어가서  db 연결
			stmt=conn.createStatement(); //명령객체
			rs=stmt.executeQuery(sql); //이미 알려진 쿼리 실행할때 (stmt)/사용자가 선택한 쿼리 실행할때 (prestatement) /쿼리  sql 매개변수로 받아서 쿼리명령이 executeQuery ->select 일때 
			
			while(rs.next()) {		 //next() 하나씩 꺼내오는 명령 
				TempVO tempVO=new TempVO();  //객체 생성 
				tempVO.setEmpNo(rs.getNString("EMPNO")); //EMPNO의 문자를 getNString꺼내서 tempVO.setEmpNo 넣어줌
				tempVO.setEname(rs.getNString("ENAME"));
				tempVO.setJob(rs.getNString("JOB"));
				tempVO.setDeptNo(rs.getNString("DEPTNO"));
				
				list.add(tempVO);	//.toStirng메소드 쓴거랑 똑같음
			
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
