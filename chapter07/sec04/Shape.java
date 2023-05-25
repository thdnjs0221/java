package chapter07.sec04;

public abstract class Shape {
	String kind;
	
	Shape(String kind){
		this.kind=kind;
	}

	//@Override
	public void draw() {
		System.out.println("kind");
		
	}

}
