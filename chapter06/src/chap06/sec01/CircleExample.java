package chap06.sec01;

public class CircleExample {

	public static void main(String[] args) {
		Circle circle=new Circle();      //circle class��ü  ����
		circle.radius=10.2;              //default�� ����        private����x
		circle.x=300;
		circle.y=500;
		
		circle.getPoint();
		//double res=circle.getArea      1��° ���
		System.out.println("���� ����: " + circle.getArea());  //2��° ���
		
		circle.getCircumference();
		
	}

}
