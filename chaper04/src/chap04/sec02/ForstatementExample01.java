package chap04.sec02;

import java.util.Random;
import java.util.Scanner;

public class ForstatementExample01 {

	public static void main(String[] args) {
		ForStatement fs=new ForStatement();
		//fs.method03();
		fs.method09();

	}
 
}
class ForStatement{
	Scanner sc=new Scanner(System.in);
	private char[] i;
	public void method01() {
		// 1~10������ ���� ���ٿ� ���
		// �� �յ� ���Ͽ� ���
		int sum=0;
		for(int i=0; i<10; i++) {
			System.out.printf("%3d",(i+1));
			sum+=i;
		}
		System.out.println("\nsum= "+sum);
	}

	
	//����2] 1~100 ������ ¦���� �հ� Ȧ���� ���� ���Ͻÿ�
	public void method02() {
		int sumOfEven=0;   //¦���� ��
		int sumOfOdd=0;    //Ȧ���� ��
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;
			}
			
		}
		System.out.println("¦���� ��= "+sumOfEven);
		System.out.println("Ȧ���� ��= "+sumOfOdd);
	}
	
	//����3] ���ڿ��� ������ �Է� �޾� �ش� ���ڿ��� �Էµ� ���ڸ�ŭ �ݺ��Ͽ� ����Ͻÿ�????
	public void method03() {
		System.out.println("���ڿ� �Է�: ");
		String str=sc.nextLine();
		
		System.out.print("���� �Է�: ");
		int count=sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			System.out.print(str+",");
		}
		
	}
	
	//����4] ���ĺ� A~Z������ ���ٷ� �μ��Ͻÿ�
	public void method04() {
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			//=  for(int ch='A'; ch<='Z'; ch++) {
			//   System.out.print((char)ch);
		}
	}
	//����5] 1-50 ������ ������ ����(random number)�� �߻����� �� �������� ���� ���ض�
     public void method05() {
    	 int rnd=(int)(Math.random()*50)+1;
    	 int sum=0;
    	 for(int i = 0; i<rnd; i++){
    		sum=sum+i;
    	 }
    		 System.out.println("1���� "+rnd+ "������ �� = "+sum);
    	 }
    	 
     class Forstatement03{
    	 
     }
    	 
		
		
		

    
   		


     //���� 1] 1/1 + 1/2 + 1/3 +... +1/10 �� ���� ���Ͻÿ�.
     public void method07() {

    	 double sum=0;

    	 for(double i=1; i<=10; i++ ) {
    		 sum+=(1/i);
    	
    	 }
    	 
    	 	System.out.println(sum);
   
     }
    //���� 2] 1-2+3-4+......-10=xx �� ���Ͽ� ����Ͻÿ�
    //��µ� �ݵ�� ���� ���Ĵ�� ����Ұ�
    
    public void method08() { 	
    
    	 int num;
    	 int sum=0;
    	 
    	for(num =1; num<11; num++) {
    	 if(num%2==0) {
    		 sum+=(-num);
    		 System.out.print("-"+num);
    		 
    	}else {
    		sum+=(num);
    		System.out.print("+"+num);
    	}
    	
    	}
    	   System.out.println("= "+sum);
        }


    //���� 3] ��ǻ�Ϳ� ����,����,�� ������ �Ϸ��� �Ѵ� �̸� ���α׷��Ͻÿ�(���� ���)

    public void method09() { 	
    
    int com=(int)(Math.random()*3)+1;
    
    int num=0;
    
    System.out.println("����(1),����(2),��(3)  �Է�: ");
    
    Scanner s=new Scanner(System.in);
    String value=s.next();
    
    switch (value) {
    case "1":
       num=1;
       break;
    case "2":
       num=2;
       break;
    case "3":
       num=3;
       break;
     
    }

    if(num==1 && com==1) {
       System.out.println("����ڴ� ����");
       System.out.println("��ǻ�ʹ� ����");
       System.out.println("�����ϴ�.");
    }else if(num==2 && com==2) {
       System.out.println("����ڴ� ����");
       System.out.println("��ǻ�ʹ� ����");
       System.out.println("�����ϴ�.");
    }else if(num==3 && com==3) {
       System.out.println("����ڴ� ��");
       System.out.println("��ǻ�ʹ� ��");
       System.out.println("�����ϴ�.");   

    }if(num==1 && com==2) {
       System.out.println("����ڴ� ����");
       System.out.println("��ǻ�ʹ� ����");
       System.out.println("�����ϴ�.");
    }else if(num==2 && com==3) {
       System.out.println("����ڴ� ����");
       System.out.println("��ǻ�ʹ� ��");
       System.out.println("�����ϴ�.");
    }else if(num==3 && com==1) {
       System.out.println("����ڴ� ��");
       System.out.println("��ǻ�ʹ� ����");
       System.out.println("�����ϴ�.");   

    }if(num==1 && com==3) {
       System.out.println("����ڴ� ����");
       System.out.println("��ǻ�ʹ� ��");
       System.out.println("�̰���ϴ�.");
    }else if(num==2 && com==1) {
       System.out.println("����ڴ� ����");
       System.out.println("��ǻ�ʹ� ����");
       System.out.println("�����ϴ�.");
    }else if(num==3 && com==2) {
       System.out.println("����ڴ� ��");
       System.out.println("��ǻ�ʹ� ����");
       System.out.println("�̰���ϴ�.");      
    }
      }
        }






