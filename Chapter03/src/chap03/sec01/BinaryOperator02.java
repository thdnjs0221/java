package chap03.sec01;

public class BinaryOperator02 {

	public static void main(String[] args) {
		// 비트,대입,이동=>이항연산자
		//bitwiseOperator();
		shiftOperator();
	}
	public static void bitwiseOperator() {
		// 비트별 연산자: |,&,^
		int n1=35; // 100011
		int n2=23; // 010111 
		           //&000011=3 |110111=55 ^110100=52
		System.out.println("n1 & n2 = "+ (n1 & n2));
		System.out.println("n1 | n2 = "+ (n1 | n2));
		System.out.println("n1 ^ n2 = "+ (n1 ^ n2));
	}
	
	public static void shiftOperator() {
		//shift : >>(right) , <<(left)
		//, >>> (right shift with sign bit
		int num = 35;
		//int = 4 byte
		System.out.println("35>>2 = "+ (num>>2));
		System.out.println("35<<2 = "+ (num<<2));
		num=-35;
		System.out.println("35>>>1 = "+ (num>>>1));
		
		
	}
	public static void  assignOperator() {
		//대입 : =, 우선순위가 가장 낮음
		// 결합대입연산자: +=,-=, /+, *=, %=
		// 변수=변수 연산자(+,-,/,*) 값
		// 변수 연산자= 값 
		
		int res=0;
		int num=100;
		
		res=res+10; // res+=10; 이렇게 써도 됨
		
		res=res*(num/10); //res*=(num/10); 이렇게 써도 됨
		
		
		
	
	
	}
	
}
