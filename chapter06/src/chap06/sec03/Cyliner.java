package chap06.sec03;

public class Cyliner {
	//���� 
	private double height;
	Circle circle;
	
	Cyliner(){}
	Cyliner(double height,Circle circle){
		this.height=height;
		this.circle=circle;
	}
	public double  getVolumn() {
		return height*circle.getArea();        //�� ����
	}

}
