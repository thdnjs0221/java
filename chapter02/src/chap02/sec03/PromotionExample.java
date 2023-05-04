package chap02.sec03;

public class PromotionExample {
	public static void main (String[] args) {
		//Promotion : 자동형 변환
		// 표현범위가 큰쪽으로 변환
		// 수식에서는 int보다 작은 타입의 자료는 int로 변한 됨
		byte b1=100;
		short s1=20;
		
		int res1= b1+s1;
		// 수식에서  int로 변함, int 보다 작은것은  int로 변환
		
		float f1=20f;
		long l1=1000l;
		
		float res2= f1+l1;
		// 값의 범위에 따라 변환, float로 변환	
		
		
		
	}

}
