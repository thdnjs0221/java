package chap03.sec01;

public class BinaryOperator02 {

	public static void main(String[] args) {
		// ��Ʈ,����,�̵�=>���׿�����
		//bitwiseOperator();
		shiftOperator();
	}
	public static void bitwiseOperator() {
		// ��Ʈ�� ������: |,&,^
		int n1=35; // 100011
		int n2=23; // 010111 
		           //&000011=3 |110111=55 ^110100=52
		System.out.println("n1 & n2 = "+ (n1 & n2));
		System.out.println("n1 | n2 = "+ (n1 | n2));
		System.out.println("n1 ^ n2 = "+ (n1 ^ n2));
	}
	
	public static void shiftOperator() {
		//shift : >>(right) , <<(left)
		//, >>> (right shift with sign bit
		int num = 35;
		//int = 4 byte
		System.out.println("35>>2 = "+ (num>>2));
		System.out.println("35<<2 = "+ (num<<2));
		num=-35;
		System.out.println("35>>>1 = "+ (num>>>1));
		
		
	}
	public static void  assignOperator() {
		//���� : =, �켱������ ���� ����
		// ���մ��Կ�����: +=,-=, /+, *=, %=
		// ����=���� ������(+,-,/,*) ��
		// ���� ������= �� 
		
		int res=0;
		int num=100;
		
		res=res+10; // res+=10; �̷��� �ᵵ ��
		
		res=res*(num/10); //res*=(num/10); �̷��� �ᵵ ��
		
		
		
	
	
	}
	
}
