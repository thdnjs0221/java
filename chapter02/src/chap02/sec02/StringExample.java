package chap02.sec02;

public class StringExample {
	public static void main (String[] args) {
		//   String : ���ڿ� ó�� ��ü
		//  		 "" �� ���� ���ͷ� ó��
		//  		 "+" �����ڴ� �� ���ڿ��� ���ս�ų�� ���
		//**��ü�鿡 ���� �������(==)�� �ּҰ��� ���ϸ�
		//  ����񱳴� .equals()�޼��带 ����ؾ��Ѵ�
		//
		String name1="�̼���";
		String name2="�̼���";
		
		String name3= new String ("�̼���");
		String name4= new String ("�̼���");
		//new�� heap�� ����, ������ 2�� �����(������)
		//String�� name�� �ּҰ� �ƴ� ���� ���
	
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		
		System.out.println(name3.toString());
	
		Person p1= new Person ("�̼���");
		System.out.println("p1="+p1.toString());
	}
}

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name;

	}
}


