package chap06.sec08;

public class DriverExample {

	public static void main(String[] args) {
		new DriverExample().controller();  //�ڱ� �ڽ� ���� �� controller�����̶� static x

	}
	public void controller() {
        Driver driver=new Driver();
		
		Taxi taxi=new Taxi();  //�θ�Ŭ�������� ��ӹ�����
		driver.drive(taxi);
		
		driver.drive(new Bus(15)); // �ڽ� Ŭ���� �Ű����� ���� �־ ����. �ڽ�Ŭ���� �������̵� 

		
	}
}
