package chapter07.sec03;

public class Tv extends Product {
	Tv(){
		super(1000);   //부모클래스의 메소드 부름
		
	}
	@Override
	public String toString() {
		return "TV";
	}
	
}
