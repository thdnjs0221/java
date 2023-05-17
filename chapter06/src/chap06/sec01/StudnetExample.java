package chap06.sec01;

public class StudnetExample {//일을 시키는 클래스

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStdID(1001);
		s1.setStdName("이순신");
		
		//s1.showInfo();             //둘중하나 쓰기
		System.out.println(s1);		 //둘중하나 쓰기
		
	//	Student s2=new Student(1002,"홍길순");
		//System.out.println(s2);
		
	}

}

class Student{
	private long stdID;        //private 외부에서 데이터 넣을수 없음     //멤버변수
	private String stdName;	   //초기화->생성자메소드 이용,기본키 제외 값 변경시 public 
	
	public Student() {}			//생성사 메소드는 class이름과 같다. public으로 사용
								//public Student() {}	->기본 생성자  쓰느거 습관화하기, 매개변수 없을때 쓰기
	
	public Student(long stdID,String stdName ) {   //지역변수.지역변수는 지역변수 안에서만 사용가능 . 외부에서 데이터 받아서 멤버변수 전달해주는게 목적
		this.stdID=stdID;    //this 사용-> 지역변수와 멤버변수가 스펠링 똑같을때 지칭할때 사용. 자기 클래스 주소값 저장.변수stdID->클래스stdID에
		this.stdName=stdName;
	}
	
	public void setStdID(long stdID)  //반환값이 없음
	{
		this.stdID=stdID; 
	}
	public void setStdName(String stdName)
	{
		this.stdName=stdName; 
	}
	public void showInfo() {
	System.out.println("학번: "+stdID);
	System.out.println("이름: "+stdName);

}
	@Override
	public String toString() { //문자열로 반환하세요
		return "학번: "+stdID+"\n이름: "+stdName;
		
		
	}
}