package chap06.sec07;

public class InheritenceExample {

	public static void main(String[] args) {
		Child c1=new Child("남성","홍길동",45);
		System.out.println("이름: "+c1.getName());  //부모나이. name 부모 클래스에서 상속받은거
		System.out.println("나이: "+c1.getaAge());	//자식 나이. 

	}

}
