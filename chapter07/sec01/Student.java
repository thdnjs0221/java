package chapter07.sec01;

public class Student extends People {  //�ڽ�Ŭ����
	private String ssn;
	
	Student(String name, int age, String gender, String ssn ){
		super(name, age, gender);  //�θ�
		this.ssn=ssn; //
		
		
	}
	
}
