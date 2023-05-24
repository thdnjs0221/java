package chapter07.sec05;
//�θ�Ŭ����
public abstract class Unit {
	int x;        //��ǥ��
	int y;
	String nm;  //���� �̸�
	
	Unit(String nm){    
		this.nm=nm;
	}
	public void stop(String nm, int x, int y) {
		System.out.println(nm+ "�� (" + x + y + ") �� ����ϴ�");
	}
	
	public abstract void move(int x, int y);	
}


class Marine extends Unit{
//	int x;        
//	int y;
//	String nm;  �θ�� ���� ��� ������ ����
	
	Marine(){
		super("�غ�");  //�θ� Ŭ���� ��� ���� 
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm+"�� ("+this.x+","+this.y+")���� ("+ x + ","+y+") ��ġ�� �̵��մϴ�");
	}
	
	public void stimPack() {
		System.out.println("���ݸ��: ������ ����"); //�����޼ҵ�		
	}
}
class Tank extends Unit {
	Tank(){
		super("��ũ");	 //�θ� Ŭ���� ��� ���� 
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm+ "�� (" + x + "," + y +")�� �̵��մϴ�");
		
	}
	
	public void sizeMode() {
		System.out.println("���ݸ��: ������� ��ȯ"); 	
	}	
}