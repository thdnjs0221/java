package chap06.sec01;

public class StudnetExample {//���� ��Ű�� Ŭ����

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStdID(1001);
		s1.setStdName("�̼���");
		
		//s1.showInfo();             //�����ϳ� ����
		System.out.println(s1);		 //�����ϳ� ����
		
	//	Student s2=new Student(1002,"ȫ���");
		//System.out.println(s2);
		
	}

}

class Student{
	private long stdID;        //private �ܺο��� ������ ������ ����     //�������
	private String stdName;	   //�ʱ�ȭ->�����ڸ޼ҵ� �̿�,�⺻Ű ���� �� ����� public 
	
	public Student() {}			//������ �޼ҵ�� class�̸��� ����. public���� ���
								//public Student() {}	->�⺻ ������  ������ ����ȭ�ϱ�, �Ű����� ������ ����
	
	public Student(long stdID,String stdName ) {   //��������.���������� �������� �ȿ����� ��밡�� . �ܺο��� ������ �޾Ƽ� ������� �������ִ°� ����
		this.stdID=stdID;    //this ���-> ���������� ��������� ���縵 �Ȱ����� ��Ī�Ҷ� ���. �ڱ� Ŭ���� �ּҰ� ����.����stdID->Ŭ����stdID��
		this.stdName=stdName;
	}
	
	public void setStdID(long stdID)  //��ȯ���� ����
	{
		this.stdID=stdID; 
	}
	public void setStdName(String stdName)
	{
		this.stdName=stdName; 
	}
	public void showInfo() {
	System.out.println("�й�: "+stdID);
	System.out.println("�̸�: "+stdName);

}
	@Override
	public String toString() { //���ڿ��� ��ȯ�ϼ���
		return "�й�: "+stdID+"\n�̸�: "+stdName;
		
		
	}
}