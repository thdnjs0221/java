package chap06.sec01;

//예제1] 원점과 반지름을 보유한 원(circle) 클래스를 생성하시오
//또 너비와 둘레를 구하는 메소드도 포함하시오

public class Circle {
	double radius;  //반지름
	final double PI=3.1415926;
	 int x;         
	 int y;
	 
	 //원의 넓이
	 
	 public double getArea() {
		 double area=radius*radius*PI;
		 return area;
		 
	 }
	 //원의 둘레
	 public void getCircumference(){//원둘레를 구해서 여기서 인쇄를 해주겠다 반환x 
		getPoint();            //호출 
		 System.out.println("원의 둘레 : "+ (2*radius*PI));
		 
	 }
	 public void getPoint() {     //원의 원점
		 System.out.println("원의 원점 : (" + x + "," + y + ")");
	 }
	
}
