/*����7] �Ա� (deposit), ���(withdraw), �ܰ�Ȯ��(getbalance)�� �����ϴ� ����Ŭ����(Account)�� �����Ͻÿ�.
�Ա�ó���޼ҵ� ��ݸ޼ҵ� �ܰ�Ȯ�θ޼ҵ�
�ʿ��� ����- �̸�, �ܰ�
1.�ܰ�Ȯ��
����ڰ� ����ϱ� ���ϴ� �׼��� ����� 2. �ܰ� Ȯ�� ���ų� �ܰ�ũ�� ��� ���� , ����� ��ȯ������(�ܰ�)
3. �Ա��� �׼���ŭ �ܰ� �÷��� ��ȯ������
4. �ܰ� ���ֱ� 
*/

package chap06.sec01;

public class AccountExample {

	public static void main(String[] args) {
		new AccountExample().start();
		}

	private void start() {
		Account account =new Account("ȫ�浿"); //�ָ޴�
		account.deposit(10000);         //
		printInfo(account);
		int amt=account.withdraw(5000);
		System.out.println("��ݱݾ� : "+amt);
		printInfo(account);
	}

public void printInfo(Account account) {
	System.out.println("������: "+account.getAccountOwner());
	System.out.println("�ܰ�: "+account.getBalance());
}
	}

