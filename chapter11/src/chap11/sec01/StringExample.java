package chap11.sec01;

public class StringExample {

	public static void main(String[] args) {
		//1. substring(int sindex, int eindex)
		//2. �⺻ ������ Ÿ��=>���ڿ��� ��ȯ
		//=>String.valueOF(�⺻Ÿ���ڷ�);
		//=>�⺻ ������ Ÿ��+""
		//int 100�� ���ڿ��� ��ȯ ���:
		String str1=String.valueOf(100);
		String str2=100+"";
		
		//���ڿ� => �⺻������Ÿ��
		//Wrapper.pase�⺻Ÿ�Ը�(���ڿ�)
		//25.5=> ���ڿ�
		double num1=Double.parseDouble("25.5");
		
	}

}
