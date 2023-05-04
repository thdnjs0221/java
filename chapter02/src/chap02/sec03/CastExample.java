package chap02.sec03;

import java.util.Scanner;

public class CastExample {
	public static void main (String[] args) {
		// 키보드로 글자 하나를 입력 받아 그 글자의 유니코드를 출력하시오
		// import  
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력; ");
		char ch1=(char)sc.nextInt();
	    char ch2= (char)Integer.parseInt(sc.nextLine());
	    System.out.println("character: "+ch2);
	
	
	}

}
