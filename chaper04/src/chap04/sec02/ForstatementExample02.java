package chap04.sec02;

import java.util.Scanner;

public class ForstatementExample02 { //일 시키는 코치 class

	public static void main(String[] args) {
		Forstatement02 fs02=new 	Forstatement02();
		//fs02.numberOfvowels();
		fs02.fibonacciNumber();
//예제 6] 키도브로 단어를 입력 받아 단어에 포함된 모음(a,e,i,o,u)의 수를 출력하시오
		
		
	  }
	}

	class 	Forstatement02{
		Scanner sc=new Scanner(System.in); // Forstatement02가  Scanner포함해서 하나의 변수로 사용 // 반드시 import 해주기 //접근 지정자 default
		public void numberOfvowels() {     //지역변수는 반드시 초기화 해주기
			int count=0;
			
			System.out.println("단어 입력 : ");
			String word=sc.nextLine();  //
			
			for(int i=0; i<word.length(); i++) {  //length는 1번부터 카운트//i는 index 0번부터 카운트
			 if(word.charAt(i)=='a'|| word.charAt(i)=='e'|| word.charAt(i)=='i'||
					 word.charAt(i)=='o'||	word.charAt(i)=='u') {
				     count++;
			 }
			 
	      }
			System.out.println(word+"에 포함된 모음의 수는 : "+count);
		}

	
	
//예제 7] 1-50 사이에 존재하는 fibonacci 수열을 출력하시오 
		//fibonacci 수열: 첫 수 와 두번째 수가 1로 주어지고 그 다음부터 전 두수의 합이
		//현재수가 되는 수열 => 자료 검색 알고리즘에 사용(피노나치 검색)
	
	public void fibonacciNumber() {
		int ppNum=1;      //전전수(前前)
		int pNum=1;       //전수
		int currNum=0;    //현재수
		System.out.printf("%3d%3d",1,1);
		for(int i=1; i<=50; i++) {
			currNum=ppNum+pNum;
			if(currNum>=50) {
				break;           //for문 벗어남  
			}else {
				System.out.printf("%3d",currNum);
				ppNum=pNum;     // 순서 조심
				pNum=currNum;   // 순서 조심
				
			}
		}
	}
	
	}
	

//예제 8] 다음 도형을 출력하는 프로그램 작성
		//1)        *     2)    *****    3)   *      4)     *     5)    *****
		//         **           ****         ***           **           ****
		//        ***           ***         *****         ***           ***
		//       ****           **         *******       ****           **
        //      *****           *         *********     *****           *
	
	
		
	

