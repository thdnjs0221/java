package kr.or.ddit.study;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		/*
		 * 1.조건문
		 * -조건식의 결과에 따라 블록 실행 여부가 결정
		 * 
		 * > 조건문의 종류로는 if ans switch문이 있습니다
		 * >if문은 조건식의 결과가 true/false냐에 따라 실행문이 결정됩니다
		 * >switch문은 변수의 값에 따라 각 case의 값과 일치하는 실행문이 결정됩니다
		 * 
		 * 
		 * 
		 * ~일때, 어떤 조건에 대한 식에 대한 문제를 만났을때 조건문 if셋트가 생각나도록 공부한다
		 * 
		 * 조건문 if 
		 * 조건문중 가장 단골 문제인 짝수 홀수 문제
		 * 
		 *
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		//입력받은 문자열의 값을 int 로 형변환
		int numValue = Integer.parseInt(sc.nextLine());
		String result="";
		
		if(numValue % 2==0) {
			result=numValue+": 짝수입니다";
			
		}else {
			result=numValue+": 홀수입니다";
		}
		System.out.println(result);
		
		// on off 로 켤수있는 전등 스위치를 만들어보자
		//문제1)
		//-문자열 click이라는 변수를 null로 선언 및 초기화 해주세요
		//-1또는 2를 입력 받아서 입력 받은 값에 따라서 아래 내용을 출력해주세요
		//click값이 1일때 전등스위치가 on됩니다 출력해주세요
		//click값이 2일때 전등스위치가 off됩니다 출력해주세요
		
		String click=null;
		click=sc.nextLine();
	
		if(click.equals("1")) {
			System.out.println("전등 스위치가 on 됩니다");
		}else if(click.equals("2")){
			System.out.println("전등 스위치가 on 됩니다");
		}else {
		System.out.println("무슨 스위치 누른거>");
		
		
		//성적 프로그램 만들어보자
		//문제2)
		//[성적 출력 조건]
		//90점 이상은 A
		//80점 이상, 90점 미만 B
		//70점 이상, 80점 미만 C
		//60점 이상, 70점 미만 D
		//60점 미만 F
		//-점수를 콘솔창에 입력받고, 성적 출력 조건에 따라 결과를 출력해주세요
		//사용할 변수명은 자유롭게
		
		System.out.println("점수를 입력해주세요: ");
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
