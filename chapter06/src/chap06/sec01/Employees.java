package chap06.sec01;       //���� ���ϴ� Ŭ����
//����3] �����ȣ(int Ÿ�� ����), �����, ��ȭ��ȣ�� ������ ���Ŭ����(Employees)�� �ۼ��Ͻÿ�
//����� ������� ��� ����
public class Employees {

	int empId;
	String empName;
	String telNum;
	
	
	public void showEmpInfo() {
		System.out.println("-----------------------------");
		System.out.println("   �����ȣ   �����      ��ȭ��ȣ    ");
		System.out.println("-----------------------------");
		System.out.printf("%5d %4s %15s",empId,empName,telNum);
	}

	
}
