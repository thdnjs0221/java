package chapter07.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1= new Student("홍길동",25,"여성","abc@naver.net");//매개변수 써주기
		
		System.out.println("학생명: "+s1.name); //상속 받아서 자식 클래스에 없어도 값 나옴
		System.out.println("나이: "+s1.age);
		
		// People p2=new People("강감찬",30,"남성"); //이미 생성되어 버려서 상속 받을수 없음.
	}

}
