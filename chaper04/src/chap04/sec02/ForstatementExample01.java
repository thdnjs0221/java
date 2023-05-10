package chap04.sec02;

import java.util.Random;
import java.util.Scanner;

public class ForstatementExample01 {

	public static void main(String[] args) {
		ForStatement fs=new ForStatement();
		//fs.method03();
		fs.method09();

	}
 
}
class ForStatement{
	Scanner sc=new Scanner(System.in);
	private char[] i;
	public void method01() {
		// 1~10사이의 수를 한줄에 출력
		// 그 합도 구하여 출력
		int sum=0;
		for(int i=0; i<10; i++) {
			System.out.printf("%3d",(i+1));
			sum+=i;
		}
		System.out.println("\nsum= "+sum);
	}

	
	//예제2] 1~100 사이의 짝수의 합과 홀수의 합을 구하시오
	public void method02() {
		int sumOfEven=0;   //짝수의 합
		int sumOfOdd=0;    //홀수의 합
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;
			}
			
		}
		System.out.println("짝수의 합= "+sumOfEven);
		System.out.println("홀수의 합= "+sumOfOdd);
	}
	
	//예제3] 문자열과 정수를 입력 받아 해당 문자열을 입력된 숫자만큼 반복하여 출력하시오????
	public void method03() {
		System.out.println("문자열 입력: ");
		String str=sc.nextLine();
		
		System.out.print("정수 입력: ");
		int count=sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			System.out.print(str+",");
		}
		
	}
	
	//예제4] 알파벳 A~Z까지를 한줄로 인쇄하시오
	public void method04() {
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			//=  for(int ch='A'; ch<='Z'; ch++) {
			//   System.out.print((char)ch);
		}
	}
	//예제5] 1-50 사이의 정수형 난수(random number)를 발생시켜 그 수까지의 합을 구해라
     public void method05() {
    	 int rnd=(int)(Math.random()*50)+1;
    	 int sum=0;
    	 for(int i = 0; i<rnd; i++){
    		sum=sum+i;
    	 }
    		 System.out.println("1부터 "+rnd+ "까지의 합 = "+sum);
    	 }
    	 
     class Forstatement03{
    	 
     }
    	 
		
		
		

    
   		


     //문제 1] 1/1 + 1/2 + 1/3 +... +1/10 의 합을 구하시오.
     public void method07() {

    	 double sum=0;

    	 for(double i=1; i<=10; i++ ) {
    		 sum+=(1/i);
    	
    	 }
    	 
    	 	System.out.println(sum);
   
     }
    //문제 2] 1-2+3-4+......-10=xx 를 구하여 출력하시오
    //출력도 반드시 위의 형식대로 출력할것
    
    public void method08() { 	
    
    	 int num;
    	 int sum=0;
    	 
    	for(num =1; num<11; num++) {
    	 if(num%2==0) {
    		 sum+=(-num);
    		 System.out.print("-"+num);
    		 
    	}else {
    		sum+=(num);
    		System.out.print("+"+num);
    	}
    	
    	}
    	   System.out.println("= "+sum);
        }


    //문제 3] 컴퓨터와 가위,바위,보 게임을 하려고 한다 이를 프로그램하시오(난수 사용)

    public void method09() { 	
    
    int com=(int)(Math.random()*3)+1;
    
    int num=0;
    
    System.out.println("가위(1),바위(2),보(3)  입력: ");
    
    Scanner s=new Scanner(System.in);
    String value=s.next();
    
    switch (value) {
    case "1":
       num=1;
       break;
    case "2":
       num=2;
       break;
    case "3":
       num=3;
       break;
     
    }

    if(num==1 && com==1) {
       System.out.println("사용자는 가위");
       System.out.println("컴퓨터는 가위");
       System.out.println("비겼습니다.");
    }else if(num==2 && com==2) {
       System.out.println("사용자는 바위");
       System.out.println("컴퓨터는 바위");
       System.out.println("비겼습니다.");
    }else if(num==3 && com==3) {
       System.out.println("사용자는 보");
       System.out.println("컴퓨터는 보");
       System.out.println("비겼습니다.");   

    }if(num==1 && com==2) {
       System.out.println("사용자는 가위");
       System.out.println("컴퓨터는 바위");
       System.out.println("졌습니다.");
    }else if(num==2 && com==3) {
       System.out.println("사용자는 바위");
       System.out.println("컴퓨터는 보");
       System.out.println("졌습니다.");
    }else if(num==3 && com==1) {
       System.out.println("사용자는 보");
       System.out.println("컴퓨터는 가위");
       System.out.println("졌습니다.");   

    }if(num==1 && com==3) {
       System.out.println("사용자는 가위");
       System.out.println("컴퓨터는 보");
       System.out.println("이겼습니다.");
    }else if(num==2 && com==1) {
       System.out.println("사용자는 바위");
       System.out.println("컴퓨터는 가위");
       System.out.println("졌습니다.");
    }else if(num==3 && com==2) {
       System.out.println("사용자는 보");
       System.out.println("컴퓨터는 바위");
       System.out.println("이겼습니다.");      
    }
      }
        }






