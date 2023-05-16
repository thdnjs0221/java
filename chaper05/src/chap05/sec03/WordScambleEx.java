package chap05.sec03;

import java.util.Random;
import java.util.Scanner;

public class WordScambleEx {

	public static void main(String[] args) {
		WordScamble ws= new WordScamble();
		String str= ws.Wordselection();   //���õ� �ܾ�
		//System.out.println(str);
		String question =ws.shuffle(str); //���þ� (�ܾ �ɰ��� ���� �ܾ�)
		System.out.println("���þ�: "+question);
		ws.answer(str);                  //����
	}

}
/*�迭����]  �Ʒ� �ܾ� 5���� �迭�� �����ϰ� ������ �ܾ ������ �� �ܾ� ���� ö�ڸ� ���� ����ڿ��� �����Ѵ�.
����ڴ� ���õ� ö�ڸ� ���� �ܾ ���ߴ� ����
�õ� Ƚ���� ����Ұ� 
[���þ�] hope, apple, banana, orange, love */




class WordScamble{
	private String[] word= {"hope", "apple", "banana", "orange", "love"};  //private�� ���� class �ȿ����� ���� ����
	
	public String Wordselection() {
		Random rnd= new Random();      // ������ �߻���Ű�� ���: math.Random,    import java.util.Random-Random(������ ���� �߻���Ŵ)
		int idx= rnd.nextInt(5);	   // 0~4 ������ ������ ���� �߻� ��Ŵ
		return word[idx]; 			   // word�� idx��° �ִ°��� ��ȯ�ض�
		
}
	public String shuffle(String str) {      //String ���ڿ�
	 char[] ch= str.toCharArray();           //���ڿ����� =>���ڹ迭�� �ٲ���
	 
	 for(int i=0; i<1000; i++) {
		 int r=(int)(Math.random()*ch.length);  //
		 char temp = ch[0];
		 ch[0] = ch[r];
		 ch[r]= temp;
				 
	 }
	 return(new String(ch)); 					 //���ڹ迭- ���ڿ��� �ٲ��ֱ�		 
	}
	public void answer(String question) {        //
		Scanner sc= new Scanner(System.in);
		int count=0; //�õ�Ƚ��
		
		while (true) {
			System.out.print("\n����: ");
			String str=sc.nextLine();
			count++;
			
			if (str.equals(question)) {
				System.out.println("***************");
				System.out.println("�����Դϴ�.....");
				System.out.println("�õ�Ƚ��: "+count);
				System.out.println("***************");
				break;
			}else {
				System.out.println("***************");
				System.out.println("������ �ƴմϴ�.....");
				
			}
		
		}
		}			
}