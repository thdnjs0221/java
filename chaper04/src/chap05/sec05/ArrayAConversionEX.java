package chap05.sec05;

public class ArrayAConversionEX {

	public static void main(String[] args) {
		ArrayAConversion ac=new ArrayAConversion();
		ac.histogram();
		ac.oneToTwo();
		
		/*
		2. 주사위를 50번던져 나온 각각의 눈의 횟수를 구하고 이를 히스토그램으로 출력하시오
	    ex)
	    1 : ********(8)
	    2 : *********(9)
	    3 : **********(10)
	    4 : ********(8)
	    5 : *********(9)
	    6 : *******(7)    */

	}

}
class ArrayAConversion{
	private int[] dice= new int[6];           //주사위 각 눈의 발생 횟수 저장   
	
	public ArrayAConversion() {
		for (int i =0; i<50; i++) {
			int rnd= (int)(Math.random()*6); //0-5사이의 난수
			dice[rnd]++;
		}
	}
	public void histogram() {        //눈의 수 가 6이니까 6번돌기 
		for(int i =0; i<dice.length; i++) {
			System.out.printf("%2d |", (i+1));
			for (int j =0; j<dice[i]; j++) {
				System.out.print("*");
				
			}
			System.out.println("("+dice[i]+")");
		}
	}
	public void oneToTwo() {    //행의 갯수부터 구하기
		int rowCount=dice[0];     //임시 최대값 /  큰값으로 바꿔줌 
		for (int i=1; i<dice.length; i++) {
			if(rowCount<dice[i]) {
				rowCount= dice[i];
			}
		}
		char[][] ch=new char[rowCount][6];        // rowcount 값에 따라서 ch 배열이 달라진다?
		for(int i=0; i<ch[0].length; i++) {        // 열
			for(int j=0; j<dice[i]; j++) {
				ch[j][i]='*';
				
				
			}
		}
		System.out.println("\n\n\n");
		//출력
		for(int i=rowCount-1; i>=0; i--) {    //최대 행 번호 
			System.out.printf("%3d |",(i+1));
			for(int j=0; j<ch[i].length; j++) {//열
				System.out.printf("%5s",ch[i][j]);
				
			}
			System.out.println();
		}
		//  System.out.println("==================================");
		//	System.out.println("     1    2    3    4    5    6");
	}
	
}