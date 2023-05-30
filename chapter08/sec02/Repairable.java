package chap08.sec02;

public interface Repairable { } //�������̽� �ȿ� �ڵ尡 ��� �������ҰԾ���

class Unit{
	int hitpoint;  //�ܷ�
	final int MAX_HP; //����� �Ǿ��������ش� �ѹ��� = ����ؾ��� ' MAX_HP=hp;'/
	
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
	public void repair(Repairable r) { //�Ű������� ������ ��������
		if(r instanceof Unit) {
			Unit u=(Unit)r;  //�ٿ�ĳ����
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString()+"�� ������ �������ϴ�");
		}
	}
}
class Tank extends GroundUnit implements Repairable{// GroundUnit��� �ް�  Repairable�������̽� �� ����
	Tank(){                   // int hitpoint;   final int MAX_HP; ������ ����
	                          
		super(150);         //GroundUnit�� �����ڸ� �θ� , ��Ʈ����Ʈ�� 0
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