/**
 * 
 */
package chap03.sec01;

/**
 * @author PC-14
 *
 */
public class UnaryOperator {
	public static void main(String[] args) {
		//���׿����� : ��ȣ(-,+), ����(++,--), ������(!)
		//signOperator() ;
		//incrementOperator();
		logicalNot();
		
	}
	public static void signOperator() {
		// ��ȣ ������: ����(-),���(+),
		int num1=100;
		int num2=-num1;
		// 1-2+3-4....-10=?
		//1�� ���� ��� ��Ģ, -1(ó����)�� �����ִ�
		System.out.println("num1="+num1);
		System.out.println("num2"+num2);
		//���ڿ�+���� = ������ ���ڿ��� ����
		//{} �޼ҵ��� ����. ������ ���� �޼ҵ�� ���ư� �����Ű���� ���θ޼ҵ忡 �Է�
		//���θ޼ҵ尡 ������ ��ü���α׷� ����
	}
	
	public static void incrementOperator() {
		//����������: ++,--	}
		int num=100;
		int res1=0;
		int res2=0;
		
		res1=num++;//postfix ǥ���
		//System.out.println("num="+num+"\nres1="+res1);
		System.out.println("num++="+(num++)+", num="+num);
		//num++(res1 ����� ����) 1������ 100 + 1= 101
		//++num num�� 1 ���� ��Ų �� 101
		//
		
		
		
		num=100;
		//res2=++num;//prefix ǥ��� ���� ��Ű�� �� �־���
		//System.out.println("num="+num+"\nres2="+res2);
		System.out.println("++num="+(++num)+", num="+num);
	}
		public static void logicalNot() {
			//�� ���� ������: !
			//	��۱��(toggle): ���� ������ �ݺ��Ǵ� ���
			//	-�ѿ���ȯ, ����/������� ��
			boolean powerState= true;
			while (true) {
			if (powerState) {
				System.out.println("���� ����ġ�� on����");
			}else{
				System.out.println("���� ����ġ�� off����");
			}
			powerState=!powerState; //���̸� �������� ������ ������  ����:ctrl+q
			
			// while- �߰�ȣ������ ��ȣ�� ���� �ɶ����� ���ѷ��� 
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
}
