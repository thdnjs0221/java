package chap04.sec01;

import java.util.Scanner;

public class SwitchSatementExample {

	public static void main(String[] args) {
		 SwithchStatment sw=new  SwithchStatment();
	    //sw.method1();
		 sw.method4();


	}

}
		//[switch]

		//예 1] 회원의 등급 코드 (1-3)를 입력받아
		//1등급이면 "vip 회원 입니다"를
		//2등급이면 "우수회원 입니다"를
		//3등급이면 "일반회원 입니다"를
		//그 이외의 값이면 "잘못된 등급코드 입니다"출력하는 프로그램 작성
			
class SwithchStatment{  //public붙어 있는 class는 하나만 작성(메인), 별도의  class가 만들어지면 public작성 x// 클래스는 변수와 메소드 존재함
	Scanner sc= new Scanner(System.in);
	
	public void method1() { //void-되돌려주는 값 없음
		System.out.print("회원 등급 입력(1-3 : ");
		int grade=Integer.parseInt(sc.nextLine()); //nextLine 문자열(줄)을 입력받아 정수로 바꿔줌
	
		
		switch(grade) {
			case 1:
				System.out.println("vip회원입니다");
				break;
			case 2:
					System.out.println("우수회원입니다");
				break;
			case 3:
					System.out.println("일반회원입니다");
				break;
			default:
					System.out.println("잘못된 등급 코드입니다");
		}
	 }
		//예2] 1-12월 사이의 월을 입력받아
		//    31일 까지 존재하면"끝날자가 31일인 달입니다"를
		//    30일 까지 존재하면"끝날자가 30일인 달입니다"를
		//    2월이면  "끝날자가 28일인 2월입니다" 또는
		//			 "끝날자가 29일인 2월입니다"를 출력하시오
		public void method2() { 
			System.out.print("월 입력(1-12)");
			int month= sc.nextInt(); //하나 입력 받을땐 next 사용가능, 
			
			switch(month) {
			case 1: case 3:  case 5: case 7:
			case 8: case 10: case 12:
				// if(month==1 || month=3....||month==12)  if문으로 바꿀때
				System.out.println(month+"월은 끝나는 날짜가 31일까지 존재하는 달입니다");
				break;
			
			case 4: case 6: case 9: case 11:
				System.out.println(month+"월은 끝나는 날짜가 30일까지 존재하는 달입니다");
				break;
			default :
				System.out.println("끝날자가 28일인 2월입니다");
				
		

			}}
		//문제1]국가명을 영문코드(kr,jp, ch)를 입력받아 한글로 국가명을 출력
		public void method3() { 
			System.out.print("영문코드:");
			String code=sc.nextLine();
			
			switch(code){
			case "kr":
				System.out.println("한국입니다");
				break;
			case "jp":
				System.out.println("일본입니다");
				break;
			case "ch":
				System.out.println("중국입니다");
				break;
			}
		}
  
	  //문제2] 점수를 입력받아
	  //90~92: A-
	  //93~96: A0
	  //97~99: A+
	
	  //80~82: B-
	  //83~86: B0
	  //87~89: B+
	
	  //그 이하는 "fail"출력  중첩 switch
				
			public void method4() { 
				System.out.print("점수입력: ");
				int score=sc.nextInt();
				String grade="";
				
				switch(score/10) {
				case 10:
					grade="A+";
				   break;
				case 9: 
					grade="A";
				   switch (score%10) {
				   case 0: case 1: case 2:
				 	grade=grade+"-";
				 	break;
				   case 3: case 4: case 5: case 6:
					grade=grade+"0";
			 		break;
				    case 7: case 8: case 9:
					grade=grade+"+";
					}
					break  ;  
				 case 8: 
				   switch (score%10) {
				   case 0: case 1: case 2:
				 	grade=grade+"-";
				 	break;
				   case 3: case 4: case 5: case 6:
					grade=grade+"0";
			 		break;
				   case 7: case 8: case 9:
				 	grade=grade+"+";
					}
					break ;
				 	
				default :
				grade="fail";
				
				}
				System.out.println("점수"+score+"는"+grade+"학점입니다");
				
}
}