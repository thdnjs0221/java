package chap05.sec02;
import java.util.Scanner;


public class OneDimArrayExample02 {

	public static void main(String[] args) {
		OneDimArray02 od2=new OneDimArray02();
		od2.setName();
		od2.getName();
		od2.exchange();
		

	}

}
//����2] Ű����� 5���� ģ���̸� �Է� �޾� �迭�� �����ϰ� �������� ����Ͻÿ�
class OneDimArray02{
	Scanner sc=new Scanner(System.in);
	
	String[] name = new String [5];   //name�� �ּҰ� ����(���ڿ�x) //������� (���� ������� ��� ���� ����)
	
	public void setName() {             //setname() Ŭ���� ��������� �����ϱ� ���� ����
		for(int i=0; i<name.length; i++) {           
			System.out.print((i+1)+"�̸� �Է�: ");
			name[i]=sc.nextLine();
			
		}
		
	}
	
	public void getName() {
		//for (int i=name.length-1; i>=0; i--) {       //=
		for (int i=0; i<name.length; i++){
			System.out.println(name[(name.length-1)-i]);
			
		}
	}
	//����3] ����2�� ù ��° ģ���̸��� ������ ģ�� �̸��� ���� �ٲٽÿ�    //
	
	public void exchange() {
		String temp=null;
	temp=name[0];
	name[0]=name[4];
	name[4]=temp;
	
	for (String str: name) {           //����� ��ȭ�� for��  name�� str �־���  
		System.out.printf("%5s",str);  // str->name
	}
	}
	
	
	
	
	
}
