package chap06.sec08;

public class DaoExample {

	public static void main(String[] args) {
		doWork(new OracleDao());
		//doWork(new MySql());

	}
	
	public static void doWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
