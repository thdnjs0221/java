/**
 * 
 */
package chap03.sec01;

/**
 * @author PC-14
 *
 */
public class UnaryOperator {
	public static void main(String[] args) {
		//단항연산자 : 부호(-,+), 증감(++,--), 논리부정(!)
		//signOperator() ;
		//incrementOperator();
		logicalNot();
		
	}
	public static void signOperator() {
		// 부호 연산자: 음수(-),양수(+),
		int num1=100;
		int num2=-num1;
		// 1-2+3-4....-10=?
		//1씩 증가 라는 규칙, -1(처음값)을 곱해주는
		System.out.println("num1="+num1);
		System.out.println("num2"+num2);
		//문자열+정수 = 정수가 문자열로 결합
		//{} 메소드의 범위. 실행후 메인 메소드로 돌아감 실행시키려면 메인메소드에 입력
		//메인메소드가 끝나면 전체프로그램 종료
	}
	
	public static void incrementOperator() {
		//증감연산자: ++,--	}
		int num=100;
		int res1=0;
		int res2=0;
		
		res1=num++;//postfix 표기법
		//System.out.println("num="+num+"\nres1="+res1);
		System.out.println("num++="+(num++)+", num="+num);
		//num++(res1 기능을 해줌) 1증가전 100 + 1= 101
		//++num num에 1 증가 시킨 값 101
		//
		
		
		
		num=100;
		//res2=++num;//prefix 표기법 증가 시키고 값 넣어줌
		//System.out.println("num="+num+"\nres2="+res2);
		System.out.println("++num="+(++num)+", num="+num);
	}
		public static void logicalNot() {
			//논리 부정 연산자: !
			//	토글기능(toggle): 참과 거짓이 반복되는 기능
			//	-한영변환, 삽입/편집기능 등
			boolean powerState= true;
			while (true) {
			if (powerState) {
				System.out.println("전원 스위치가 on상태");
			}else{
				System.out.println("전원 스위치가 off상태");
			}
			powerState=!powerState; //참이면 거짓으로 거짓이 참으로  중지:ctrl+q
			
			// while- 중괄호까지를 괄호가 참이 될때까지 무한루프 
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
}
