package chap05.sec01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		Person p1= new Person();
		String str=new String("ȫ�浿");
		int[] score=new int[10];
		
		System.out.println("p1= "+p1);     // .toString�޼ҵ� ���� �Ǿ�����
		System.out.println("str= "+str);   
		System.out.println("score="+score);    
		
		// System.out.println(args.[0]+ ","args.[0])
	}
	

}
class Person{
	String name;          //�������
	int age;              //�������
	
	Person(){}								  //����Ʈ ������ - ���������� �� ����ϱ�
	Person(String name, int age){             //��ȣ: ������ �޼ҵ�(������� �ʱ�ȭ)
		this.name=name;                       //��������
		this.age=age;
		
	}
	
	@Override              //�����ϵǾ����� �ּ�
		public String toString() {     
		return this.name;
		
}
}