package chap04.sec02;

import java.util.Scanner;

public class ForstatementExample02 { //�� ��Ű�� ��ġ class

	public static void main(String[] args) {
		Forstatement02 fs02=new 	Forstatement02();
		//fs02.numberOfvowels();
		fs02.fibonacciNumber();
//���� 6] Ű����� �ܾ �Է� �޾� �ܾ ���Ե� ����(a,e,i,o,u)�� ���� ����Ͻÿ�
		
		
	  }
	}

	class 	Forstatement02{
		Scanner sc=new Scanner(System.in); // Forstatement02��  Scanner�����ؼ� �ϳ��� ������ ��� // �ݵ�� import ���ֱ� //���� ������ default
		public void numberOfvowels() {     //���������� �ݵ�� �ʱ�ȭ ���ֱ�
			int count=0;
			
			System.out.println("�ܾ� �Է� : ");
			String word=sc.nextLine();  //
			
			for(int i=0; i<word.length(); i++) {  //length�� 1������ ī��Ʈ//i�� index 0������ ī��Ʈ
			 if(word.charAt(i)=='a'|| word.charAt(i)=='e'|| word.charAt(i)=='i'||
					 word.charAt(i)=='o'||	word.charAt(i)=='u') {
				     count++;
			 }
			 
	      }
			System.out.println(word+"�� ���Ե� ������ ���� : "+count);
		}

	
	
//���� 7] 1-50 ���̿� �����ϴ� fibonacci ������ ����Ͻÿ� 
		//fibonacci ����: ù �� �� �ι�° ���� 1�� �־����� �� �������� �� �μ��� ����
		//������� �Ǵ� ���� => �ڷ� �˻� �˰��� ���(�ǳ볪ġ �˻�)
	
	public void fibonacciNumber() {
		int ppNum=1;      //������(����)
		int pNum=1;       //����
		int currNum=0;    //�����
		System.out.printf("%3d%3d",1,1);
		for(int i=1; i<=50; i++) {
			currNum=ppNum+pNum;
			if(currNum>=50) {
				break;           //for�� ���  
			}else {
				System.out.printf("%3d",currNum);
				ppNum=pNum;     // ���� ����
				pNum=currNum;   // ���� ����
				
			}
		}
	}
	
	}
	

//���� 8] ���� ������ ����ϴ� ���α׷� �ۼ�
		//1)        *     2)    *****    3)   *      4)     *     5)    *****
		//         **           ****         ***           **           ****
		//        ***           ***         *****         ***           ***
		//       ****           **         *******       ****           **
        //      *****           *         *********     *****           *
	
	
		
	

