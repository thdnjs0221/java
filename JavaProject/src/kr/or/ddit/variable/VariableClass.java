package kr.or.ddit.variable;

public class VariableClass {
/*
  2. ������ Ÿ��
 *   -���� ���� �� �ʱ�ȭ
 *   -���� ��� ��Ģ
 *   -�⺻Ÿ��
 *   -Ÿ�Ժ�ȯ
 *   -������ �ý��� �����
 *   
 * 
 */
	public static void main(String[] args) {
		/*
		 * 1) ���� ���� �� �ʱ�ȭ
		 * 
		 * ������? ���� �����Ҽ��ִ� �޸��� Ư�� ������ ���̴� �̸��̴�
		 * �̷� ���� �� �ʿ���� ���� �����ϱ� ���� �������� ����ϱ�
		 * �׷��� �� ������ �ּҸ� ���´ٴ°��̴�
		 * 
		 * [���� ���� �� �ʱ�ȭ]
		 * int age; 	//��������
		 * age=10;		//���� �ʱ�ȭ
		 *
		 * int num=20;	//���� ���� �� �ʱ�ȭ
		 * 
		 * ** ���⼭ �� �˰� ������ �κ��� , ������ �����ϱ� ���ؼ��� �������� Ÿ���� �ڷ����� �˾ƾ��մϴ� �׷��� ���ؼ��� Ÿ�������� �˰� Ÿ�� ������ ���� �ʱ�ȭ �Ҽ��ִ� ���� �˾ƾ��մϴ�
		 * Ÿ�Ժ� �ʱ�ȭ �Ҽ��ִ� ���� ����̸�, Ÿ�� ������ ����� �ְ� �����´� ����� �ִ� �� �Ʒ�3) ���� �ѹ��� Ȯ���Ҽ��ֵ����մϴ�
		 * 
		 int age =99;        ������ Ÿ���� ���� age�� 99��� ������ �ʱ�ȭ
		 int num; ������ Ÿ���� ���� num�� ����
		 num=1400; ���� nu�� 1400������ �ʱ�ȭ
		 boolean flag= false; ���� Ÿ���� ���� flag�� ��false������ �ʱ�ȭ
		 String str=""; ���ڿ� Ÿ���� ���� str�� ""���鰪���� �ʱ�ȭ
		 str= "Basic Java"; str������ Basic Java ���ڿ��� ���� �ʱ�ȭ
		 
		 
		 *2) ���� ��� ��Ģ
		 *�����̸��� �ڹپ��� ���� ��� ��Ģ�� ������ϴµ� �Ʒ��� ���� ����Ģ�� ��Ű��������
		 *- ù��° ���ڴ� �����̰ų� '$' , '_" �� �����ؾ��ϰ� ���ڷ� �����Ҽ�����
		 *-���� ��ҹ��� �����Ѵ�
		 *-ù���ڴ� �ҹ��ڷ� �����ϰ� �ڿ� �ٸ��ܾ �ٴ� �椷�� �빮�ڷ� �����Ѵ�
		 *>������ �����̿��� ���ʷ� ������
		 *>ī�� ǥ��� �̶�� �Ѵ�
		 *-���� ���� ������ ���� (�׷��ٰ� �ʹ� ��� �ȵǰ� ������ ���)
		 *-�ڹ� ������ ����Ҽ� ����
		 *>ȥ���� p50 ����
		 */
		int boNo =0;
		int bo_hit=0;
		String title="";
		String boContent ="";
		boolean joinFlag= false;
		
		double mathKorNum;		//���������� ������ �ҹ��ڷ� �����Ѵ�
		float floatNum;     	 //������ ���ڷ� �����Ҽ�����
		String $ajaxObject;		 //������ $ ���� �Ҽ�����
	//	int _count;				//������ _�� ���� ����
		//String private;  		// ������ �ȵȴ�.
		
		/*
		 * 3) �⺻ Ÿ��
		 * �⺻�� Ÿ��
		 * ���� �Ǽ� ���� Ÿ���� �⺻Ÿ������ �����Ѵ�
		 * ������ Ÿ��: byte char short int long       
		 * �Ǽ��� Ÿ�� : float double
		 * ���� Ÿ��: boolean
		 * 
		 * **w\������ Ÿ���� ũ�� �ϱ� ���
		 * bc ī��� sil���� !!!
		 *  b c s i l
		 *  1 2 2 4 8
		 *  boolean float double
		 *  1        4      8
		 *  
		 *  ������ Ÿ��
		 *  String Integer Float Double ��
		 * 
		 * 
		 * */
		 byte len=127;
		 short length=128;
		 char ch1='a';  //a���
		 char ch2=64;     //a�� ���
		 int textNum= ch1;  //���� 65��� 
		 int box =2145689511;// int ������ �ִ� �ִ� �� ������ ����
		 long max =999999999;// long ������ �ִ� �ִ� �� ������ ����
		 boolean agree= false;
		 float num1=24;
		// float num2=24.5;
		 float num3=24.516f;
		 double num4= 123.123;    //�Ҽ��� �״�� �Է°���
		 double num5= num3;// ���� �Ǽ����̱� ������ ��������� �ִ�
		 
		 
		 /*4)Ÿ�� ��ȯ
		  * Ÿ�� ��ȯ�̶� �ش� ������ Ÿ���� �ٸ� ������ ��Ÿ������ ��ȯ�ϴ� ���̴�
		  * 
		  * Ÿ�Ժ�ȯ�� ū ��� ���� Ÿ��= ���� ��� ��ƢŸ��;
		  * 
		  * [ũ�����]
		  * byte short int long float double
		  * 
		  * ���� Ÿ�� ��ȯ(ĳ����)
		  * ���� ��� ���� = (ū ��� ����)��;
		  * 
		  * ������ Ÿ���� �Լ��� �̿��� Ÿ�� ��ȯ
		  * ������ Ÿ��.parse������ Ÿ��
		  * >Integer.parseInt ();
		  * >Integer.parseByte();
		  * >Short.parseShort();
		  * >Double.parseDouble();
		  * 
		  * ������ Ÿ���� �Լ��� �̿��� ����ȯ�� Ư¡�� �ִµ� ��ȯ�ϰ��� �ϴ� Ÿ���� �� ���¸� ���� �־���Ѵ�
		  * 
		  * �ڷ����� ���� �⺻��(������)
		  * �ڷ��� �⺻��
		  * byte 0
		  * short 0
		  * int 0
		  * long 
		  * float 0.0f
		  * char '\u0000'(null)
		  * boolean false
		  * 
		  * 
		  * 
		  */
		 
		 byte byteValue=127;
		 int intValue=1+byteValue;
		 long longValue=90000000L;
		 float floatValue= longValue;
		 double doubleValue=longValue;
		 char charValue='a';
		 int intValue2=charValue;
		 
		 
		 System.out.println(byteValue);
		 System.out.println(intValue);
		 System.out.println(longValue);
		 System.out.println(floatValue);
		 System.out.println(doubleValue);
		 System.out.println(charValue);
		 System.out.println(intValue2);
		 
		 int a =128;
		 byte b = (byte)a;   // -128~127
		 System.out.println(b);
		 
		 
		
	}
}
