package chap05.sec01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		Person p1= new Person();
		String str=new String("홍길동");
		int[] score=new int[10];
		
		System.out.println("p1= "+p1);     // .toString메소드 생략 되어진것
		System.out.println("str= "+str);   
		System.out.println("score="+score);    
		
		// System.out.println(args.[0]+ ","args.[0])
	}
	

}
class Person{
	String name;          //멤버변수
	int age;              //멤버변수
	
	Person(){}								  //디폴트 생성자 - 습관적으로 꼭 기술하기
	Person(String name, int age){             //괄호: 생성자 메소드(멤버변수 초기화)
		this.name=name;                       //지역변수
		this.age=age;
		
	}
	
	@Override              //컴파일되어지는 주석
		public String toString() {     
		return this.name;
		
}
}