package chap06.sec08;

public class Driver {
	//public void drive(Bus bus) {   //오버로딩  : 한클래스 안에 이름이 똑같은 메소드 존재해야함.괄호안에 타입이 다름
	//bus.run();
		
	//}
	//public void drive(Taxi taxi) {
	//	taxi.run();
	public void drive(Vehicle vehicle) {
		vehicle.run();          //오버로딩을 간단하게 ->다형성 
		
	}
}
