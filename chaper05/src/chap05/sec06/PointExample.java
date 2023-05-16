package chap05.sec06;

public class PointExample {

	public static void main(String[] args) {
		Point p1=new Point(100,200);
		Point p2=(Point)p1.clone();    // p1.clone 호출
		
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		
	}

}

class Point implements Cloneable{       //Cloneable인터페이스 
	int x;
	int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	@Override                                 // 공식처럼 외우기 override 생성
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();      
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj; 
	}
	
}