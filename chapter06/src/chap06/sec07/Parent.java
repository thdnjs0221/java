package chap06.sec07;

public class Parent {
	String name;
	int age;
	
	Parent(){} //�⺻������ �޼ҵ�      �θ�Ŭ�����ΰ�� ����ó�� ����ϱ�. ������ �޼ҵ�� ���x
	Parent(String name, int age){  //�������� ������? ��ü�� ��������� ��������� �ʱⰪ�� �Ҵ�/ ��������� �ڵ� �ʱ�ȭ(age=age+1 ����  age0���� �ʱ�ȭ) / ���������� �ڵ��ʱ�ȭx �ʱ�ȭ�����ʰ� ����ϸ� ����
	//�ʱ�ȭ���: �ʵ�?�� ���� �ʱ�ȭ=,�ʱ�ȭ��ϻ��,�����ڸ޼ҵ�
		this.name=name;
		this.age=age;
	}

}
