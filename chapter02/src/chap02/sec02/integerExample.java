package chap02.sec02;

public class integerExample {

	public static void main (String[] args) {
		// ����Ÿ��: byte short int(�⺻��) long
		//1)
		//byteMethod();
		shortMethod();
	}
	public static void byteMethod() {
		//byte : 1 byte����
		//       127~ -218������ ������  ����, 
		//       ���� ������ ����� ����
		//       ����� �����Ͱ� ������ ����� ��ȯ����� ��� ��ȯ
		//       (0,1,2,..127,-128,-127,...-1) 
		byte b1=127;
		byte b2=-128;
		 System.out.println("b1="+b1);
		b1++; 
		// b1�� ���� 1 ���� ���Ѷ�
		System.out.println("b1="+b1);
	}
	
		public static void shortMethod() {
			//short : 2 byte����
			//       32767 ~ -32768 ������ ������  ����, 
			//       ���� ������ ����� ����
			//       ����� �����Ͱ� ������ ����� ��ȯ����� ��� ��ȯ
			//       (0,1,2,..32767,-32768,-32767,...-1) 
			
			//short sh=32768; ���� 
			short sh2=200;
			short sh3=32767;
			System.out.println(++sh3);
			
	}
		
		public static void intMethod() {
			//int :  4 byte����
			//       �⺻������
			//       2147483647 ~ -2147483648 ������ ������  ����, 
			//       ���� ������ ����� ����
			//       ����� �����Ͱ� ������ ����� ��ȯ����� ��� ��ȯ
			//       (0,1,2,..2147483647,-2147483648,-2147483647,...-1) 
			//       int ���� �����͵���  int�� ���� 
		    int num=200;
	        int num1= 10000000;
	        long num2=10000000L;
	   
			
			int res= num1*num1;
			System.out.println(res);
			
			long res1= num1*num1;
			System.out.println(res1);
		}
			
	}
		


