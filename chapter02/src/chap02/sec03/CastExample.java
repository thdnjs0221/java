package chap02.sec03;

import java.util.Scanner;

public class CastExample {
	public static void main (String[] args) {
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����Ͻÿ�
		// import  
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�; ");
		char ch1=(char)sc.nextInt();
	    char ch2= (char)Integer.parseInt(sc.nextLine());
	    System.out.println("character: "+ch2);
	
	
	}

}
