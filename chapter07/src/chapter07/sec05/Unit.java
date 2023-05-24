package chapter07.sec05;
//부모클래스
public abstract class Unit {
	int x;        //좌표점
	int y;
	String nm;  //유닛 이름
	
	Unit(String nm){    
		this.nm=nm;
	}
	public void stop(String nm, int x, int y) {
		System.out.println(nm+ "이 (" + x + y + ") 에 멈춥니다");
	}
	
	public abstract void move(int x, int y);	
}


class Marine extends Unit{
//	int x;        
//	int y;
//	String nm;  부모로 부터 상속 받은거 있음
	
	Marine(){
		super("해병");  //부모 클래스 상속 받은 
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm+"이 ("+this.x+","+this.y+")에서 ("+ x + ","+y+") 위치로 이동합니다");
	}
	
	public void stimPack() {
		System.out.println("공격모드: 스팀팩 장전"); //고유메소드		
	}
}
class Tank extends Unit {
	Tank(){
		super("탱크");	 //부모 클래스 상속 받은 
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm+ "가 (" + x + "," + y +")로 이동합니다");
		
	}
	
	public void sizeMode() {
		System.out.println("공격모드: 시즈모드로 전환"); 	
	}	
}