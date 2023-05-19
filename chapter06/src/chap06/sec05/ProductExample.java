package chap06.sec05;

public class ProductExample {

	public static void main(String[] args) {
		Product p1=new Product("볼펜");
		System.out.println(p1);
		
		Product p2=new Product("지우개");
		System.out.println(p2);
		
		Product p3=new Product("포스트잇");
		System.out.println(p3);
		//System.out.println(p1); //static:과거에 참조되었던 값들은 다 없어짐

	}

}
//상품코드는 1001부터 자동생성되어 pid에 저장    ->첫번째 상품코드 1001부터 1씩 증가. 객체가 생성될때 증가
class Product{
	static long pid=1000;            //멤버변수  자동 초기화된다 //멤버변수는 특성들 적혀있음//static: 과거에 참조되었던 값들은 다 없어짐
	String pName;
	
	Product(){}               //지역변수
	Product(String pName){
		pid++;
		this.pName=pName;
	}
	@Override      //반드시 public이어야함
	public String toString() {   //getter 한번 내보닐때 , tostring 한꺼번에 묶어서 내보낼때
		return "제품번호: "+pid+"\n제품명: "+pName;
		
	}
	
}
