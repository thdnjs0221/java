package chap02.sec03;

public class CastExample03 {
	public static void main(String[] args) {
	   
	//[문제] 1년은 365.2422일이다. 이 자료로
	// "1년은  365일   xx 시간  xx분  xx초 이다"를 출력하도록 프로그램 하시오....
	//5시간 48분 46초
	
	//0.2422*24
	//0.8128*60
	//0.768*60
	
	double doubleValue=0.2422*24;
	int intValue= (int) doubleValue;

	System.out.println((int)doubleValue+"시간");
	
	double doubleValue1= 0.2422*24;
	//System.out.println(doubleValue);
	
	
	
	double doubleValue2=0.8128*60;
	int intValue1= (int) doubleValue2;
	System.out.println((int)doubleValue2+"분");
	
	double doubleValue3=0.768*60;
	int intValue2= (int) doubleValue3;
	System.out.println((int)doubleValue3+"초");
	
	/*double Second;
	Second=0.768*60;
	System.out.println((int)Second+"초");*/
	System.out.println("1년은 365일 "+ (int)doubleValue+"시간 "+(int)doubleValue2+"분 "+(int)doubleValue3+"초 이다");
	
	}
}

