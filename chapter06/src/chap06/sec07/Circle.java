package chap06.sec07;

public class Circle extends Shape {
	
	private double radius;
	 private final double PI=3.1415926;
	
	Circle(int radius){
		//super();     //
		this.radius=radius;
		
	}
	
	@Override
	public void calcArea() {
		System.out.println("¿ø ¸éÀû: "+ (radius*radius*PI));
	}
	}

	
