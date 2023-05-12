package chap05.sec02;

public class OneDimArrayExample {

	public static void main(String[] args) {
		int score[]= {80,75,95,80,88};   // 80,75,95,80,88 주소값 score에 들어가있음
		OneDimArray od= new OneDimArray();
		od.method1();
		int sum= od.addArray(score);
		System.out.println("\n합계="+od.addArray(score));

	}
}
class OneDimArray{
	public  void method1() {
		//예제 1]정수 5개를 저장하는 배열을 생성하고 10,20,30,40,50을 저장한 후 출력하시오
		
		int[] num1=null;   //초기화 해주기  
		num1=new int[5];
		
		char[] num2= new char[5];
		
		
		char[] num5= {'a', 'b', 'c','d','e'};       // new 생략   
		num2= new char[]{'a', 'b', 'c','d','e'};    // =
		
		
		boolean[] num3= new boolean[5];
		
		for(int i =0; i<num2.length; i++) {
			System.out.print(num3[i]+ ",");
		}
		
	
}
		public int addArray(int[]jumsu) {
		int sum=0;

		for (int i=0; i<jumsu.length; i++) {
		sum+=jumsu[i];
	}
		return sum;
}
	//예제2] 키보드로 5명의 친구이름 입력 받아 배열에 저장하고 역순으로 출력하시오
		

	









}





