package chap05.sec04;

public class TwoDimArrayExample {

	public static void main(String[] args) {
		 TwoDimArray td=new  TwoDimArray();
		 //td.getscore();
		 //td.sumOfscore();
		td.getRank();

	}

}
/*2�����迭����1] 5���� 3���� ������ �� ����� ������ ����.
			    �̸� �迭 ������ �� ����Ͻÿ�.                ���ڿ�,���� �迭 ���� �����
	[�ڷ�]
	 �̸�	 	 ���� 	        ���� 	       ����
	 ȫ�浿	  70	 80	    60
	 �̼���	  80	 90 	90
	 ������	  90	 80		90
	 ������	  75   	 80		80
	 �̼���  	  60	 70		60 */

class TwoDimArray{
	private String[] name= {"ȫ�浿", "�̼���", "������","������","�̼���"};   //1���� �迭 �������� �������� ����ϱ⶧���� ������ ��
	
	public void getscore() {
		int[][]score={ {70,80,60},{80,90,90},{90,80,90},{75,80,80},{60,70,60} };  //2�����迭 ���� ���� �ʱ�ȭ => �ѹ������� (�ұ�Ģ�� �������϶� )
		
		
		
		printScore	(score);														  
	//	for(int i=0; i<score.length; i++) {					 // �̸� ��      // ��Ģ���� �������϶��� for������ 
		//	System.out.print(name[i]+" ");         			 // �������� ���� ���.
		//	for (int j=0; j<score[i].length; j++) {			 // ���� ��
		//		System.out.printf("%6d", score[i][j]);		 // ��) score 0��0��  ,0�� 1��...- 
		//	}
		//	System.out.println();                            
	//	}
		
	}
	//2�����迭����2] �� �ڷḦ �̿��Ͽ� ������ ����� ���Ͻÿ�  (����� ������ ���Ѵ�)
	public void sumOfscore() {
		int[][]score={ {70,80,60,0,0},{80,90,90,0,0},{90,80,90,0,0},{75,80,80,0,0},{60,70,60,0,0} };   //  ����, ����ʱⰪ 0 �ֱ�   -> 5��5��
		
		for(int i=0; i<score.length; i++) {    //�� 
			for(int j=0; j<3; j++) {           //��     0~2->(70,80,60)
				score[i][3]= score [i][3]+score[i][j];	   //����  �հ� ??		
			}
			score[i][4]= score[i][3]/3;		//  ���: ����/3
		}
		System.out.println("       ****   ����ǥ   ****     ");
		System.out.println("--------------------------------------------");
		System.out.println("�̸�        ����       ����       ����        ����       ���  ");
		System.out.println("--------------------------------------------");
		printScore (score);
		
	}
	public void getRank() {               //**�ʱⰪ�� 1������ �ٸ� ����� ������  �ڱ� �������� ū ���̿��� �����  +1
		int[][]score={ {70,80,60,0,0,1},{80,90,90,0,0,1},{90,80,90,0,0,1},{75,80,80,0,0,1},{60,70,60,0,0,1} }; //�������� ���ϱ�
		//���� �� ���
		for(int i=0; i<score.length; i++) {         //��
			for(int j=0; j<3; j++) {				//��
				score[i][3]= score [i][3]+score[i][j];   //�հ�??				
			}
			score[i][4]= score[i][3]/3;		// ���
		}
		//���
	for (int i =0; i <score.length; i++) {	     //��    score.length->5
		for(int j=0; j<score.length; j++) {      //��    score.length->6
			if(score[i][3] < score[j][3]) {      //???????
				score[i][5]++; 					// ���� ũ�� �ε���5�� +1
			}
		}
	}
	System.out.println("       ****   ����ǥ   ****     ");
	System.out.println("--------------------------------------------");
	System.out.println("�̸�        ����      ����      ����      ����      ���       ��� ");
	System.out.println("--------------------------------------------");
	printScore(score);
}

	public void printScore (int[][] score) {//�ݺ� ȣ��
		for(int i=0; i<score.length; i++) {					 // �̸� ��
			System.out.print(name[i]+" ");         			 // �������� ���� ���.
			
			for (int j=0; j<score[i].length; j++) {			 // ���� ��
				System.out.printf("%6d", score[i][j]);		 // ��) score 0��0��  ,0�� 1��...- 
			}
			System.out.println(); 
		}
	}


/*5���� 3���� ������ �� ����� ������ ����.
    �̸� �迭 ������ �� ����,���,����� ���� �� ��������� ����Ͻÿ�.(����� ������)
[�ڷ�]
�̸�     ����    ����   ����
ȫ�浿    70     80    60
�̼���    80     90    90
������    90     80    90
������    75     80    80
�̼���    60     70    60*/
	public void getRank1() {               //**�ʱⰪ�� 1������ �ٸ� ����� ������  �ڱ� �������� ū ���̿��� �����  +1
		int[][]score={ {70,80,60,0,0,1},{80,90,90,0,0,1},{90,80,90,0,0,1},{75,80,80,0,0,1},{60,70,60,0,0,1} }; //�������� ���ϱ�
		//���� �� ���
		for(int i=0; i<score.length; i++) {         //��
			for(int j=0; j<3; j++) {				//��
				score[i][3]= score [i][3]+score[i][j];   //�հ�??				
			}
			score[i][4]= score[i][3]/3;		// ���
		}
		                                          //���
	for (int i =0; i <score.length; i++) {	     //��    score.length->5
		for(int j=0; j<score.length; j++) {      //��    score.length->6
			if(score[i][3] < score[j][3]) {      //???????
				score[i][5]++; 					// ���� ũ�� �ε���5�� +1
		 }
	  }
	}
	for (int i =0; i <score.length; i++) {	     //��    score.length->5
		for(int j=i+1; j<score.length; j++) {      //��    score.length->6
			if(score[i][5] > score[j][5]) { 
				
				int[]temp =score[i];
				score[i]=score[j];
				score[j]=temp;
				
				String tempstr= name[i];
				name[i]= name[j];
				name[j]= tempstr;
				
			}
	
		}

	}
	
	System.out.println("       ****   ����ǥ   ****     ");
	System.out.println("--------------------------------------------");
	System.out.println("�̸�        ����      ����      ����      ����      ���       ��� ");
	System.out.println("--------------------------------------------");
	printScore(score);
	}
	}
	