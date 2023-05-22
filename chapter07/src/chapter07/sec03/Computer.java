package chapter07.sec03;

public class Computer extends Product{
	Computer(){
		super(500);   //부모클래스의 메소드 부름
		
	}
	@Override
	public String toString() {
		return "COMPUTER";
	}
	
}
