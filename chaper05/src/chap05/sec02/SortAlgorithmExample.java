package chap05.sec02;

public class SortAlgorithmExample {

	public static void main(String[] args) {
		// ����6] ���� ���� �迭�� �����ϰ�  ũ������� �����Ͻÿ�
        //    �ڷ�: 35,80,25,69,44,51,17,97
		// Bubble Sort ������ ���ڷ��� ũ�⸦ ���Ͽ� �ڸ��� ��ȯ 
		// �ڷᰡ n���϶� n-1ȸ������ //ȸ����ų������ ���� ū�� ������ �ϳ��� ����
		int[] source= {35,80,25,69,44,51,17,97};
	 SortAlgorithm sa=new  SortAlgorithm();
	 sa.bubbleSort(source);
	}
}

class SortAlgorithm{
	//int[] source=new int[8];
	// =      int[] source= {35,80,25,69,44,51,17,97};
	
	public void bubbleSort(int[] target) {
		boolean flag=false;
		int cnt=0;
		for(int i= 0; i<target.length-1; i++) {            //��ȸ��
			flag=false;
			cnt++;
			for(int j=0; j<target.length-1-i; j++) {       //���࿡�� ��
				if(target[j]>target[j+1]) {
					int temp=target[j];
					target[j]=target[j+1];
					target[j+1]=temp;    
					flag=true;
				}
			}
			if(!flag) break;
			
		}
		
		System.out.println("����Ƚ��: "+cnt);
		for(int i=0; i<target.length; i++) {
			System.out.printf("%5d", target[i]);
		}
		
		
		
	}
}
