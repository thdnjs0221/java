package kr.or.ddit.study;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		/*
		 * 1.���ǹ�
		 * -���ǽ��� ����� ���� ��� ���� ���ΰ� ����
		 * 
		 * > ���ǹ��� �����δ� if ans switch���� �ֽ��ϴ�
		 * >if���� ���ǽ��� ����� true/false�Ŀ� ���� ���๮�� �����˴ϴ�
		 * >switch���� ������ ���� ���� �� case�� ���� ��ġ�ϴ� ���๮�� �����˴ϴ�
		 * 
		 * 
		 * 
		 * ~�϶�, � ���ǿ� ���� �Ŀ� ���� ������ �������� ���ǹ� if��Ʈ�� ���������� �����Ѵ�
		 * 
		 * ���ǹ� if 
		 * ���ǹ��� ���� �ܰ� ������ ¦�� Ȧ�� ����
		 * 
		 *
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		//�Է¹��� ���ڿ��� ���� int �� ����ȯ
		int numValue = Integer.parseInt(sc.nextLine());
		String result="";
		
		if(numValue % 2==0) {
			result=numValue+": ¦���Դϴ�";
			
		}else {
			result=numValue+": Ȧ���Դϴ�";
		}
		System.out.println(result);
		
		// on off �� �Ӽ��ִ� ���� ����ġ�� ������
		//����1)
		//-���ڿ� click�̶�� ������ null�� ���� �� �ʱ�ȭ ���ּ���
		//-1�Ǵ� 2�� �Է� �޾Ƽ� �Է� ���� ���� ���� �Ʒ� ������ ������ּ���
		//click���� 1�϶� �����ġ�� on�˴ϴ� ������ּ���
		//click���� 2�϶� �����ġ�� off�˴ϴ� ������ּ���
		
		String click=null;
		click=sc.nextLine();
	
		if(click.equals("1")) {
			System.out.println("���� ����ġ�� on �˴ϴ�");
		}else if(click.equals("2")){
			System.out.println("���� ����ġ�� on �˴ϴ�");
		}else {
		System.out.println("���� ����ġ ������>");
		
		
		//���� ���α׷� ������
		//����2)
		//[���� ��� ����]
		//90�� �̻��� A
		//80�� �̻�, 90�� �̸� B
		//70�� �̻�, 80�� �̸� C
		//60�� �̻�, 70�� �̸� D
		//60�� �̸� F
		//-������ �ܼ�â�� �Է¹ް�, ���� ��� ���ǿ� ���� ����� ������ּ���
		//����� �������� �����Ӱ�
		
		System.out.println("������ �Է����ּ���: ");
		String in =sc.nextLine();
		
		int num=Integer.parseInt(in);
	String grade="";
		if(num>=90) {
			grade="A";
		}else if(num>=80 && num <90 ) {
			grade="B";
		}else if(num>=70 && num <80 ) {
			grade="C";
		}else if(num>=60 && num <70 ) {
			grade="D";
		}else {
			grade="F";
		}

	}
	}
	}
