package chap08.sec01;

public class DaoExample {

	public static void main(String[] args) {
		//�������̽��� ��ü �Ұ���
		OracleDao od=new OracleDao();
		MysqlDao msd=new MysqlDao();
		
		od.insert();
		
		DataAccessObject dao=new OracleDao(); //�������̽��� ������ ��������. �θ� �������̽�(����޼ҵ�x)���� �߻�޼ҵ� �ҷ��� ������ش�,�θ� ������ �ڽĿ��� ��� �޼ҵ� �������ؾ� ��ü������. oracledao �޼ҵ� ȣ����
		dao.insert();
	}

}
