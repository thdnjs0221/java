package chapter07.sec01;

public class Student extends People {  //자식클래스
	private String ssn;
	
	Student(String name, int age, String gender, String ssn ){
		super(name, age, gender);  //부모
		this.ssn=ssn; //
		
		
	}
	
}
