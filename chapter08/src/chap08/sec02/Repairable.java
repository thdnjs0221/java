package chap08.sec02;

public interface Repairable { } //인터페이스 안에 코드가 없어서 재정의할게없음

class Unit{
	int hitpoint;  //잔량
	final int MAX_HP; //상수가 되어지기위해는 한번은 = 사용해야함 ' MAX_HP=hp;'/
	
	Unit(int hp){
		MAX_HP=hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(150);
	
		}
	@Override
	public String toString() {  //
		return "SCV";
	}
	public void repair(Repairable r) { //매개변수로 다형성 지원받음
		if(r instanceof Unit) {
			Unit u=(Unit)r;  //다운캐스팅
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다");
		}
	}
}
class Tank extends GroundUnit implements Repairable{// GroundUnit상속 받고  Repairable인터페이스 를 구현
	Tank(){                   // int hitpoint;   final int MAX_HP; 가지고 있음
	                          
		super(150);         //GroundUnit의 생성자를 부름 , 히트포인트는 0
	}
	@Override
	public String toString() {
		return "Tank";
	}
	}
class Marine extends GroundUnit implements Repairable{
	Marine(){
		super(150);
	}
	@Override
	public String toString() {
		return "Marine";
	}
	}
class DropShip extends GroundUnit implements Repairable{
	DropShip(){
		super(150);
	}
	@Override
	public String toString() {
		return "DropShip";
	}
	}