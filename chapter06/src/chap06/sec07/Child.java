package chap06.sec07;

public class Child extends Parent{
	String gender;
	int age=25;
	
	Child(){     //������ �޼ҵ�
		//super(); �ڽ� Ŭ���� ������ �޼ҵ� ù���� super. �θ�Ŭ�������� �⺻������! �� ������ֱ�
	}
	Child(String gender,String name, int age) {
		super(name,age);   //�θ�Ŭ���� �θ��� ��� 
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public int getaAge() {  //
		return age;  //�θ�Ŭ���� ���� �ҷ������Ϸ��� super.���̱�
	}
	}
