package chap06.sec08;

public class Bus extends Vehicle{
	int passenger;
	
	Bus(int passenger){
		this.passenger=passenger;        //�ڽ� Ŭ���� ���� ����. ������ �����ȴٸ� ���ҷ��� 
		
	}
	@Override
	public void run() {
		System.out.println("�°�"+passenger+"�� �¿� ������ �������Դϴ�");
	
	
}
}