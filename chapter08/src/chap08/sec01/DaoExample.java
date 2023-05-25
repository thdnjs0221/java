package chap08.sec01;

public class DaoExample {

	public static void main(String[] args) {
		//인터페이스는 객체 불가능
		OracleDao od=new OracleDao();
		MysqlDao msd=new MysqlDao();
		
		od.insert();
		
		DataAccessObject dao=new OracleDao(); //인터페이스도 다형성 지원해줌. 부모 인터페이스(몸통메소드x)에서 추상메소드 불러서 사용해준다,부모를 구현한 자식에서 모든 메소드 재정의해야 객체생성함. oracledao 메소드 호출함
		dao.insert();
	}

}
