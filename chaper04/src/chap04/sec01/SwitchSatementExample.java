package chap04.sec01;

import java.util.Scanner;

public class SwitchSatementExample {

	public static void main(String[] args) {
		 SwithchStatment sw=new  SwithchStatment();
	    //sw.method1();
		 sw.method4();


	}

}
		//[switch]

		//�� 1] ȸ���� ��� �ڵ� (1-3)�� �Է¹޾�
		//1����̸� "vip ȸ�� �Դϴ�"��
		//2����̸� "���ȸ�� �Դϴ�"��
		//3����̸� "�Ϲ�ȸ�� �Դϴ�"��
		//�� �̿��� ���̸� "�߸��� ����ڵ� �Դϴ�"����ϴ� ���α׷� �ۼ�
			
class SwithchStatment{  //public�پ� �ִ� class�� �ϳ��� �ۼ�(����), ������  class�� ��������� public�ۼ� x// Ŭ������ ������ �޼ҵ� ������
	Scanner sc= new Scanner(System.in);
	
	public void method1() { //void-�ǵ����ִ� �� ����
		System.out.print("ȸ�� ��� �Է�(1-3 : ");
		int grade=Integer.parseInt(sc.nextLine()); //nextLine ���ڿ�(��)�� �Է¹޾� ������ �ٲ���
	
		
		switch(grade) {
			case 1:
				System.out.println("vipȸ���Դϴ�");
				break;
			case 2:
					System.out.println("���ȸ���Դϴ�");
				break;
			case 3:
					System.out.println("�Ϲ�ȸ���Դϴ�");
				break;
			default:
					System.out.println("�߸��� ��� �ڵ��Դϴ�");
		}
	 }
		//��2] 1-12�� ������ ���� �Է¹޾�
		//    31�� ���� �����ϸ�"�����ڰ� 31���� ���Դϴ�"��
		//    30�� ���� �����ϸ�"�����ڰ� 30���� ���Դϴ�"��
		//    2���̸�  "�����ڰ� 28���� 2���Դϴ�" �Ǵ�
		//			 "�����ڰ� 29���� 2���Դϴ�"�� ����Ͻÿ�
		public void method2() { 
			System.out.print("�� �Է�(1-12)");
			int month= sc.nextInt(); //�ϳ� �Է� ������ next ��밡��, 
			
			switch(month) {
			case 1: case 3:  case 5: case 7:
			case 8: case 10: case 12:
				// if(month==1 || month=3....||month==12)  if������ �ٲܶ�
				System.out.println(month+"���� ������ ��¥�� 31�ϱ��� �����ϴ� ���Դϴ�");
				break;
			
			case 4: case 6: case 9: case 11:
				System.out.println(month+"���� ������ ��¥�� 30�ϱ��� �����ϴ� ���Դϴ�");
				break;
			default :
				System.out.println("�����ڰ� 28���� 2���Դϴ�");
				
		

			}}
		//����1]�������� �����ڵ�(kr,jp, ch)�� �Է¹޾� �ѱ۷� �������� ���
		public void method3() { 
			System.out.print("�����ڵ�:");
			String code=sc.nextLine();
			
			switch(code){
			case "kr":
				System.out.println("�ѱ��Դϴ�");
				break;
			case "jp":
				System.out.println("�Ϻ��Դϴ�");
				break;
			case "ch":
				System.out.println("�߱��Դϴ�");
				break;
			}
		}
  
	  //����2] ������ �Է¹޾�
	  //90~92: A-
	  //93~96: A0
	  //97~99: A+
	
	  //80~82: B-
	  //83~86: B0
	  //87~89: B+
	
	  //�� ���ϴ� "fail"���  ��ø switch
				
			public void method4() { 
				System.out.print("�����Է�: ");
				int score=sc.nextInt();
				String grade="";
				
				switch(score/10) {
				case 10:
					grade="A+";
				   break;
				case 9: 
					grade="A";
				   switch (score%10) {
				   case 0: case 1: case 2:
				 	grade=grade+"-";
				 	break;
				   case 3: case 4: case 5: case 6:
					grade=grade+"0";
			 		break;
				    case 7: case 8: case 9:
					grade=grade+"+";
					}
					break  ;  
				 case 8: 
				   switch (score%10) {
				   case 0: case 1: case 2:
				 	grade=grade+"-";
				 	break;
				   case 3: case 4: case 5: case 6:
					grade=grade+"0";
			 		break;
				   case 7: case 8: case 9:
				 	grade=grade+"+";
					}
					break ;
				 	
				default :
				grade="fail";
				
				}
				System.out.println("����"+score+"��"+grade+"�����Դϴ�");
				
}
}