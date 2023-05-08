package chap04.sec01;

import java.util.Scanner;

public class ifStatement {
	static Scanner sc= new Scanner(System.in); //멤버필드(멤버변수)

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method7();
	}
	public static void method1() {
		//사용자 이름과 점수를 입력 받아 60점 이상이면
		//  "이름 합격입니다" 메세지 출력
		String message="";
		System.out.print("이름 입력: ");
		String name=sc.nextLine();
		
		System.out.print("점수입력: ");
		int score= sc.nextInt();
		
		if(score>=60) {
			message= name+"은(는) 합격입니다.";
			System.out.println(message);
		}
	}
		
	public static void method2() {
		//사용자 이름과 점수를 입력 받아 60점 이상이면
		//  "이름 합격입니다" 메세지 출력
		// 60점 이하이면
		// "불합격입니다" 메세지 출력
		String message="";
		System.out.print("이름 입력: ");
		String name=sc.nextLine();
		//int name= integer.parseInt(sc.nextLine);
		
		System.out.print("점수입력: ");
		int score= sc.nextInt();
		
		if(score>=60) {
			message= name+"은(는) 합격입니다.";
		}else {
			message= name+"은(는) 불합격입니다.";
		}
		System.out.println(message);
	}
	
		// [문제] 월을 입력받아
		// 3~5월: "봄 입니다",
		// 6~8월: "여름 입니다",
		// 9~11월: "가을 입니다",
		// 12~2월: "겨울 입니다"를 출력하는 프로그램 작성
		
	public static void method3() {
		String message="";
		System.out.print("월");
		int month= sc.nextInt();
		
		if (month >= 3 && month <= 5) {
			message= month+"봄 입니다.";
		}else if (month >= 6 && month <= 8){
			message= month+"여름 입니다.";
		}else if (month >= 9 && month <= 11){
			message= month+"가을 입니다.";
		}else {
			message= month+"겨울 입니다.";
		}
		
			
		}
		

		
		
		
		
	
	
	//[문제] 체중과 키를 입력하여 BMI지수를 구하고 BMI지수에 따른 평가를 출력하는 프로그램을 작성
		//BMI지수= 체중(kg) / (키(m)* 키(m)
		//BMI지수             판정
		//-------------------------
		//0.0 ~ 18.4    저체중
		//18.5 ~ 22.9   정상
		//23.0 ~ 24.9 과체중
		//30.0 ~ 그이상 비만
		
		public static void method4() {
			String message="";
			System.out.println("체중");
			int weight= sc.nextInt();
		
			System.out.println("키 ");
			double height= sc.nextDouble();
			
			double BMI= weight/height*height;
		   
			
			
			if (BMI >= 0.0 && BMI <= 18.4) {
				message= "저체중";
			}else if (BMI >= 18.5 && BMI <=22.9){
				message= "정상";
			}else if (BMI >= 23.0 && BMI <=24.9){
				message= "과체중";
			}else {
				message= "비만";
			System.out.println(" 판정"+ message);
				
		
			}
		}
		//[문제] 헌혈하라고 한다 헌혈의 조건은 나이가 18세 이상이며, 몸무게가 50KG 이상이어야한다
		// 이를중첩 IF문을 사용하여 구성하시오
		// 나이와 몸무게는 설정함(=연산자사용)
		
		public static void method5() {
			String message="";
			System.out.println("나이:");
			int age= sc.nextInt();
			
			System.out.println("몸무게:");
			int weight= sc.nextInt();
			
			if (age >= 18 ) {
				if(weight>=50) {
					message= "헌혈 가능";
			}else {
				message= "헌혈 불가능";
			}
			}else {
				message= "헌혈 불가능";
			}
			System.out.println(message);
			}
		  // [문제] 임의의 수를 입력 받아 홀수와 짝수를 판별하시오
		public static void method6() {
			String message="";
			System.out.println("Random");
			int number= sc.nextInt();
			
			if(number%2==0) {
				message= "짝수입니다";
			}else {
				message= "홀수입니다";
			}
			System.out.println(message);
			}
  
	  
         // [문제] 점수를 입력받아 그 값이
    	 //99-97: A+
    	 //96-93: AO
         //92-90: A-
    	   
    	 //89-87: B+
    	 //86-83: BO
         //82-80: B-
    	   
    	 //79-77: C+
      	 //76-73: CO
         //72-70: C-
    	 //그 이하는 F
        //중첩 IF 사용
		public static void method7() {
			System.out.println("");
		
			int score=sc.nextInt();
			
			String grade="";
			
			if (score >=90 && score<=99 ) {
				grade= "A";	
			}if(score <= 99 && score>=97) {
			     grade =grade+"+";	
			}if (score <= 96 && score>=93) {
				grade =grade+"0";		
	        }else if (score <= 92 && score>=90) {
				grade =grade+"-";		
			
	        }if (score >=80 && score<=89) {
				grade= "B";	
			}if(score <= 89 && score>=87) {
			     grade =grade+"+";	
			}if (score <= 86 && score>=83) {
				grade =grade+"0";		
	        }else if (score <= 82 && score>=80) {
				grade =grade+"-";
	        
	        }if (score >=70 && score<=79 ) {
				grade= "C";	
			}if(score <= 79 && score>=77) {
			     grade =grade+"+";	
			}if (score <= 76 && score>=73) {
				grade =grade+"0";		
	        }if (score <= 72 && score>=70) {
				grade =grade+"-";
	       
	        }else if (score <= 70) {
				grade =grade+"C";
	        }	
			System.out.println("점수는"+grade+"입니다");
		}
		
		public static void method8() {
			String message="";
			System.out.println("");
			String vlaue=sc.nextLine();
			
		   
		}
}
      
		
			
