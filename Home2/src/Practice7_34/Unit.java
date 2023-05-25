package Practice7_34;

abstract class Unit {
	int x ,y;
	abstract void move(int x,int y);
	void stop() {}
	}
class Marine extends Unit{
	void move(int x,int y) {
		System.out.println("Marine[x"+x+","+"y"+y+"]"); }
	void stimPack() {}
	}
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x"+x+","+"y"+y+"]"); }
	void changeMode() {}
	}
class Dropship extends Unit{
	String load;
	void move(int x, int y) {
		System.out.println("Dropship[x"+x+","+"y"+y+"]"); }
	void load() {
		System.out.println("태운다");
	this.load=load;
	}
	void unload() {}
}
	
	
