package chap02.sec03;

public class CastExample03 {
	public static void main(String[] args) {
	   
	//[����] 1���� 365.2422���̴�. �� �ڷ��
	// "1����  365��   xx �ð�  xx��  xx�� �̴�"�� ����ϵ��� ���α׷� �Ͻÿ�....
	//5�ð� 48�� 46��
	
	//0.2422*24
	//0.8128*60
	//0.768*60
	
	double doubleValue=0.2422*24;
	int intValue= (int) doubleValue;

	System.out.println((int)doubleValue+"�ð�");
	
	double doubleValue1= 0.2422*24;
	//System.out.println(doubleValue);
	
	
	
	double doubleValue2=0.8128*60;
	int intValue1= (int) doubleValue2;
	System.out.println((int)doubleValue2+"��");
	
	double doubleValue3=0.768*60;
	int intValue2= (int) doubleValue3;
	System.out.println((int)doubleValue3+"��");
	
	/*double Second;
	Second=0.768*60;
	System.out.println((int)Second+"��");*/
	System.out.println("1���� 365�� "+ (int)doubleValue+"�ð� "+(int)doubleValue2+"�� "+(int)doubleValue3+"�� �̴�");
	
	}
}

