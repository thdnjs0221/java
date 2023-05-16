package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayExample03 {

	public static void main(String[] args) {
		OneDimArray03 od3= new OneDimArray03();
		//od3.getLottoNumber();
	
		//od3.getLottoNumber();
	}

}

class OneDimArray03{
	int[] lotto=new int[45];
	
	OneDimArray03() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i]= i+1;                 //배열은 0부터
			
			
		}
	}
	
	public void suffle() {    //메소드 별도로 구성한 이유? 
		for (int i=0; i<100000000; i++ ) {      //천만번 수행
			int rnd=(int)(Math.random()*45)  ;  //44까지 
			int temp =lotto[0];
			lotto[0]= lotto[rnd];
			lotto[rnd]=temp;
			
		}
	}
	public void getLottoNumber() {
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("구입금액을 1000원 단위로 입력: ");
		int money=Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<money/1000; i++) {
			suffle();
			System.out.printf("%2d : ", i);
			for(int j=0; j<6; j++) {                  
				System.out.printf("%5d",lotto[j]);
				
			}
			System.out.println();
			
			
		}
	} 
	
}
	



