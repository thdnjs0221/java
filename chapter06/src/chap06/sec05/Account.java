package chap06.sec05;

public class Account {
	private static Account ac=null; //자기자신 저장 되어질수있는 객체 /정적으로 만들어지고 클래스 밖에서 접근 못함/ac=null;아직 객체 생성x
	private Account() {}   //생성자 메소드 private로선언. 외부에서 불러서 쓸수 없음 
	
	public static Account getInstance() { //getInstance()메소드-  Account객체 생성 안하고 클래스를 불러다 쓰겠다.
		if (ac==null) ac= new Account();  //객체 생성x-> 객체 생성 후 그 값을 return.
		return ac;						  //
	}
	
}
