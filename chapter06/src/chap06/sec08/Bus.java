package chap06.sec08;

public class Bus extends Vehicle{
	int passenger;
	
	Bus(int passenger){
		this.passenger=passenger;        //자식 클레스 고유 변수. 다형성 지원된다면 못불러옴 
		
	}
	@Override
	public void run() {
		System.out.println("승객"+passenger+"명 태운 버스가 운행중입니다");
	
	
}
}