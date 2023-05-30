package chap11.sec01;
//StringBuffer, StringBuilder : String Ŭ������ ����(immutable)
//�� ������ Ŭ����
//append()�޼��带 �̿��Ͽ� ����� ���ڿ� ���� ���ο� ���ڿ� �߰� ����)
//������ toString()�� �̿��Ͽ� ���ڿ� (String) Ÿ�����κ�ȯ

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("ȫ�浿");
		StringBuffer sb2=new StringBuffer("ȫ�浿");
		
		if(sb1.equals(sb2)) { // ���ڿ��� ���ϰ������ sb1.toString/sb2.toString.
			System.out.println("���� ����");
		}else {
			System.out.println("�ٸ� ����");
		}
		
		sb.append("select * \n "); //append�޼���: �߰�
		sb.append("  from member \n ");
		sb.append(" where mem_id=? ");
		
		String str=sb.toString(); //toString���ڷ� ��ȯ���Ѿ���toString ȣ���ؾ���
		System.out.println(str);

	}

}
