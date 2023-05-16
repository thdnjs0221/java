package chap05.sec06;

public class ObjectArrayExample {

	public static void main(String[] args) {
		Books[] book=new Books[3];
		book[0]=new Books("왕초보 영어","EBS",15000);
		book[1]=new Books("경제 입문학","박정호",30000);
		book[2]=new Books("소크라테스 변론","김유원",10000);
		//book[]=book{new Books("왕초보 영어","EBS",15000),
		//			new Books("경제 입문학","박정호",15000)};
		//}
		
		System.out.println("-----------------------------");
		for(Books b : book) {                                        //기능이 강화된 for문 /  book[0] 배열 요소 b에 저장 다음에  book[1]..
			System.out.println(b);
			System.out.println("----------------------------");
		}
		
		

	}

}
class Books{                
	private String title;     //private선언은 외부 클래스 접근 불가능 . 자기 클래스(books)에서만 접근 가능 . 생성자 메소드는 =>객체 초기화에서만 사용  멤버변수 초기화 목적
	private String writer;
	private int price;
	
	public Books() {}
	public Books(String title ,String writer,int price) {
		this.title=title;
		this.writer=writer;
		this.price=price;
		
	}
	@Override       //string 메소드 재정의해서 쓴것
	public String toString() {
		return "책이름 :"+title+"\n저자:"+writer+ "\n가격:"+price;
	}
	
}
