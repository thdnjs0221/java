package chap06.sec07;

public class Parent {
	String name;
	int age;
	
	Parent(){} //기본생성자 메소드      부모클래스인경우 습관처럼 사용하기. 생성자 메소드는 상속x
	Parent(String name, int age){  //생정자의 목적은? 객체가 만들어지고 멤버변수에 초기값을 할당/ 멤버변수는 자동 초기화(age=age+1 가능  age0으로 초기화) / 지역변수는 자동초기화x 초기화하지않고 사용하면 오류
	//초기화방법: 필드?에 직접 초기화=,초기화블록사용,생성자메소드
		this.name=name;
		this.age=age;
	}

}
