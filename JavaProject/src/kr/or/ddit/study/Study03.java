package kr.or.ddit.study;

public class Study03 {

	public static void main(String[] args) {
		
		/*2. 반복문
		 * -작업단위가 반복적으로 실행되도록 할때 사용
		 * 
		 * > 반복문의 종류로는 ,for문 while문이 있습니다
		 * (do while은 기본적으로 잘 안쓰기 때문에 안함)
		 * >for문은 반복 횟수를 알 수 있어, 횟수만큼 반복문이 실행됩니다
		 * >while문은 조건이 참인 경우 반복문이 실행되고 참이 아닌 조건이 발생했을때 while 이 종료된다
		 * 
		 * 
		 * 반복문 for연습
		 * 반복문for문을 이용해서 0-9까지의 숫자를 차례대로 출력해봅시다
		 * 
		 */
		for(int i =0; i<10; i++) {
			System.out.print(i+ " ");
		}
		// 짝수와 홀수를 구분지어 출력해봅시다
		//홀수일때는 '_"를 붙영서 출력해보기
		for(int i =0; i<10; i++) {
			if(i % 2==0) {  //짝수
				System.out.println(i+ " ");
			
		}else {				//홀수
			System.out.println(i+ "_");
		}
	}
		System.out.println();
		
		//구구단 출력하기
		//출력예시]
		// 1x1=1 1x2=2 1x3=3......1x9=9
		// 2x1=2 2x2=4 2x3=6......2x9=18
		//1단부터 9단까지의 구구단 출력
		//힌트: for문을 중첩으로 사용하기
		
		for(int i=0; i<10; i++) {
			if(i==0) {
				for(int k = 1; k<10; k++) {
					System.out.println("["+k+"단]\t");
					
				}
				System.out.println();
			}else {
			
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j+"="+(i*j)+"\t");

			}
			System.out.println();
		
			}
		
		
		
 }
	
	
}}