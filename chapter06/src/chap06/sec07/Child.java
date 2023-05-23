package chap06.sec07;

public class Child extends Parent{
	String gender;
	int age=25;
	
	Child(){     //생정자 메소드
		//super(); 자식 클래스 생정자 메소드 첫줄은 super. 부모클래스에서 기본생정자! 꼭 만들어주기
	}
	Child(String gender,String name, int age) {
		super(name,age);   //부모클래스 부를때 사용 
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public int getaAge() {  //
		return age;  //부모클래스 나이 불러오게하려면 super.붙이기
	}
	}
