package chap06.sec01;

public class CircleExample {

	public static void main(String[] args) {
		Circle circle=new Circle();      //circle class객체  생성
		circle.radius=10.2;              //default로 선언        private선언x
		circle.x=300;
		circle.y=500;
		
		circle.getPoint();
		//double res=circle.getArea      1번째 방법
		System.out.println("원의 넓이: " + circle.getArea());  //2번째 방법
		
		circle.getCircumference();
		
	}

}
