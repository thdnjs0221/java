package chap04.sec03;

import java.util.Scanner;

public class WhileStatementExample {

	public static void main(String[] args) {
		WhileStatement ws=new WhileStatement();
		ws.method1();
		//ws.method2();

	}

}
class WhileStatement{
	int numOfchop=0;   //도끼질 횟수
	public void method1() {
		numOfchop++;
		while(numOfchop< 9) {
			numOfchop++;
			System.out.println(numOfchop+"번 찍었습니다.");
			System.out.println("아직 안넘어 갔네요...");
		}
	    System.out.println("-------------------");
	    System.out.println((++numOfchop)+"번 찍었습니다.");    // ++먼저 ->10 값이 나옴
	    System.out.println("나무가 드디어 넘어 갔습니다");
	}
	public void method2() {
		String menu="*** 커피 메뉴 ***\n";
		menu+="1. 아메리카노             2000원\n";
		menu+="2. 카페라떼                3500원\n";
		menu+="3. 카라멜마키야또        5000원\n";
		menu+="4. 자바칩 프라프치노    6500원\n";
		menu+="5. 종료\n";
		
		
		
		int sum=0;    //커피구매금액
		int exit=0;
		
		String bill="*** 영 수 증 ***\n";
		
	    while(true) {
	    	System.out.println(menu);
	    	Scanner sc=new Scanner(System.in);
	    	System.out.print("커피를 선택하세요..");
	    	int choice=Integer.parseInt(sc.nextLine());
	    	
	    	switch(choice) {
	    	case 1:
	    		sum+=2000;
	    		bill+="1. 아메리카노             2000원\n";
	    		break;
	    	case 2:
	    		sum+=3500;
	    		bill+="2. 카페라떼                3500원\n";
	    		break;
	    	case 3:
	    		sum+=5000;
	    		bill+="2. 카라멜마키야또        5000원\n";
	    		break;
	    	case 4:
	    		sum+=6500;
	    		bill+="4. 자바칩 프라프치노    6500원\n";
	    		break;
	    	case 5:
	    		exit= -1;
	    		break;
	    	default:
	    		System.out.println("잘못된 선택입니다.");
	    			
	    	}
	    	if(exit==-1) {                         //5번 선택
	    		System.out.println("프로그램 종료");
	    		break;                            //while문 빠져나감
	    	}
	    	//end while
	    	
	    	bill+="-------------------\n";
	    	bill+=" 합계 :                "+sum+"원";
	    	System.out.println(bill);
	    	
	    }
				
		
		
		
		
	}
}