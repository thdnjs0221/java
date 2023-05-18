package chap06.sec03;

/*예제] 다음조건을 만족하는 원통(Cylinder)클래스를 작성하시오
	멤버 필드: 원클래스 객체, 실수타입의 높이
	메소드: 생성자, 면적을 계산하여 반환 메소드

	[원(Circle)클래스]
	멤버 필드: 반지름(실수: radius)),상수(PI, 3.1415926)
	메소드: 생성자, 면적을 계산하여 반환 메소드


원통의 너비= 원넓이*높이

원의 넓이를 먼저 알아야함. 원의 객체 필요 넓이를 구하는 메소드 */

public class CylinerExample {

	public static void main(String[] args) {
		Cyliner c1=new Cyliner(32.5,new Circle(10));
		
		System.out.println("원통의 부피: "+c1.getVolumn());

	}

}
