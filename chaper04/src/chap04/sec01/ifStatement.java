package chap04.sec01;

import java.util.Scanner;

public class ifStatement {
	static Scanner sc= new Scanner(System.in); //����ʵ�(�������)

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method7();
	}
	public static void method1() {
		//����� �̸��� ������ �Է� �޾� 60�� �̻��̸�
		//  "�̸� �հ��Դϴ�" �޼��� ���
		String message="";
		System.out.print("�̸� �Է�: ");
		String name=sc.nextLine();
		
		System.out.print("�����Է�: ");
		int score= sc.nextInt();
		
		if(score>=60) {
			message= name+"��(��) �հ��Դϴ�.";
			System.out.println(message);
		}
	}
		
	public static void method2() {
		//����� �̸��� ������ �Է� �޾� 60�� �̻��̸�
		//  "�̸� �հ��Դϴ�" �޼��� ���
		// 60�� �����̸�
		// "���հ��Դϴ�" �޼��� ���
		String message="";
		System.out.print("�̸� �Է�: ");
		String name=sc.nextLine();
		//int name= integer.parseInt(sc.nextLine);
		
		System.out.print("�����Է�: ");
		int score= sc.nextInt();
		
		if(score>=60) {
			message= name+"��(��) �հ��Դϴ�.";
		}else {
			message= name+"��(��) ���հ��Դϴ�.";
		}
		System.out.println(message);
	}
	
		// [����] ���� �Է¹޾�
		// 3~5��: "�� �Դϴ�",
		// 6~8��: "���� �Դϴ�",
		// 9~11��: "���� �Դϴ�",
		// 12~2��: "�ܿ� �Դϴ�"�� ����ϴ� ���α׷� �ۼ�
		
	public static void method3() {
		String message="";
		System.out.print("��");
		int month= sc.nextInt();
		
		if (month >= 3 && month <= 5) {
			message= month+"�� �Դϴ�.";
		}else if (month >= 6 && month <= 8){
			message= month+"���� �Դϴ�.";
		}else if (month >= 9 && month <= 11){
			message= month+"���� �Դϴ�.";
		}else {
			message= month+"�ܿ� �Դϴ�.";
		}
		
			
		}
		

		
		
		
		
	
	
	//[����] ü�߰� Ű�� �Է��Ͽ� BMI������ ���ϰ� BMI������ ���� �򰡸� ����ϴ� ���α׷��� �ۼ�
		//BMI����= ü��(kg) / (Ű(m)* Ű(m)
		//BMI����             ����
		//-------------------------
		//0.0 ~ 18.4    ��ü��
		//18.5 ~ 22.9   ����
		//23.0 ~ 24.9 ��ü��
		//30.0 ~ ���̻� ��
		
		public static void method4() {
			String message="";
			System.out.println("ü��");
			int weight= sc.nextInt();
		
			System.out.println("Ű ");
			double height= sc.nextDouble();
			
			double BMI= weight/height*height;
		   
			
			
			if (BMI >= 0.0 && BMI <= 18.4) {
				message= "��ü��";
			}else if (BMI >= 18.5 && BMI <=22.9){
				message= "����";
			}else if (BMI >= 23.0 && BMI <=24.9){
				message= "��ü��";
			}else {
				message= "��";
			System.out.println(" ����"+ message);
				
		
			}
		}
		//[����] �����϶�� �Ѵ� ������ ������ ���̰� 18�� �̻��̸�, �����԰� 50KG �̻��̾���Ѵ�
		// �̸���ø IF���� ����Ͽ� �����Ͻÿ�
		// ���̿� �����Դ� ������(=�����ڻ��)
		
		public static void method5() {
			String message="";
			System.out.println("����:");
			int age= sc.nextInt();
			
			System.out.println("������:");
			int weight= sc.nextInt();
			
			if (age >= 18 ) {
				if(weight>=50) {
					message= "���� ����";
			}else {
				message= "���� �Ұ���";
			}
			}else {
				message= "���� �Ұ���";
			}
			System.out.println(message);
			}
		  // [����] ������ ���� �Է� �޾� Ȧ���� ¦���� �Ǻ��Ͻÿ�
		public static void method6() {
			String message="";
			System.out.println("Random");
			int number= sc.nextInt();
			
			if(number%2==0) {
				message= "¦���Դϴ�";
			}else {
				message= "Ȧ���Դϴ�";
			}
			System.out.println(message);
			}
  
	  
         // [����] ������ �Է¹޾� �� ����
    	 //99-97: A+
    	 //96-93: AO
         //92-90: A-
    	   
    	 //89-87: B+
    	 //86-83: BO
         //82-80: B-
    	   
    	 //79-77: C+
      	 //76-73: CO
         //72-70: C-
    	 //�� ���ϴ� F
        //��ø IF ���
		public static void method7() {
			System.out.println("");
		
			int score=sc.nextInt();
			
			String grade="";
			
			if (score >=90 && score<=99 ) {
				grade= "A";	
			}if(score <= 99 && score>=97) {
			     grade =grade+"+";	
			}if (score <= 96 && score>=93) {
				grade =grade+"0";		
	        }else if (score <= 92 && score>=90) {
				grade =grade+"-";		
			
	        }if (score >=80 && score<=89) {
				grade= "B";	
			}if(score <= 89 && score>=87) {
			     grade =grade+"+";	
			}if (score <= 86 && score>=83) {
				grade =grade+"0";		
	        }else if (score <= 82 && score>=80) {
				grade =grade+"-";
	        
	        }if (score >=70 && score<=79 ) {
				grade= "C";	
			}if(score <= 79 && score>=77) {
			     grade =grade+"+";	
			}if (score <= 76 && score>=73) {
				grade =grade+"0";		
	        }if (score <= 72 && score>=70) {
				grade =grade+"-";
	       
	        }else if (score <= 70) {
				grade =grade+"C";
	        }	
			System.out.println("������"+grade+"�Դϴ�");
		}
		
		public static void method8() {
			String message="";
			System.out.println("");
			String vlaue=sc.nextLine();
			
		   
		}
}
      
		
			
