package chap04.sec02;

public class forstatementExample03 {

	public static void main(String[] args) {
		forstatement03 fs03=new forstatement03();
		System.out.println("1�� ����");	
		fs03.shape01();
		System.out.println("\n2�� ����");	
		fs03.shape02();
		System.out.println("\n3�� ����");	
		fs03.shape03();
		System.out.println("\n4�� ����");	
		fs03.shape04();
		System.out.println("\n5�� ����");	
		fs03.shape05();
	
		
		

	}

}
class forstatement03{
	public void shape01() {
		for(int i=0; i<5; i++) {    //���� ���
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape02() {
		for(int i=0; i<5; i++) {    //���� ���
			
			for(int j=0; j<i; j++) //���� ���
				System.out.print(" ");
				
			for(int j=0; j<(5-i); j++) {  //"*"���      @@
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void shape03() {
		for(int i=0; i<5; i++) {    //���� ���
			
			for(int j=0; j<(4-i); j++) //���� ���
				System.out.print(" ");
				
			for(int j=0; j<(i*2)+1; j++) {  //"*"���
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape04() {
		for(int i=0; i<5; i++) {    //���� ���
			
			for(int j=0; j<(5-i); j++) //���� ���
				System.out.print(" ");
				
			for(int j=0; j<=i; j++) {  //"*"���
				System.out.print("*");
			}
			System.out.println();
	
}
	}
	public void shape05() {
           for(int i=0; i<5; i++) {    //���� ���
			
			for(int j=0; j>i; j++)     //���� ���
				System.out.print(" ");
				
			for(int j=0; j<(5-i); j++) {  //"*"���
				System.out.print("*");
			}
			System.out.println();
	
}
	}
}

