package chap03.sec01;

import java.util.Scanner;

public class BinaryOperator01 {
	static Scanner sc=new Scanner(System.in);
	//Ŭ���� ��𿡼��� sc ��밡�� (�������)
	public static void main(String[] args) {
		// ���� ������: ��κ��� ������(���, ��������, ����, ��Ʈ, ����,�̵�)
		//arithmeticOperator();
		//relationalOperator();
		logicalOperator();
	
	}
	
	public static void arithmeticOperator() {
		// ���������: +,-,/,*,%
		int n1=100;
		int n2=15;
		
		System.out.println("n1="+ n1+"\nn2=" +n2);
		System.out.println("n1+n2 :"+(n1+n2));
		System.out.println("n1-n2 :"+(n1-n2));
		System.out.println("n1*n2 :"+(n1*n2));
		System.out.println("n1/n2 :"+(n1/n2));
		System.out.println("n1%n2 :"+(n1%n2));
		}
	
	public static void relationalOperator() {
		//���迬����: >,<,=,>=,<=,!=(<>)
		
		// Ŭ���� �̸� �빮�� ���� (integer,scanner)
		System.out.print("�����Է� : ");
		int score= Integer.parseInt(sc.nextLine());
		String grade="";
		
	 if(score>=90) { 
		 grade="A����";
	 }else if (score>=80) {
		 grade="B����";
	 }else if (score>=70) {
		 grade="C����";
	 }else if (score>=60) {
		 grade="D����";
	 }else {
		 grade="F����";
		
		}
	System.out.println("����: "+score+"\n����: "+ grade);
	
	}
	public static void logicalOperator() {
		//����: 4�ǹ���̸鼭 100�� ����� �ƴϰų� �Ǵ� 400�� ����� �Ǵ� �� 
		//
		
		System.out.print("�⵵ �Է�: ");
		int year=sc.nextInt();
		//����Ű�� �ƴ� ����
		
		if( (year%4==0 && year%100!=0) || (year%400==0) ){
			System.out.println(year+"�⵵�� �����Դϴ�.");
		}else {
			System.out.println(year+"�⵵�� ����Դϴ�.");
			
		}
		
	}
	
	
}
