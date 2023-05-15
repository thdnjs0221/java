package chap05.sec05;

public class ArrayAConversionEX {

	public static void main(String[] args) {
		ArrayAConversion ac=new ArrayAConversion();
		ac.histogram();
		ac.oneToTwo();
		
		/*
		2. �ֻ����� 50������ ���� ������ ���� Ƚ���� ���ϰ� �̸� ������׷����� ����Ͻÿ�
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
	private int[] dice= new int[6];           //�ֻ��� �� ���� �߻� Ƚ�� ����   
	
	public ArrayAConversion() {
		for (int i =0; i<50; i++) {
			int rnd= (int)(Math.random()*6); //0-5������ ����
			dice[rnd]++;
		}
	}
	public void histogram() {        //���� �� �� 6�̴ϱ� 6������ 
		for(int i =0; i<dice.length; i++) {
			System.out.printf("%2d |", (i+1));
			for (int j =0; j<dice[i]; j++) {
				System.out.print("*");
				
			}
			System.out.println("("+dice[i]+")");
		}
	}
	public void oneToTwo() {    //���� �������� ���ϱ�
		int rowCount=dice[0];     //�ӽ� �ִ밪 /  ū������ �ٲ��� 
		for (int i=1; i<dice.length; i++) {
			if(rowCount<dice[i]) {
				rowCount= dice[i];
			}
		}
		char[][] ch=new char[rowCount][6];        // rowcount ���� ���� ch �迭�� �޶�����?
		for(int i=0; i<ch[0].length; i++) {        // ��
			for(int j=0; j<dice[i]; j++) {
				ch[j][i]='*';
				
				
			}
		}
		System.out.println("\n\n\n");
		//���
		for(int i=rowCount-1; i>=0; i--) {    //�ִ� �� ��ȣ 
			System.out.printf("%3d |",(i+1));
			for(int j=0; j<ch[i].length; j++) {//��
				System.out.printf("%5s",ch[i][j]);
				
			}
			System.out.println();
		}
		//  System.out.println("==================================");
		//	System.out.println("     1    2    3    4    5    6");
	}
	
}