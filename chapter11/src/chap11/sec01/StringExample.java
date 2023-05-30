package chap11.sec01;

public class StringExample {

	public static void main(String[] args) {
		//1. substring(int sindex, int eindex)
		//2. 기본 데이터 타입=>문자열로 반환
		//=>String.valueOF(기본타입자료);
		//=>기본 데이터 타입+""
		//int 100을 문자열로 변환 방법:
		String str1=String.valueOf(100);
		String str2=100+"";
		
		//문자열 => 기본데이터타입
		//Wrapper.pase기본타입명(문자열)
		//25.5=> 문자열
		double num1=Double.parseDouble("25.5");
		
	}

}
