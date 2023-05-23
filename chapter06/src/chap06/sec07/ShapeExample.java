package chap06.sec07;
/*문제1] 원(Circle),사각형(Rectangle), 삼각형(Triangle) 클래스는 도형클래스(Shape)를 상속받아
	생성된다.
	1)도형클래스는 면적을 구하는 메소드(calcArea)만 존재한다.-  System.out.println("면적을 계산")만 존재
재정의 2)원(Circle)- 속성: 반지름
		 메소드: 면적을 구하는 메소드(calcArea),pi r의2제곱
			둘레를 구하는 메소드(calcCircum)2 pi r(반지름)

	3) 사각형(Rectangle)-속성: 가로(width), 세로(height)
		 메소드: 면적을 구하는 메소드(calcArea)

	3) 삼각형(Triangle)-속성: 밑변(width), 높이(height)
		 메소드: 면적을 구하는 메소드(calcArea)이다.

공통: 면적을구하는 메소드
*/
public class ShapeExample {

	public static void main(String[] args) {
		Shape s1=new Circle(15);  //부모의 타입의 변수로 저장시키는것 - 다형성
		s1.calcArea();
		
		Shape s2=new Rectangle(20,40);
		s1.calcArea();
		
	}
}


