package chap06.sec08;

public class DriverExample {

	public static void main(String[] args) {
		new DriverExample().controller();  //자기 자신 생성 후 controller실행이라 static x

	}
	public void controller() {
        Driver driver=new Driver();
		
		Taxi taxi=new Taxi();  //부모클래스에서 상속받은거
		driver.drive(taxi);
		
		driver.drive(new Bus(15)); // 자식 클래스 매개변수 직접 넣어서 생성. 자식클래스 오버라이딩 

		
	}
}
