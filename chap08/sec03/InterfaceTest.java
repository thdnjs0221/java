package chap08.sec03;

public class InterfaceTest {

	public static void main(String[] args) {
		A a=new A(); //사용자
		a.methodA(new B());// a 사용자가 해당하는 기능을 호출하기 위해 b 클래스 객체 생성해서 호출
						  //사용자와 제공자가 직접관계 
		
	}

}
