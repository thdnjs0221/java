package chap05.sec02;

public class OneDimArrayExample {

	public static void main(String[] args) {
		int score[]= {80,75,95,80,88};   // 80,75,95,80,88 �ּҰ� score�� ������
		OneDimArray od= new OneDimArray();
		od.method1();
		int sum= od.addArray(score);
		System.out.println("\n�հ�="+od.addArray(score));

	}
}
class OneDimArray{
	public  void method1() {
		//���� 1]���� 5���� �����ϴ� �迭�� �����ϰ� 10,20,30,40,50�� ������ �� ����Ͻÿ�
		
		int[] num1=null;   //�ʱ�ȭ ���ֱ�  
		num1=new int[5];
		
		char[] num2= new char[5];
		
		
		char[] num5= {'a', 'b', 'c','d','e'};       // new ����   
		num2= new char[]{'a', 'b', 'c','d','e'};    // =
		
		
		boolean[] num3= new boolean[5];
		
		for(int i =0; i<num2.length; i++) {
			System.out.print(num3[i]+ ",");
		}
		
	
}
		public int addArray(int[]jumsu) {
		int sum=0;

		for (int i=0; i<jumsu.length; i++) {
		sum+=jumsu[i];
	}
		return sum;
}
	//����2] Ű����� 5���� ģ���̸� �Է� �޾� �迭�� �����ϰ� �������� ����Ͻÿ�
		

	









}





