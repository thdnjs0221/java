package chap06.sec05;

public class Account {
	private static Account ac=null; //�ڱ��ڽ� ���� �Ǿ������ִ� ��ü /�������� ��������� Ŭ���� �ۿ��� ���� ����/ac=null;���� ��ü ����x
	private Account() {}   //������ �޼ҵ� private�μ���. �ܺο��� �ҷ��� ���� ���� 
	
	public static Account getInstance() { //getInstance()�޼ҵ�-  Account��ü ���� ���ϰ� Ŭ������ �ҷ��� ���ڴ�.
		if (ac==null) ac= new Account();  //��ü ����x-> ��ü ���� �� �� ���� return.
		return ac;						  //
	}
	
}
