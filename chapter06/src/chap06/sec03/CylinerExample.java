package chap06.sec03;

/*����] ���������� �����ϴ� ����(Cylinder)Ŭ������ �ۼ��Ͻÿ�
	��� �ʵ�: ��Ŭ���� ��ü, �Ǽ�Ÿ���� ����
	�޼ҵ�: ������, ������ ����Ͽ� ��ȯ �޼ҵ�

	[��(Circle)Ŭ����]
	��� �ʵ�: ������(�Ǽ�: radius)),���(PI, 3.1415926)
	�޼ҵ�: ������, ������ ����Ͽ� ��ȯ �޼ҵ�


������ �ʺ�= ������*����

���� ���̸� ���� �˾ƾ���. ���� ��ü �ʿ� ���̸� ���ϴ� �޼ҵ� */

public class CylinerExample {

	public static void main(String[] args) {
		Cyliner c1=new Cyliner(32.5,new Circle(10));
		
		System.out.println("������ ����: "+c1.getVolumn());

	}

}
