package chap08.sec01;

public class OracleDao implements DataAccessObject{
	//�����ؾ��Ұ�
	@Override
	public void select() {//�߻�޼���. 
		System.out.println("Oracle DB���� ������ �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB���� �ڷ����");
}
	@Override
	public void update() {
		System.out.println("Oracle DB���� �ڷ᰻��");
		
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB���� �ڷ����");
	}
}
		