package chap06.sec07;

public class Rectangle extends Shape {
	
	int height ,width;
	
	Rectangle(int width,int height){    
		this.width=width;
		this.height=height;
	}
	@Override
	public void calcArea() {
		System.out.println("사각형 면적: "+ (width*height));
	}
	

}


