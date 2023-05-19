package chap06.sec05;

public class ProductExample {

	public static void main(String[] args) {
		Product p1=new Product("����");
		System.out.println(p1);
		
		Product p2=new Product("���찳");
		System.out.println(p2);
		
		Product p3=new Product("����Ʈ��");
		System.out.println(p3);
		//System.out.println(p1); //static:���ſ� �����Ǿ��� ������ �� ������

	}

}
//��ǰ�ڵ�� 1001���� �ڵ������Ǿ� pid�� ����    ->ù��° ��ǰ�ڵ� 1001���� 1�� ����. ��ü�� �����ɶ� ����
class Product{
	static long pid=1000;            //�������  �ڵ� �ʱ�ȭ�ȴ� //��������� Ư���� ��������//static: ���ſ� �����Ǿ��� ������ �� ������
	String pName;
	
	Product(){}               //��������
	Product(String pName){
		pid++;
		this.pName=pName;
	}
	@Override      //�ݵ�� public�̾����
	public String toString() {   //getter �ѹ� �����Ҷ� , tostring �Ѳ����� ��� ��������
		return "��ǰ��ȣ: "+pid+"\n��ǰ��: "+pName;
		
	}
	
}
